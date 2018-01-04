package programa.janelas.quadro.extras;

import auxiliar.Numero;
import programa.Quadro;
import programa.janelas.quadro.QuadroFrm;

public class QuadroToForm {

	private QuadroToForm() {
		throw new IllegalStateException("Utility class");
	}

	public static void copia(Quadro quadro, QuadroFrm frm) {

		frm.getLblIdQuadro().setText(Integer.toString(quadro.getId()));
		frm.getTxtNome().setText(quadro.getNome());
		frm.getCbDrGeral().setSelectedItem(quadro.getDrGeral());
		frm.getTxtFd().setText(Numero.decimal(quadro.getFd(), "0"));
		frm.getTxtFp().setText(Numero.decimal(quadro.getFp(), "0"));
		frm.getTxtLocal().setText(quadro.getLocal());
		frm.getCbUsabilidade().setSelectedItem(quadro.getUsabilidade());
	}
}
