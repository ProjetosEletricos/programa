package programa.janelas.circuito.extras;

import auxiliar.Numero;
import programa.Condutor;
import programa.janelas.circuito.CircuitoFrm;

public class CondutorToForm {

	private CondutorToForm() {
		throw new IllegalStateException("Utility class");
	}

	public static void copia(Condutor condutor, CircuitoFrm frmCir) {

		frmCir.getLblIdcondutor().setText(Integer.toString(condutor.getId()));
		frmCir.getTxtdistAlimentador().setText(Numero.decimal(condutor.getDistAlimentador(), "0"));
		frmCir.getTxtmodoInstalacao().setText(condutor.getModoInstalAlimentador());
		frmCir.getTxtMaterial().setText(condutor.getMatAlimentador());
		frmCir.getTxtQTensao().setText(Numero.decimal(condutor.getQuedaTensao(), "0"));
		frmCir.getTxtIsolacao().setText(condutor.getIsolAlimentador());
		frmCir.getCbBitolasSuessivas().setSelectedItem(condutor.getBitolasSucessivas());
		frmCir.getCbCirAgrupados().setSelectedItem(condutor.getnCirAgrupados());
		frmCir.getCbNCamadas().setSelectedItem(condutor.getnCamadas());
		frmCir.getCbEnterrado().setSelectedItem(condutor.getEnterrado());
		frmCir.getCbEspacoCabos().setSelectedItem(condutor.getEspacamentoCabos());
		frmCir.getCbMultipolar().setSelectedItem(condutor.getMultipolar());
		frmCir.getCbFormaAgrupamento().setSelectedItem(condutor.getFormaAgrupamento());
		frmCir.getTxtResistividaeTerm().setText(Numero.decimal(condutor.getResistividadeTermica(), "0"));
		frmCir.getTxtTemperatura().setText(Numero.decimal(condutor.getTempAmbiente(), "0"));

	}
}
