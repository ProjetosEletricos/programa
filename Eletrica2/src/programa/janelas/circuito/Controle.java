package programa.janelas.circuito;

import java.util.HashMap;

import programa.janelas.circuito.extras.CircuitoListModel;
import programa.servico.CircuitoService;

public class Controle {

	private CircuitoFrm frm;

	public Controle(CircuitoFrm frm) {
		this.frm = frm;

		this.iniciaListaCircuitos();
		this.adiciona_ListSelectionListener();
		this.adiciona_ActionListener();
		this.adiciona_KeyListener();

	}

	private void adiciona_ListSelectionListener() {
		new CircuitoListSelectionListener(frm);
	}

	private void adiciona_KeyListener() {
		new CircuitoKeyListener(frm);
	}

	private void adiciona_ActionListener() {
		new CircuitoActionListener(frm);
	}

	private void iniciaListaCircuitos() {

		CircuitoService service = new CircuitoService();
		HashMap<Object, Object> filtro = new HashMap<>();
		filtro.put("idQuadro", frm.getLblIdQuadro().getText());

		//CircuitoListModel model = new CircuitoListModel();
		//model.setCircuitos(service.getCircuitos(filtro));
		frm.setCircuitos(service.getCircuitos(filtro));
//		getListCircuitos().setModel(model);
//		frm.getListCircuitos().updateUI();
	}

}
