package programa.janelas.quadro.extras;

import programa.janelas.quadro.QuadroFrm;

public class HabilitaCampos {

	private HabilitaCampos() {
		throw new IllegalStateException("Utility class");
	}

	public static void formu(QuadroFrm frm) {

		frm.getTxtNome().setEnabled(true);
		frm.getTxtFd().setEnabled(true);
		frm.getTxtFp().setEnabled(true);
		frm.getTxtLocal().setEnabled(true);
		frm.getCbDrGeral().setEditable(true);
		frm.getCbQuadroPai().setEnabled(true);
		frm.getCbUsabilidade().setEnabled(true);

	}
}
