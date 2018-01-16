package programa.janelas.circuito.extras;

import auxiliar.Numero;
import programa.Condutor;
import programa.janelas.projeto.ProjetoFrm;

public class FormToCondutor {

	private FormToCondutor() {

		throw new IllegalStateException("Utility class");
	}

	public static Condutor copia(ProjetoFrm frm) {

		Condutor condutor = new Condutor();

		condutor.setId(Integer.parseInt(frm.getLblIdCondutor().getText()));
		condutor.setDistAlimentador(Numero.stringToDouble(frm.getTxtComprimentoCircuito().getText()));
		condutor.setModoInstalAlimentador(frm.getTxtmodoInstalacao().getSelectedItem().toString());
		condutor.setMatAlimentador(frm.getTxtMaterial().getSelectedItem().toString());
		condutor.setQuedaTensao(Numero.stringToDouble(frm.getTxtQTensaoCircuito().getText()));
		condutor.setIsolAlimentador(frm.getTxtIsolacao().getSelectedItem().toString());
		condutor.setBitolasSucessivas(frm.getCbBitolasSuessivas().getSelectedItem().toString());
		condutor.setnCirAgrupados(Integer.parseInt(frm.getCbCirAgrupados().getSelectedItem().toString()));
		condutor.setnCamadas(Integer.parseInt(frm.getCbNCamadas().getSelectedItem().toString()));
		condutor.setEnterrado(frm.getCbEnterrado().getSelectedItem().toString());
		condutor.setEspacamentoCabos(frm.getCbEspacoCabos().getSelectedItem().toString());
		condutor.setMultipolar(frm.getCbMultipolar().getSelectedItem().toString());
		condutor.setFormaAgrupamento(frm.getCbFormaAgrupamento().getSelectedItem().toString());
		condutor.setResistividadeTermica(Numero.stringToDouble(frm.getTxtResistividadeTermCircuito().getText()));
		condutor.setTempAmbiente(Numero.stringToDouble(frm.getTxtTemperaturaCircuito().getText()));

		return condutor;
	}
}
