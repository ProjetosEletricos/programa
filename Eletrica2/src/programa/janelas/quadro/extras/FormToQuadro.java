package programa.janelas.quadro.extras;

import auxiliar.Numero;
import programa.Quadro;
import programa.janelas.quadro.QuadroFrm;

public class FormToQuadro {

	private FormToQuadro() {

		throw new IllegalStateException("Utility class");
	}

	public static Quadro copia(QuadroFrm frm) {

		Quadro quadro = new Quadro();

		quadro.setId(Integer.parseInt(frm.getLblIdQuadro().getText()));
		quadro.setNome(frm.getTxtNome().getText());
		quadro.setDrGeral(frm.getCbDrGeral().getSelectedItem().toString());
		quadro.setFd(Numero.stringToDouble((frm.getTxtFd().getText())));
		quadro.setFp(Numero.stringToDouble((frm.getTxtFp().getText())));
		quadro.setLocal(frm.getTxtLocal().getText());
		quadro.setUsabilidade(frm.getCbUsabilidade().getSelectedItem().toString());

		return quadro;
	}
}
