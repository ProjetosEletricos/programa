package programa.janelas.fonte.extras;

import programa.janelas.projeto.ProjetoFrm;

public class ApagarDados {

	private ApagarDados() {
		throw new IllegalStateException("Utility class");
	}

	public static void formu(ProjetoFrm frm) {

		frm.getTxtTensaoFonte().setText("");
		frm.getCbConcessionaria().setSelectedItem(null);
		frm.getLblIdFonte().setText("0");
	}
}
