package programa.janelas.circuito.extras;

import auxiliar.Numero;
import programa.Condutor;
import programa.janelas.projeto.ProjetoFrm;

public class FormToCondutor {

	private FormToCondutor() {

		throw new IllegalStateException("Utility class");
	}

	public static Condutor copia(ProjetoFrm frmCir) {

		Condutor condutor = new Condutor();

		condutor.setId(Integer.parseInt(frmCir.getLblIdCondutor().getText()));
		condutor.setDistAlimentador(Numero.stringToDouble(frmCir.getTxtComprimentoCircuito().getText()));
		condutor.setModoInstalAlimentador(frmCir.getTxtmodoInstalacao().getSelectedItem().toString());
		condutor.setMatAlimentador(frmCir.getTxtMaterial().getSelectedItem().toString());
		condutor.setQuedaTensao(Numero.stringToDouble(frmCir.getTxtQTensaoCircuito().getText()));
		condutor.setIsolAlimentador(frmCir.getTxtIsolacao().getSelectedItem().toString());
		condutor.setBitolasSucessivas(frmCir.getCbBitolasSuessivas().getSelectedItem().toString());
		condutor.setnCirAgrupados(Integer.parseInt(frmCir.getCbCirAgrupados().getSelectedItem().toString()));
		condutor.setnCamadas(Integer.parseInt(frmCir.getCbNCamadas().getSelectedItem().toString()));
		condutor.setEnterrado(frmCir.getCbEnterrado().getSelectedItem().toString());
		condutor.setEspacamentoCabos(frmCir.getCbEspacoCabos().getSelectedItem().toString());
		condutor.setMultipolar(frmCir.getCbMultipolar().getSelectedItem().toString());
		condutor.setFormaAgrupamento(frmCir.getCbFormaAgrupamento().getSelectedItem().toString());
		condutor.setResistividadeTermica(Numero.stringToDouble(frmCir.getTxtResistividadeTermCircuito().getText()));
		condutor.setTempAmbiente(Numero.stringToDouble(frmCir.getTxtTemperaturaCircuito().getText()));

		return condutor;
	}
}
