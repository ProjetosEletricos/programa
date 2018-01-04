package programa.janelas.projeto.extras;

import java.util.ArrayList;
import java.util.HashMap;

import programa.Projeto;

import programa.janelas.projeto.ProjetoFrm;
import programa.servico.ProjetoService;

public class Tabela {

	private ProjetoTableModel tableModel;
	private ArrayList<Projeto> projetos;
	private ProjetoFrm frm;

	public Tabela(ProjetoFrm frm) {

		this.frm = frm;
		this.projetos = new ArrayList<>();
		this.tableModel = new ProjetoTableModel();
	}

	public void filtra(HashMap<Object, Object> filtro) {

		ProjetoService service = new ProjetoService();
		frm.getTableProjetos().updateUI();
		this.projetos = service.getProjetos(filtro);
		if (!(this.projetos.size() == 0)) {
			this.tableModel.setProjetos(projetos);
			try {
				frm.getTableProjetos().setModel(this.tableModel);
			} catch (Exception e) {
			}
		} else {
			ProjetoTableModel model = new ProjetoTableModel();
			frm.getTableProjetos().removeAll();
			try {
				frm.getTableProjetos().setModel(model);
			} catch (Exception e) {
			}
		}
	}

	public ProjetoTableModel getTableModel() {
		return tableModel;
	}

	public void setTableModel(ProjetoTableModel tableModel) {
		this.tableModel = tableModel;
	}

	public ArrayList<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(ArrayList<Projeto> projetos) {
		this.projetos = projetos;
	}

	public Projeto getSelectedProjeto() {

	}

}