package programa.janelas.circuito.extras;

import programa.Circuito;
import programa.janelas.circuito.CircuitoFrm;


public class CircuitoToForm {

	private CircuitoToForm() {
		throw new IllegalStateException("Utility class");
	}

	public static void copia(Circuito circuito, CircuitoFrm frm) {

		frm.getLblIdcircuito().setText(Integer.toString(circuito.getId()));
		frm.getTxtNome().setText(circuito.getNome());

	}
}
