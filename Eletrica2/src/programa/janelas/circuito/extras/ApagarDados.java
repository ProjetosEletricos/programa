package programa.janelas.circuito.extras;

import programa.janelas.circuito.CircuitoFrm;

public class ApagarDados {

	private ApagarDados() {
		throw new IllegalStateException("Utility class");
	}

	public static void formu(CircuitoFrm frm) {

		frm.getLblIdcircuito().setText("0");
		frm.getTxtNome().setText("");
	}
}
