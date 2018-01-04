package programa.janelas.projeto;

import java.util.HashMap;

import auxiliar.Data;
import programa.janelas.projeto.extras.ProjetoTableModel;
import programa.servico.ProjetoService;

public class ProjetoControle {

	private ProjetoFrm frm;

	public ProjetoControle(ProjetoFrm frm) {
		this.frm = frm;
		this.iniciaListaProjetos();
		this.adicionaActionListener();
		this.adicionaListSelectionListener();
		this.adicionaMouseListener();
		this.dataAtual();
	}

	private void adicionaActionListener() {
		new ProjetoActionListener(frm);
	}

	private void adicionaListSelectionListener() {
		new ProjetoListSelectionListener(frm);
	}

	private void dataAtual() {
		frm.getTxtData().setText(Data.Atual());
	}

	private void adicionaMouseListener() {
		new ProjetoMouseListener(frm);
	}

	private void iniciaListaProjetos() {

		ProjetoService service = new ProjetoService();
		ProjetoTableModel model = new ProjetoTableModel();
		model.setProjetos(service.getProjetos(new HashMap<>()));
		frm.getTableProjetos().setModel(model);
		frm.getTableProjetos().updateUI();
	}

}
