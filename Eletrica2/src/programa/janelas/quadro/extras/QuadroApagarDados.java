package programa.janelas.quadro.extras;

import programa.janelas.projeto.ProjetoFrm;

public class QuadroApagarDados {

	private QuadroApagarDados() {
		throw new IllegalStateException("Utility class");
	}

	public static void formu(ProjetoFrm frm) {

		frm.getLblIdQuadro().setText("0");
		frm.getTxtNomeQuadro().setText("");
		frm.getCbDrQuadro().setSelectedItem(null);
		frm.getCbUsabilidadeQuadro().setSelectedItem(null);
		frm.getTxtFdQuadro().setText("");
		frm.getTxtFpQuadro().setText("");
		frm.getTxtLocalQuadro().setText("");
	}
}
