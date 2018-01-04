package programa.janelas.fonte.extras;

import auxiliar.Numero;
import programa.Fonte;
import programa.janelas.fonte.FonteFrm;

public class FormToFonte {

	private FormToFonte() {
		
		throw new IllegalStateException("Utility class");
	}

	public static Fonte copia(FonteFrm frm) {

		Fonte fonte = new Fonte();

		fonte.setId(Integer.parseInt(frm.getLblIdFonte().getText()));
		fonte.setConcessionaria(frm.getCbConcessionaria().getSelectedItem().toString());
		fonte.setTensaoFN(Numero.stringToDouble(frm.getTxtTensao().getText()));

		return fonte;
	}
}
