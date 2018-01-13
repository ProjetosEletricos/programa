package programa.janelas.circuito.extras;

import programa.janelas.projeto.ProjetoFrm;

public class CircuitoApagarDados {

	private CircuitoApagarDados() {
		throw new IllegalStateException("Utility class");
	}

	public static void formu(ProjetoFrm frm) {

		frm.getLblIdCircuito().setText("0");
		frm.getTxtNomeCircuito().setText("");

		frm.getLblIdCondutor().setText("0");
		frm.getTxtComprimentoCircuito().setText("");
		frm.getTxtmodoInstalacao().setSelectedItem(null);
		frm.getTxtMaterial().setSelectedItem(null);
		frm.getTxtQTensaoCircuito().setText("");
		frm.getTxtIsolacao().setSelectedItem(null);
		frm.getCbBitolasSuessivas().setSelectedItem(null);
		frm.getCbCirAgrupados().setSelectedItem(null);
		frm.getCbNCamadas().setSelectedItem(null);
		frm.getCbEnterrado().setSelectedItem(null);
		frm.getCbEspacoCabos().setSelectedItem(null);
		frm.getCbMultipolar().setSelectedItem(null);
		frm.getCbFormaAgrupamento().setSelectedItem(null);
		frm.getTxtResistividadeTermCircuito().setText("");
		frm.getTxtTemperaturaCircuito().setText("");
	}
}
