package programa.janelas.circuito.extras;

import java.util.ArrayList;
import java.util.HashMap;

import programa.Equipamento;
import programa.janelas.circuito.CircuitoFrm;
import programa.servico.EquipamentoService;

public class Tabela2 {

	private TableModel tableModel;
	private ArrayList<Equipamento> equipamentos;
	private CircuitoFrm frm;

	public Tabela2(CircuitoFrm frm) {

		this.frm = frm;
		this.equipamentos = new ArrayList<>();
		this.tableModel = new TableModel();
	}

	public void filtra(HashMap<Object, Object> filtro) {

		EquipamentoService service = new EquipamentoService();
		frm.getTableEquipamentoCir().updateUI();
		this.equipamentos = service.getEquipamentos(filtro);
		if (!(this.equipamentos.size() == 0)) {
			this.tableModel.setEquipamentos(equipamentos);
			try {
				frm.getTableEquipamentoCir().setModel(this.tableModel);
			} catch (Exception e) {
			}
		} else {
			TableModel model = new TableModel();
			frm.getTableEquipamentoCir().removeAll();
			try {
				frm.getTableEquipamentoCir().setModel(model);
			} catch (Exception e) {
			}
		}
	}

	public TableModel getTableModel() {
		return tableModel;
	}

	public void setTableModel(TableModel tableModel) {
		this.tableModel = tableModel;
	}

	public ArrayList<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(ArrayList<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}

}