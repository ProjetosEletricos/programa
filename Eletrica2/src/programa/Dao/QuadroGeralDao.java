package programa.Dao;

import java.sql.SQLException;

import programa.Quadro;
import dao.CreateDaoException;

public class QuadroGeralDao extends QuadroDao {

	public QuadroGeralDao() {

		super();
	}

	public void inserir(Quadro quadro, int idFonte) {

		try {

			daoHelper.beginTransaction();

			long id = daoHelper.executaDaoComRetornoDeChave(daoHelper.getConnectionFromContext(),
					"insert into quadro (idFonte,nome,local,drGeral,pot100PercDem,fd,fp,Usabilidade) "
							+ "values (?,?,?,?,?,?,?,?)",
					idFonte, quadro.getNome(), quadro.getLocal(), quadro.getDrGeral(), quadro.getPot100PercDem(),
					quadro.getFd(), quadro.getFp(), quadro.getUsabilidade());

			quadro.setId(id);
			inserirQuadroQuadro(quadro);
			super.inserirAlimentadorQuadro(quadro);

			// daoHelper.endTransaction();

		} catch (SQLException e) {

			daoHelper.rollbackTransaction();
			throw new CreateDaoException("Não foi possivel realizar a transação", e);
		}

	}

	private void inserirQuadroQuadro(Quadro quadro) throws SQLException {

		QuadroDao quadroDao = new QuadroDao();

		for (int i = 0; i < quadro.getQuadro().size(); i++) {
			quadroDao.inserir(quadro.getQuadro().get(i), quadro.getId());

		}
	}

}