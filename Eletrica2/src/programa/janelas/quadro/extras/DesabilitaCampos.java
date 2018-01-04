package programa.janelas.quadro.extras;

import programa.janelas.quadro.QuadroFrm;

public class DesabilitaCampos {

	private DesabilitaCampos() {
		throw new IllegalStateException("Utility class");
	}

	public static void formu(QuadroFrm frm) {

		frm.getTxtNome().setEnabled(false);
		frm.getTxtFd().setEnabled(false);
		frm.getTxtFp().setEnabled(false);
		frm.getTxtLocal().setEnabled(false);
		frm.getCbDrGeral().setEditable(false);
		frm.getCbQuadroPai().setEnabled(false);
		frm.getCbUsabilidade().setEnabled(false);

	}
}
