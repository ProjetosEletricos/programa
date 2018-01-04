package programa.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dao.DaoHelper;
import dao.QueryMapper;
import programa.Circuito;

public class CircuitoDao {

	protected DaoHelper daoHelper;

	public CircuitoDao() {

		daoHelper = new DaoHelper();

	}

	public void inserir(Circuito circuito, int idQuadro) {
		daoHelper.beginTransaction();
		int id = 0;
		try {

			id = daoHelper.executaDaoComRetornoDeChave("insert into circuito (idQuadro, nome) " + "values (?,?)", idQuadro,
					circuito.getNome());

		} catch (NullPointerException | SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
		circuito.setId(id);

		// inserirQuadroCircuito(quadro);
		// inserirAlimentadorQuadro(quadro);

		daoHelper.endTransaction();

	}

	public void atualizar(Circuito circuito, int idQuadro) {

		final String query = "update circuito set idQuadro = ?,nome =? where Id=?";

		daoHelper.beginTransaction();

		try {
			daoHelper.executaDaoSimplesNoContexto(query, idQuadro, circuito.getNome(), circuito.getId());

		} catch (NullPointerException | SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
		daoHelper.endTransaction();
	}

	public void excluir(Circuito circuito) {
		daoHelper.beginTransaction();

		try {
			daoHelper.executaDaoSimplesNoContexto("delete from circuito where Id = ?", circuito.getId());

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

	public ArrayList<Circuito> filtraCircuito(HashMap<Object, Object> filtro) {

		String query = new QueryHashMap(filtro).select("circuito");

		final ArrayList<Circuito> circuitos = new ArrayList<>();

		daoHelper.beginTransaction();

		try {
			daoHelper.executePreparedQueryList(query, new QueryMapper<Circuito>() {

				@Override
				public List<Circuito> mapping(ResultSet rset) {
					try {
						while (rset.next()) {

							Circuito circuito = new Circuito();
							circuito.setId(rset.getInt("Id"));
							circuito.setNome(rset.getString("Nome"));

							// ----------------------------//
							circuitos.add(circuito);

						}
					} catch (ArrayIndexOutOfBoundsException | NullPointerException | SQLException e) {
						System.out.println("Erro no rset.next() em circuitoDao()/fltraCircuitos() : " + e);
					}
					return circuitos;
				}

			});
		} catch (NumberFormatException | NullPointerException | SQLException e) {
			System.out.println("Erro no daoHelper.executePreparedQuery() em CircuitoDao()/fltraCircuitos() : ");
			e.printStackTrace();
		}

		daoHelper.endTransaction();
		return circuitos;

	}

	public ArrayList<Circuito> registroEmBranco() {

		ArrayList<Circuito> registro = new ArrayList<>();
		Circuito circuito = new Circuito();

		circuito.setId(0);
		circuito.setNome("");

		registro.add(circuito);

		return registro;
	}

}
