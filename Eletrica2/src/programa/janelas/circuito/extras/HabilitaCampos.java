package programa.janelas.circuito.extras;

import programa.janelas.circuito.CircuitoFrm;

public class HabilitaCampos {

	private HabilitaCampos() {
		throw new IllegalStateException("Utility class");
	}

	public static void formu(CircuitoFrm frm) {

		frm.getTxtdistAlimentador().setEnabled(true);
		frm.getTxtIsolacao().setEnabled(true);
		frm.getTxtMaterial().setEnabled(true);
		frm.getCbBitolasSuessivas().setEnabled(true);
		frm.getTxtmodoInstalacao().setEnabled(true);
		frm.getCbCirAgrupados().setEnabled(true);
		frm.getTxtNome().setEnabled(true);
		frm.getTxtQTensao().setEnabled(true);
		frm.getTxtResistividaeTerm().setEnabled(true);
		frm.getTxtTemperatura().setEnabled(true);
		frm.getCbEnterrado().setEnabled(true);
		frm.getCbEspacoCabos().setEnabled(true);
		frm.getCbFormaAgrupamento().setEnabled(true);
		frm.getCbMultipolar().setEnabled(true);
		frm.getCbNCamadas().setEnabled(true);

	}
}
