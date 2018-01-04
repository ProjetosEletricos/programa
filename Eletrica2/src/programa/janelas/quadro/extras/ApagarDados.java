package programa.janelas.quadro.extras;

import programa.janelas.quadro.QuadroFrm;

public class ApagarDados {

	private ApagarDados() {
		throw new IllegalStateException("Utility class");
	}

	public static void formu(QuadroFrm frm) {

		frm.getLblIdQuadro().setText("0");
		frm.getTxtNome().setText("");
		frm.getCbDrGeral().setSelectedItem(null);
		frm.getCbUsabilidade().setSelectedItem(null);
		frm.getTxtFd().setText("");
		frm.getTxtFp().setText("");
		frm.getTxtLocal().setText("");
	}
}
