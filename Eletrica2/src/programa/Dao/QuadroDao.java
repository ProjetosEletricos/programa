package programa.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import auxiliar.Numero;
import dao.DaoHelper;
import dao.QueryMapper;
import dao.UpdateDaoException;
import programa.Quadro;

public class QuadroDao {

	protected DaoHelper daoHelper;

	public QuadroDao() {

		daoHelper = new DaoHelper();

	}

	public void inserir(Quadro quadro, int idFonte) {
		daoHelper.beginTransaction();
		int id = 0;
		try {

			id = daoHelper.executaDaoComRetornoDeChave(
					"insert into quadro (idFonte, nome,local,drGeral,pot100PercDem,fd,fp,Usabilidade) "
							+ "values (?,?,?,?,?,?,?,?)",
					idFonte, quadro.getNome(), quadro.getLocal(), quadro.getDrGeral(), quadro.getPot100PercDem(),
					quadro.getFd(), quadro.getFp(), quadro.getUsabilidade());

		} catch (NullPointerException | SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
		quadro.setId(id);

		// inserirQuadroCircuito(quadro);
		// inserirAlimentadorQuadro(quadro);

		daoHelper.endTransaction();

	}

	public void inserirAlimentadorQuadro(Quadro quadro) throws UpdateDaoException {

		CondutorDao alimentadorDao = new CondutorDao();

		long idAlimentador = alimentadorDao.inserir(quadro.getAlimentador());

		try {
			daoHelper.executaDaoSimplesNoContexto("update quadro set idAlimentador = ? where id = ? ", idAlimentador,
					quadro.getId());

		} catch (SQLException e) {
			daoHelper.rollbackTransaction();
			throw new UpdateDaoException("Não foi possível atualizar Quadro", e);
		}

	}

	public void inserirQuadroCircuito(Quadro quadro) throws SQLException {

		CircuitoDao circuitoDao = new CircuitoDao();

		for (int i = 0; i < quadro.getCircuito().size(); i++) {
			circuitoDao.inserir(quadro.getCircuito().get(i), quadro.getId());

		}

	}

	public void atualizar(Quadro quadro, int idFonte) {
		daoHelper.beginTransaction();

		final String query = "update quadro set idFonte = ?,nome =?,local =?,drGeral =?,pot100PercDem =?,fd =?,fp =?,Usabilidade =? where Id=?";
		try {
			daoHelper.executaDaoSimplesNoContexto(query, idFonte, quadro.getNome(), quadro.getLocal(),
					quadro.getDrGeral(), quadro.getPot100PercDem(), quadro.getFd(), quadro.getFp(),
					quadro.getUsabilidade(), quadro.getId());

		} catch (NullPointerException | SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
		daoHelper.endTransaction();
	}

	public void excluir(Quadro quadro) {
		daoHelper.beginTransaction();

		try {
			daoHelper.executaDaoSimplesNoContexto("delete from quadro where Id = ?", quadro.getId());

		} catch (SQLException e) {
			System.out.println("Erro em excluir");
			e.getMessage();
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro em excluir");
			e.getMessage();
			e.printStackTrace();
		}
		daoHelper.endTransaction();
	}

	public ArrayList<Quadro> filtraQuadros(HashMap<Object, Object> filtro) {

		String query = new QueryHashMap(filtro).select("quadro");

		final ArrayList<Quadro> quadros = new ArrayList<>();

		daoHelper.beginTransaction();

		try {
			daoHelper.executePreparedQueryList(query, new QueryMapper<Quadro>() {

				@Override
				public List<Quadro> mapping(ResultSet rset) {
					try {
						while (rset.next()) {

							Quadro quadro = new Quadro();
							quadro.setId(rset.getInt("Id"));
							quadro.setDrGeral(rset.getString("drGeral"));
							quadro.setFd(Numero.stringToDouble((rset.getString("fd"))));
							quadro.setFp(Numero.stringToDouble((rset.getString("fp"))));
							quadro.setPot100PercDem(Numero.stringToDouble((rset.getString("pot100PercDem"))));
							quadro.setLocal(rset.getString("local"));
							quadro.setNome(rset.getString("nome"));
							quadro.setUsabilidade(rset.getString("Usabilidade"));
							// ----------------------------//
							quadros.add(quadro);

						}
					} catch (ArrayIndexOutOfBoundsException | NullPointerException | SQLException e) {
						System.out.println("Erro no rset.next() em QuadroDao()/fltraQuadros() : " + e);
					}
					return quadros;
				}

			});
		} catch (NumberFormatException | NullPointerException | SQLException e) {
			System.out.println("Erro no daoHelper.executePreparedQuery() em QuadroDao()/fltraQuadros() : ");
			e.printStackTrace();
		}

		daoHelper.endTransaction();
		return quadros;

	}

	public ArrayList<Quadro> registroEmBranco() {

		ArrayList<Quadro> registro = new ArrayList<>();
		Quadro quadro = new Quadro();

		quadro.setId(0);
		quadro.setDrGeral("Não");
		quadro.setFd(0);
		quadro.setFp(0);
		quadro.setPot100PercDem(0);
		quadro.setLocal("");
		quadro.setNome("");
		quadro.setUsabilidade("");

		registro.add(quadro);

		return registro;
	}

}
