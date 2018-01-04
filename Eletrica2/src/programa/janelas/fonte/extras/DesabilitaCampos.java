package programa.janelas.fonte.extras;

import programa.janelas.fonte.FonteFrm;

public class DesabilitaCampos {
	
	private DesabilitaCampos() {
		throw new IllegalStateException("Utility class");
	}

	public static void formu(FonteFrm frm) {

		frm.getTxtTensao().setEnabled(false);
		frm.getCbConcessionaria().setEnabled(false);

	}
}
