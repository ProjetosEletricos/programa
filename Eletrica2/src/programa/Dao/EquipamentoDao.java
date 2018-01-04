package programa.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dao.DaoHelper;
import dao.DeleteDaoException;
import dao.QueryMapper;
import programa.Equipamento;

public class EquipamentoDao {

	private DaoHelper daoHelper;

	public EquipamentoDao() {

		daoHelper = new DaoHelper();

	}

	private void inserir(Equipamento equipamento, int idCir) {

		daoHelper.beginTransaction();

		int id = 0;

		try {
			id = daoHelper.executaDaoComRetornoDeChave(
					"insert into equipamento (idCir,Equipamento,Usabilidade,LocalOuDescricao,nPolosMotor"
							+ ",Qtd,Potencia,PotUnidade,LigacaoDoEquipamento,PerdasReatorW,Fp,RendiMotor"
							+ ",Fd,FtutilMotor,Fs,Fsm) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
					idCir, equipamento.getNome(), equipamento.getUsabilidade(), equipamento.getDescricao(),
					equipamento.getnPolos(), equipamento.getQuantidade(), equipamento.getPotencia(),
					equipamento.getUnidade(), equipamento.getLigacao(), equipamento.getPerdasReator(),
					equipamento.getFp(), equipamento.getRendimento(), equipamento.getFd(), equipamento.getFu(),
					equipamento.getFs(), equipamento.getfSimu());

			equipamento.setId(id);


		} catch (NullPointerException | NumberFormatException | SQLException e) {
			System.out.println("Erro em EquipamentoDao()/inserir() " + e);

		}



	}

	public void inserir(Equipamento equipamento) {

		this.inserir(equipamento, 0);
		daoHelper.endTransaction();
	}

	public void atualizar(Equipamento equipamento, int idCir) {

		final String query = "update equipamento set idCir = ?, Equipamento = ?,Usabilidade = ?,"
				+ "LocalOuDescricao = ?,nPolosMotor = ?,Qtd = ?,Potencia = ?,PotUnidade = ?,"
				+ "LigacaoDoEquipamento = ?,PerdasReatorW = ?,Fp = ?,RendiMotor = ?, Fd = ?,"
				+ "FtutilMotor = ?,Fs = ?,Fsm = ? where Id = ?";

		
		daoHelper.beginTransaction();
		
		try {
			

			daoHelper.executaDaoSimplesNoContexto(query, idCir, equipamento.getNome(), equipamento.getUsabilidade(),
					equipamento.getDescricao(), equipamento.getnPolos(), equipamento.getQuantidade(),
					equipamento.getPotencia(), equipamento.getUnidade(), equipamento.getLigacao(),
					equipamento.getPerdasReator(), equipamento.getFp(), equipamento.getRendimento(),
					equipamento.getFd(), equipamento.getFu(), equipamento.getFs(), equipamento.getfSimu(),
					equipamento.getId());

		} catch (NullPointerException | NumberFormatException e) {
			System.out.println("Valores com Null ou '': " + e);

		} catch (SQLException e) {
			System.out.println("Query incorreta em atualizar()" + e);
		}
		daoHelper.endTransaction();
	}

	public void atualizar(Equipamento equipamento) {
		this.atualizar(equipamento, 0);

	}

	public void excluir(Equipamento equipamento) {
		try {
			daoHelper.beginTransaction();

			daoHelper.executaDaoSimplesNoContexto("delete from equipamento where Id = ? ", equipamento.getId());

		} catch (SQLException e) {
			throw new DeleteDaoException("Não foi possível excluir equipamento", e);
		}
		daoHelper.endTransaction();
	}

	public ArrayList<Equipamento> filtraEquipamentos(HashMap<Object, Object> dicionario) {

		String query = new QueryHashMap(dicionario).select("equipamento");

		final ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();

		daoHelper.beginTransaction();

		try {
			daoHelper.executePreparedQueryList(query, new QueryMapper<Equipamento>() {

				@Override
				public List<Equipamento> mapping(ResultSet rset) {
					try {
						while (rset.next()) {

							Equipamento equipamento = new Equipamento();
							equipamento.setId(rset.getInt("Id"));
							equipamento.setNome(rset.getString("Equipamento"));
							equipamento.setDescricao(rset.getString("LocalOuDescricao"));
							equipamento.setQuantidade(rset.getInt("Qtd"));
							equipamento.setPotencia(rset.getDouble("Potencia"));
							equipamento.setUnidade(rset.getString("PotUnidade"));
							equipamento.setnPolos(rset.getInt("nPolosMotor"));
							equipamento.setLigacao(rset.getString("LigacaoDoEquipamento"));
							equipamento.setUsabilidade(rset.getString("Usabilidade"));
							equipamento.setPerdasReator(rset.getDouble("PerdasReatorW"));
							equipamento.setFp(rset.getDouble("Fp"));
							equipamento.setRendimento(rset.getDouble("RendiMotor"));
							equipamento.setFd(rset.getDouble("Fd"));
							equipamento.setFu(rset.getDouble("FtutilMotor"));
							equipamento.setFs(rset.getDouble("Fs"));
							equipamento.setfSimu(rset.getDouble("Fsm"));
							// ----------------------------//
							equipamentos.add(equipamento);

						}
					} catch (SQLException e) {
						System.out.println("Erro no rset.next() em EquipamentoDao()/fltraEquipamentos() : " + e);
					}
					return equipamentos;
				}

			});
		} catch (NumberFormatException | NullPointerException | SQLException e) {
			System.out.println("Erro no daoHelper.executePreparedQuery() em EquipamentoDao()/fltraEquipamentos() : ");
			e.printStackTrace();
		}

		daoHelper.endTransaction();
		return equipamentos;

	}

	public Equipamento registroEmBranco() {

		Equipamento equipamento = new Equipamento();

		equipamento.setId(0);
		equipamento.setNome("");
		equipamento.setDescricao("");
		equipamento.setQuantidade(0);
		equipamento.setPotencia(0);
		equipamento.setUnidade("");
		equipamento.setnPolos(4);
		equipamento.setLigacao("");
		equipamento.setUsabilidade("");
		equipamento.setPerdasReator(0);
		equipamento.setFp(0);
		equipamento.setRendimento(0);
		equipamento.setFd(0);
		equipamento.setFu(0);
		equipamento.setFs(0);
		equipamento.setfSimu(0);

		return equipamento;
	}

}