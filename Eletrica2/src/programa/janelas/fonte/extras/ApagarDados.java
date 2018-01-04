package programa.janelas.fonte.extras;

import programa.janelas.fonte.FonteFrm;

public class ApagarDados {

	private ApagarDados() {
		throw new IllegalStateException("Utility class");
	}

	public static void formu(FonteFrm frm) {

		frm.getTxtTensao().setText("");
		frm.getCbConcessionaria().setSelectedItem(null);
		frm.getLblIdFonte().setText("0");
	}
}
