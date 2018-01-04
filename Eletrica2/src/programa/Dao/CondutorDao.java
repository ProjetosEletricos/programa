package programa.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dao.DaoHelper;
import dao.QueryMapper;
import programa.Condutor;

public class CondutorDao {

	private DaoHelper daoHelper;

	public CondutorDao() {

		daoHelper = new DaoHelper();

	}

	public int inserir(Condutor condutor) {
		daoHelper.beginTransaction();
		int id = 0;

		try {

			id = daoHelper.executaDaoComRetornoDeChave(
					"insert into alimentador (distAlimentador,modoInstalAlimentador,matAlimentador"
							+ ",quedaTensao,isolAlimentador,bitolasSucessivas,nCirAgrupados"
							+ ",nCamadas,enterrado,espacamentoCabos"
							+ ",multipolar,formaAgrupamento,resistividadeTermica,tempAmbiente) "
							+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
					condutor.getDistAlimentador(), condutor.getModoInstalAlimentador(), condutor.getMatAlimentador(),
					condutor.getQuedaTensao(), condutor.getIsolAlimentador(), condutor.getBitolasSucessivas(),
					condutor.getnCirAgrupados(), condutor.getnCamadas(), condutor.getEnterrado(),
					condutor.getEspacamentoCabos(), condutor.getMultipolar(), condutor.getFormaAgrupamento(),
					condutor.getResistividadeTermica(), condutor.getTempAmbiente());

		} catch (NullPointerException | SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
		condutor.setId(id);
		daoHelper.endTransaction();
		return id;

	}

	public void atualizar(Condutor condutor) {

		final String query = "update equipamento distAlimentador =?,modoInstalAlimentador =?,matAlimentador =?"
				+ ",quedaTensao =?,isolAlimentador =?,bitolasSucessivas =?,nCirAgrupados =?"
				+ ",nCamadas =?,enterrado =?,espacamentoCabos =?"
				+ ",multipolar =?,formaAgrupamento =?,resistividadeTermica =?,tempAmbiente =? where Id = ?";

		try {
			daoHelper.beginTransaction();

			daoHelper.executaDaoSimplesNoContexto(query, condutor.getDistAlimentador(),
					condutor.getModoInstalAlimentador(), condutor.getMatAlimentador(), condutor.getQuedaTensao(),
					condutor.getIsolAlimentador(), condutor.getBitolasSucessivas(), condutor.getnCirAgrupados(),
					condutor.getnCamadas(), condutor.getEnterrado(), condutor.getEspacamentoCabos(),
					condutor.getMultipolar(), condutor.getFormaAgrupamento(), condutor.getResistividadeTermica(),
					condutor.getTempAmbiente(), condutor.getId());

		} catch (NullPointerException | SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
		daoHelper.endTransaction();
	}

	public void excluir(Condutor condutor) {
		daoHelper.beginTransaction();
		try {
			daoHelper.executaDaoSimplesNoContexto("delete from alimentador where Id = ?", condutor.getId());

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

	public ArrayList<Condutor> filtraCondutor(HashMap<Object, Object> filtro) {

		String query = new QueryHashMap(filtro).select("condutor");

		final ArrayList<Condutor> condutores = new ArrayList<Condutor>();

		daoHelper.beginTransaction();

		try {
			daoHelper.executePreparedQueryList(query, new QueryMapper<Condutor>() {

				@Override
				public List<Condutor> mapping(ResultSet rset) {
					try {
						while (rset.next()) {

							Condutor condutor = new Condutor();
							condutor.setId(0);
							condutor.setDistAlimentador(0);
							condutor.setModoInstalAlimentador("");
							condutor.setMatAlimentador("");
							condutor.setQuedaTensao(0);
							condutor.setIsolAlimentador("");
							condutor.setBitolasSucessivas("");
							condutor.setnCirAgrupados(0);
							condutor.setnCamadas(0);
							condutor.setEnterrado("");
							condutor.setEspacamentoCabos("");
							condutor.setMultipolar("");
							condutor.setFormaAgrupamento("");
							condutor.setResistividadeTermica(0);
							condutor.setTempAmbiente(0);
							// ----------------------------//
							condutores.add(condutor);

						}
					} catch (SQLException e) {
						System.out.println("Erro no rset.next() em EquipamentoDao()/fltraEquipamentos() : " + e);
					}
					return condutores;
				}

			});
		} catch (NumberFormatException | NullPointerException | SQLException e) {
			System.out.println("Erro no daoHelper.executePreparedQuery() em EquipamentoDao()/fltraEquipamentos() : ");
			e.printStackTrace();
		}

		daoHelper.endTransaction();
		return condutores;

	}

	public ArrayList<Condutor> registroEmBranco() {

		ArrayList<Condutor> registro = new ArrayList<>();

		Condutor condutor = new Condutor();

		condutor.setId(0);
		condutor.setDistAlimentador(0);
		condutor.setModoInstalAlimentador("");
		condutor.setMatAlimentador("");
		condutor.setQuedaTensao(0);
		condutor.setIsolAlimentador("");
		condutor.setBitolasSucessivas("");
		condutor.setnCirAgrupados(0);
		condutor.setnCamadas(0);
		condutor.setEnterrado("");
		condutor.setEspacamentoCabos("");
		condutor.setMultipolar("");
		condutor.setFormaAgrupamento("");
		condutor.setResistividadeTermica(0);
		condutor.setTempAmbiente(0);

		return registro;
	}

}
