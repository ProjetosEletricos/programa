package programa.janelas.quadro.extras;

import auxiliar.Numero;
import programa.Quadro;
import programa.janelas.projeto.ProjetoFrm;

public class FormToQuadro {
	
	private static Quadro quadro;

	private FormToQuadro() {

		throw new IllegalStateException("Utility class");
	}

	public static Quadro copia(ProjetoFrm frm) {

		quadro = new Quadro();

		quadro.setId(Integer.parseInt(frm.getLblIdQuadro().getText()));
		quadro.setNome(frm.getTxtNomeQuadro().getText());
		quadro.setDrGeral(frm.getCbDrQuadro().getSelectedItem().toString());
		quadro.setFd(Numero.stringToDouble((frm.getTxtFdQuadro().getText())));
		quadro.setFp(Numero.stringToDouble((frm.getTxtFpQuadro().getText())));
		quadro.setLocal(frm.getTxtLocalQuadro().getText());
		quadro.setUsabilidade(frm.getCbUsabilidadeQuadro().getSelectedItem().toString());
		if(frm.getCbQuadroPai().getModel().getSelectedItem() != null) {
		quadro.setQuadroPai((Quadro)frm.getCbQuadroPai().getSelectedItem());
		}
		return quadro;
	}
}
