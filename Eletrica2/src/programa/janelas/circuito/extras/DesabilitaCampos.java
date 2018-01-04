package programa.janelas.circuito.extras;

import programa.janelas.circuito.CircuitoFrm;

public class DesabilitaCampos {

	private DesabilitaCampos() {
		throw new IllegalStateException("Utility class");
	}

	public static void formu(CircuitoFrm frm) {

		frm.getTxtdistAlimentador().setEnabled(false);
		frm.getTxtIsolacao().setEnabled(false);
		frm.getTxtMaterial().setEnabled(false);
		frm.getCbBitolasSuessivas().setEnabled(false);
		frm.getTxtmodoInstalacao().setEnabled(false);
		frm.getCbCirAgrupados().setEnabled(false);
		frm.getTxtNome().setEnabled(false);
		frm.getTxtQTensao().setEnabled(false);
		frm.getTxtResistividaeTerm().setEnabled(false);
		frm.getTxtTemperatura().setEnabled(false);
		frm.getCbEnterrado().setEnabled(false);
		frm.getCbEspacoCabos().setEnabled(false);
		frm.getCbFormaAgrupamento().setEnabled(false);
		frm.getCbMultipolar().setEnabled(false);
		frm.getCbNCamadas().setEnabled(false);

	}
}
