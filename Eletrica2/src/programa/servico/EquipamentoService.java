package programa.servico;

import java.util.ArrayList;
import java.util.HashMap;

import programa.Equipamento;
import programa.Dao.EquipamentoDao;

public class EquipamentoService {

	private EquipamentoDao dao;

	public EquipamentoService() {
		dao = new EquipamentoDao();
	}

	public void salvar(Equipamento equipamento, int idCir) {

		if (equipamento.getId() != 0) {
			dao.atualizar(equipamento, idCir);
		} else {
			dao.inserir(equipamento);

		}

	}
	
	public void salvar(Equipamento equipamento) {

		if (equipamento.getId() != 0) {
			dao.atualizar(equipamento);
		} else {
			dao.inserir(equipamento);

		}

	}

	public void excluir(Equipamento equipamento) {

		if (equipamento.getId() != 0) {
			dao.excluir(equipamento);
		} else {

		}

	}
	
	public Equipamento registroEmBranco() {
		return dao.registroEmBranco();
	}

	public ArrayList<Equipamento> getEquipamentos(HashMap<Object,Object> dicionario) {
		return dao.filtraEquipamentos(dicionario);
	}

}
