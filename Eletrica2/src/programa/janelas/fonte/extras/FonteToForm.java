package programa.janelas.fonte.extras;

import auxiliar.Numero;
import programa.Fonte;
import programa.janelas.fonte.FonteFrm;

public class FonteToForm {

	private FonteToForm() {
		throw new IllegalStateException("Utility class");
	}

	public static void copia(Fonte fonte, FonteFrm frm) {

		frm.getLblIdFonte().setText(Integer.toString(fonte.getId()));
		frm.getTxtTensao().setText(Numero.decimal(fonte.getTensaoFN(), "0"));
		frm.getCbConcessionaria().setSelectedItem(fonte.getConcessionaria());
	}
}
