package programa.janelas.circuito.extras;

import programa.Circuito;
import programa.janelas.projeto.ProjetoFrm;

public class CircuitoToForm {

	private CircuitoToForm() {
		throw new IllegalStateException("Utility class");
	}

	public static void copia(Circuito circuito, ProjetoFrm frm) {
		
		if (circuito != null) {
			frm.getLblIdCircuito().setText(Integer.toString(circuito.getId()));
			frm.getTxtNomeCircuito().setText(circuito.getNome());

		}
	}
}
