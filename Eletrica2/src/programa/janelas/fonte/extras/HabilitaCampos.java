package programa.janelas.fonte.extras;

import programa.janelas.fonte.FonteFrm;

public class HabilitaCampos {
	
	private HabilitaCampos() {
		throw new IllegalStateException("Utility class");
	}

	public static void formu(FonteFrm frm) {

		frm.getTxtTensao().setEnabled(true);
		frm.getCbConcessionaria().setEnabled(true);

		// frm.getTableEquipamentos().setEnabled(false);
	}
}
