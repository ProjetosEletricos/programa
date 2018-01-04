package programa.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import auxiliar.Data;
import dao.DaoHelper;
import dao.QueryMapper;
import programa.Projeto;

public class ProjetoDao {

	private DaoHelper daoHelper;

	public ProjetoDao() {
		daoHelper = new DaoHelper();
	}

	public void inserir(Projeto projeto) {

		daoHelper.beginTransaction();

		int id = 0;

		try {
			id = daoHelper.executaDaoComRetornoDeChave(
					"insert into projeto (Nome,Descricao,Data,Autor) values (?,?,?,?)", projeto.getNome(),
					projeto.getDescricao(), Data.DataToString(projeto.getData()), projeto.getAutor());

		} catch (NullPointerException | SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
		projeto.setId(id);
		daoHelper.endTransaction();
	}

	public void atualizar(Projeto projeto) {

		final String query = "update projeto set Nome = ?, Data = ?, Descricao = ?, Autor = ? where Id = ?";

		daoHelper.beginTransaction();

		try {
			daoHelper.executaDaoSimplesNoContexto(query, projeto.getNome(), Data.DataToString(projeto.getData()), projeto.getDescricao(),
					projeto.getAutor(),projeto.getId());
		} catch (NullPointerException | SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
		daoHelper.endTransaction();
	}

	public void excluir(Projeto projeto) {
		daoHelper.beginTransaction();
		try {

			daoHelper.executaDaoSimplesNoContexto("delete from projeto where Id = ?", projeto.getId());

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
	
	public ArrayList<Projeto> filtraProjetos(HashMap<Object, Object> filtro) {

		String query = new QueryHashMap(filtro).select("projeto");

		final ArrayList<Projeto> projetos = new ArrayList<>();

		daoHelper.beginTransaction();

		try {
			daoHelper.executePreparedQueryList(query, new QueryMapper<Projeto>() {

				@Override
				public List<Projeto> mapping(ResultSet rset) {
					try {
						while (rset.next()) {

							Projeto projeto = new Projeto();
							projeto.setId(rset.getInt("Id"));
							projeto.setAutor(rset.getString("Autor"));
							projeto.setNome(rset.getString("Nome"));
							projeto.setDescricao(rset.getString("Descricao"));
							projeto.setData(Data.stringToData((rset.getString("Data"))));
							// ----------------------------//
							projetos.add(projeto);

						}
					} catch (ArrayIndexOutOfBoundsException | NullPointerException | SQLException e) {
						System.out.println("Erro no rset.next() em projetoDao()/fltraProjetos() : " + e);
					}
					return projetos;
				}

			});
		} catch (NumberFormatException | NullPointerException | SQLException e) {
			System.out.println("Erro no daoHelper.executePreparedQuery() em projetoDao()/fltraProjetos() : ");
			e.printStackTrace();
		}

		daoHelper.endTransaction();
		return projetos;

	}

	public ArrayList<Projeto> registroEmBranco() {

		ArrayList<Projeto> registro = new ArrayList<>();
		Projeto projeto = new Projeto();

		projeto.setId(0);
		projeto.setAutor("");
		projeto.setNome("");
		projeto.setData(Data.stringToData(Data.Atual()));

		registro.add(projeto);

		return registro;
	}
}

