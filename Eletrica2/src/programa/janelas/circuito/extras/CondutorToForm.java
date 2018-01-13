package programa.janelas.circuito.extras;

import auxiliar.Numero;
import programa.Condutor;
import programa.janelas.projeto.ProjetoFrm;

public class CondutorToForm {

	private CondutorToForm() {
		throw new IllegalStateException("Utility class");
	}

	public static void copia(Condutor condutor, ProjetoFrm frm) {
		if (condutor != null) {
			frm.getLblIdCondutor().setText(Integer.toString(condutor.getId()));
			frm.getTxtComprimentoCircuito().setText(Numero.decimal(condutor.getDistAlimentador(), "0"));
			frm.getTxtmodoInstalacao().setSelectedItem(condutor.getModoInstalAlimentador());
			frm.getTxtMaterial().setSelectedItem(condutor.getMatAlimentador());
			frm.getTxtQTensaoCircuito().setText(Numero.decimal(condutor.getQuedaTensao(), "0"));
			frm.getTxtIsolacao().setSelectedItem(condutor.getIsolAlimentador());
			frm.getCbBitolasSuessivas().setSelectedItem(condutor.getBitolasSucessivas());
			frm.getCbCirAgrupados().setSelectedItem(condutor.getnCirAgrupados());
			frm.getCbNCamadas().setSelectedItem(condutor.getnCamadas());
			frm.getCbEnterrado().setSelectedItem(condutor.getEnterrado());
			frm.getCbEspacoCabos().setSelectedItem(condutor.getEspacamentoCabos());
			frm.getCbMultipolar().setSelectedItem(condutor.getMultipolar());
			frm.getCbFormaAgrupamento().setSelectedItem(condutor.getFormaAgrupamento());
			frm.getTxtResistividadeTermCircuito().setText(Numero.decimal(condutor.getResistividadeTermica(), "0"));
			frm.getTxtTemperaturaCircuito().setText(Numero.decimal(condutor.getTempAmbiente(), "0"));

		}
	}
}
