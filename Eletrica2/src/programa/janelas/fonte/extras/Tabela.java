package programa.janelas.fonte.extras;

import java.util.ArrayList;
import java.util.HashMap;

import programa.Fonte;
import programa.janelas.fonte.FonteFrm;
import programa.servico.FonteService;

public class Tabela {

	private FonteTableModel tableModel;
	private ArrayList<Fonte> fontes;
	private FonteFrm frm;

	public Tabela(FonteFrm frm) {

		this.frm = frm;
		this.fontes = new ArrayList<>();
		this.tableModel = new FonteTableModel();
	}

	public void filtra(HashMap<Object, Object> filtro) {

		FonteService service = new FonteService();
		frm.getTableFontes().updateUI();
		this.fontes = service.getFontes(filtro);
		if (!(this.fontes.size() == 0)) {
			this.tableModel.setFontes(fontes);
			try {
				frm.getTableFontes().setModel(this.tableModel);
			} catch (Exception e) {
			}
		} else {
			FonteTableModel model = new FonteTableModel();
			frm.getTableFontes().removeAll();
			try {
				frm.getTableFontes().setModel(model);
			} catch (Exception e) {
			}
		}
	}

	public FonteTableModel getTableModel() {
		return tableModel;
	}

	public void setTableModel(FonteTableModel tableModel) {
		this.tableModel = tableModel;
	}

	public ArrayList<Fonte> getFontes() {
		return fontes;
	}

	public void setFontes(ArrayList<Fonte> fontes) {
		this.fontes = fontes;
	}

}