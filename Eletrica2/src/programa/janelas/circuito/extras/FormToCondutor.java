package programa.janelas.circuito.extras;

import auxiliar.Numero;
import programa.Condutor;
import programa.janelas.circuito.CircuitoFrm;

public class FormToCondutor {

	private FormToCondutor() {

		throw new IllegalStateException("Utility class");
	}

	public static Condutor copia(CircuitoFrm frmCir) {

		Condutor condutor = new Condutor();

		condutor.setId(Integer.parseInt(frmCir.getLblIdcondutor().getText()));
		condutor.setDistAlimentador(Numero.stringToDouble(frmCir.getTxtdistAlimentador().getText()));
		condutor.setModoInstalAlimentador(frmCir.getTxtmodoInstalacao().getText());
		condutor.setMatAlimentador(frmCir.getTxtMaterial().getText());
		condutor.setQuedaTensao(Numero.stringToDouble(frmCir.getTxtQTensao().getText()));
		condutor.setIsolAlimentador(frmCir.getTxtIsolacao().getText());
		condutor.setBitolasSucessivas(frmCir.getCbBitolasSuessivas().getSelectedItem().toString());
		condutor.setnCirAgrupados(Integer.parseInt(frmCir.getCbCirAgrupados().getSelectedItem().toString()));
		condutor.setnCamadas(Integer.parseInt(frmCir.getCbNCamadas().getSelectedItem().toString()));
		condutor.setEnterrado(frmCir.getCbEnterrado().getSelectedItem().toString());
		condutor.setEspacamentoCabos(frmCir.getCbEspacoCabos().getSelectedItem().toString());
		condutor.setMultipolar(frmCir.getCbMultipolar().getSelectedItem().toString());
		condutor.setFormaAgrupamento(frmCir.getCbFormaAgrupamento().getSelectedItem().toString());
		condutor.setResistividadeTermica(Numero.stringToDouble(frmCir.getTxtResistividaeTerm().getText()));
		condutor.setTempAmbiente(Numero.stringToDouble(frmCir.getTxtTemperatura().getText()));

		return condutor;
	}
}
