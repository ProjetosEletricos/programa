package programa.janelas.circuito.extras;

import programa.Circuito;
import programa.janelas.projeto.ProjetoFrm;

public class FormToCircuito {

	private FormToCircuito() {

		throw new IllegalStateException("Utility class");
	}

	public static Circuito copia(ProjetoFrm frm) {

		Circuito circuito = new Circuito();

		circuito.setId(Integer.parseInt(frm.getLblIdCircuito().getText()));
		circuito.setNome(frm.getTxtNomeCircuito().getText());

		return circuito;
	}

}
