package programa.Dao;

import java.sql.*;

import Programa.Circuito;
import dao.CreateDaoException;
import dao.DaoHelper;

public class DadosCurtoCircuitoDao {

	private DaoHelper daoHelper;

	public DadosCurtoCircuitoDao() {

		daoHelper = new DaoHelper();

	}

	public void inserir(Circuito circuito, long idQua) throws CreateDaoException {

		try {

			daoHelper.beginTransaction();

			long id = daoHelper.executePreparedUpdateAndReturnGeneratedKeys(daoHelper.getConnectionFromContext(),
					"insert into circuito (idQua,CircuitoNome,Tipo,TemperaturaCircuito,DistParaQuadroMetros"
							+ ",QTCircuitoPorc,MaterialCondutor,Isolacao,MetodoInstalacao"
							+ ",NCirOuCabosMultAgrupados,FormaAgrupamento,NDeCamadas"
							+ ",CaboMultipolar,Enterrado,EspacamentoDosCabos,BitolasSucessivas"
							+ ",CorrDeCurtoKA,TempoElimDeDefeitoSeg,TemperaturaMaxDeCurtoCircuitoDoCondCelsius"
							+ ",TemperaturaMaxAdmissivelEmRegimeNormalDoCondCelsius,CaboTerra,ResistividadeTermicaKmW) "
							+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
					idQua, circuito.getNome(), circuito.getTipo(), circuito.getTempAmbiente(),
					circuito.getDistParaQuadro(), circuito.getQt(), circuito.getMaterialCond(), circuito.getIsolacao(),
					circuito.getModoInstal(), circuito.getnCirAgrupados(), circuito.getFormaAgrupamento(),
					circuito.getnCamadas(), circuito.getMultipolar(), circuito.getEnterrado(),
					circuito.getEspacamentoCabos(), circuito.getBitolasSucessivas(), circuito.getCorrenteCurto(),
					circuito.getTempoElimDef(), circuito.getTempMaxCurto(), circuito.getTempAdmissRegime(),
					circuito.getTerra(), circuito.getResistividadeTermica());

			circuito.setId(id);
			inserirCircuitoEquipamento(circuito);
			//daoHelper.endTransaction();

		} catch (SQLException e) {

			daoHelper.rollbackTransaction();
			throw new CreateDaoException("Não foi possivel realizar a transação", e);
		}

	}

	private void inserirCircuitoEquipamento(Circuito circuito) throws SQLException {

		EquipamentoDao equipamentoDao = new EquipamentoDao();

		for (int i = 0; i < circuito.getEquipamento().size(); i++) {
			equipamentoDao.inserir(circuito.getEquipamento().get(i), circuito.getId());

		}

	}
}