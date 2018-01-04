package programa.janelas.quadro.extras;

import java.util.ArrayList;
import java.util.HashMap;

import programa.Quadro;
import programa.janelas.quadro.QuadroFrm;
import programa.servico.QuadroService;

public class Tabela {

	private QuadroTableModel tableModel;
	private ArrayList<Quadro> quadros;
	private QuadroFrm frm;

	public Tabela(QuadroFrm frm) {

		this.frm = frm;
		this.quadros = new ArrayList<>();
		this.tableModel = new QuadroTableModel();
	}

	public void filtra(HashMap<Object, Object> filtro) {

		QuadroService service = new QuadroService();
		frm.getTableQuadro().updateUI();
		this.quadros = service.getQuadros(filtro);
		if (!(this.quadros.size() == 0)) {
			this.tableModel.setQuadros(quadros);
			try {
				frm.getTableQuadro().setModel(this.tableModel);
			} catch (Exception e) {
			}
		} else {
			QuadroTableModel model = new QuadroTableModel();
			frm.getTableQuadro().removeAll();
			try {
				frm.getTableQuadro().setModel(model);
			} catch (Exception e) {
			}
		}
	}

	public QuadroTableModel getTableModel() {
		return tableModel;
	}

	public void setTableModel(QuadroTableModel tableModel) {
		this.tableModel = tableModel;
	}

	public ArrayList<Quadro> getQuadros() {
		return quadros;
	}

	public void setQuadros(ArrayList<Quadro> quadros) {
		this.quadros = quadros;
	}

}