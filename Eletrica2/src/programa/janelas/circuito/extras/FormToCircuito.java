package programa.janelas.circuito.extras;

import programa.Circuito;
import programa.janelas.circuito.CircuitoFrm;

public class FormToCircuito {

	public static Circuito copia(CircuitoFrm frmCir) {

		Circuito circuito = new Circuito();

		if (!(frmCir.getLblIdcircuito().getText().equals("0"))) {
			circuito.setId(Integer.parseInt(frmCir.getLblIdcircuito().getText()));
		}

		circuito.setNome(frmCir.getTxtNome().getText());

		return circuito;
	}
}