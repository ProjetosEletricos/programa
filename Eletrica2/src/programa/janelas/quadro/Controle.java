package programa.janelas.quadro;

import java.util.HashMap;

import programa.janelas.quadro.extras.QuadroTableModel;
import programa.servico.QuadroService;

public class Controle {

	private QuadroFrm frm;

	public Controle(QuadroFrm frm) {
		this.frm = frm;

		this.adiciona_ActionListener();
		this.adiciona_ListSelectionListener();
		this.adiciona_KeyListener();
		this.adiciona_MouseListener();
		this.iniciaListaQuadros();

	}

	private void adiciona_ListSelectionListener() {
		new QuadroListSelectionListener(frm);
	}

	private void adiciona_KeyListener() {
		new QuadroKeyListener(frm);
	}

	private void adiciona_ActionListener() {
		new QuadroActionListener(frm);
	}

	private void adiciona_MouseListener() {
		new QuadroMouseListener(frm);
	}

	private void iniciaListaQuadros() {

		QuadroService service = new QuadroService();
		HashMap<Object, Object> filtro = new HashMap<>();
		filtro.put("idFonte", frm.getLblIdFonte().getText());
		QuadroTableModel model = new QuadroTableModel();
		model.setQuadros(service.getQuadros(filtro));
		frm.getTableQuadro().setModel(model);
		frm.getTableQuadro().updateUI();
	}

}
