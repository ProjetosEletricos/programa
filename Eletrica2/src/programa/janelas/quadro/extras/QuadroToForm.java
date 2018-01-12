package programa.janelas.quadro.extras;

import auxiliar.Numero;
import programa.Quadro;
import programa.janelas.projeto.ProjetoFrm;

public class QuadroToForm {

	private QuadroToForm() {
		throw new IllegalStateException("Utility class");
	}

	public static void copia(Quadro quadro, ProjetoFrm frm) {
		if (quadro != null) {
			frm.getLblIdQuadro().setText(Integer.toString(quadro.getId()));
			frm.getTxtNomeQuadro().setText(quadro.getNome());
			frm.getCbDrQuadro().setSelectedItem(quadro.getDrGeral());
			frm.getTxtFdQuadro().setText(Numero.decimal(quadro.getFd(), "0"));
			frm.getTxtFpQuadro().setText(Numero.decimal(quadro.getFp(), "0"));
			frm.getTxtLocalQuadro().setText(quadro.getLocal());
			frm.getCbUsabilidadeQuadro().setSelectedItem(quadro.getUsabilidade());
		}
	}
}
