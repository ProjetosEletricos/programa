package programa.janelas.fonte.extras;

import auxiliar.Numero;
import programa.Fonte;
import programa.janelas.projeto.ProjetoFrm;

public class FormToFonte {

	private FormToFonte() {

		throw new IllegalStateException("Utility class");
	}

	public static Fonte copia(ProjetoFrm frm) {

		Fonte fonte = new Fonte();

		fonte.setId(Integer.parseInt(frm.getLblIdFonte().getText()));
		fonte.setConcessionaria(frm.getCbConcessionaria().getSelectedItem().toString());
		fonte.setTensaoFN(Numero.stringToDouble(frm.getTxtTensaoFonte().getText()));

		return fonte;
	}
}
