package programa.janelas.fonte.extras;

import auxiliar.Numero;
import programa.Fonte;
import programa.janelas.projeto.ProjetoFrm;

public class FormToFonte {

	private FormToFonte() {

		throw new IllegalStateException("Utility class");
	}

	public static Fonte copia(ProjetoFrm frm) {

		Fonte fonte = new Fonte();

		if (!(frm.getLblIdFonte().getText().equals("0") || frm.getLblIdFonte().getText().equals(""))) {
			fonte.setId(Integer.parseInt(frm.getLblIdFonte().getText()));
		}

		fonte.setConcessionaria(frm.getCbConcessionaria().getSelectedItem().toString());
		String stri = frm.getTxtTensaoFonte().getText();
		double valor = Numero.stringToDouble(stri);
		fonte.setTensaoFN(valor);

		return fonte;
	}
}
