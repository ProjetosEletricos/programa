package programa.janelas.fonte.extras;

import programa.janelas.projeto.ProjetoFrm;

public class FonteApagarDados {

	private FonteApagarDados() {
		throw new IllegalStateException("Utility class");
	}

	public static void formu(ProjetoFrm frm) {

		frm.getTxtTensaoFonte().setText("");
		frm.getCbConcessionaria().setSelectedItem("Light");
		frm.getLblIdFonte().setText("0");
	}
}
