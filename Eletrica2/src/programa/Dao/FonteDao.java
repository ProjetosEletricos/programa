package programa.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import auxiliar.Numero;
import dao.DaoHelper;
import dao.QueryMapper;
import programa.Fonte;

public class FonteDao {

	private DaoHelper daoHelper;

	public FonteDao() {

		daoHelper = new DaoHelper();

	}

	public void inserir(Fonte fonte, int idProjeto) {

		daoHelper.beginTransaction();

		int id = 0;
		try {

			id = daoHelper.executaDaoComRetornoDeChave(
					"insert into fonte (idProjeto, concessionaria, tensaoNominalFN) values (?,?,?)", idProjeto,
					fonte.getConcessionaria(), fonte.getTensaoFN());
		} catch (NullPointerException | SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}

		fonte.setId(id);

		daoHelper.endTransaction();

	}

	public void atualizar(Fonte fonte, int idProjeto) {

		daoHelper.beginTransaction();

		final String query = "update fonte set idProjeto = ?, tensaoNominalFN = ?, concessionaria = ? where Id=?";

		try {
			daoHelper.executaDaoSimplesNoContexto(query, idProjeto, fonte.getTensaoFN(), fonte.getConcessionaria(),
					fonte.getId());
		} catch (NullPointerException | SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}

		daoHelper.endTransaction();
	}

	public void excluir(Fonte fonte) {

		daoHelper.beginTransaction();

		try {

			daoHelper.executaDaoSimplesNoContexto("delete from fonte where Id = ?", fonte.getId());

		} catch (SQLException e) {
			System.out.println("Erro em excluir: ");
			e.getMessage();
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro em excluir: ");
			e.getMessage();
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Erro em excluir: ");
			e.getMessage();
			e.printStackTrace();
		}
		daoHelper.endTransaction();

	}

	public ArrayList<Fonte> filtraFontes(HashMap<Object, Object> filtro) {

		String query = new QueryHashMap(filtro).select("fonte");

		final ArrayList<Fonte> fontes = new ArrayList<>();

		daoHelper.beginTransaction();

		try {
			daoHelper.executePreparedQueryList(query, new QueryMapper<Fonte>() {

				@Override
				public List<Fonte> mapping(ResultSet rset) {
					try {
						while (rset.next()) {

							Fonte fonte = new Fonte();
							fonte.setId(rset.getInt("Id"));
							fonte.setConcessionaria(rset.getString("concessionaria"));
							fonte.setTensaoFN(Numero.stringToDouble((rset.getString("tensaoNominalFN"))));
							// ----------------------------//
							fontes.add(fonte);

						}
					} catch (ArrayIndexOutOfBoundsException | NullPointerException | SQLException e) {
						System.out.println("Erro no rset.next() em FonteDao()/fltraFontes() : " + e);
					}
					return fontes;
				}

			});
		} catch (NumberFormatException | NullPointerException | SQLException e) {
			System.out.println("Erro no daoHelper.executePreparedQuery() em FonteDao()/fltraFontes() : ");
			e.printStackTrace();
		}

		daoHelper.endTransaction();
		return fontes;

	}

}