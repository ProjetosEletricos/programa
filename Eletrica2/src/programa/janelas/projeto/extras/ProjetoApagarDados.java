package programa.janelas.projeto.extras;

import auxiliar.Data;
import programa.janelas.projeto.ProjetoFrm;

public class ProjetoApagarDados {

	private ProjetoApagarDados() {
		throw new IllegalStateException("Utility class");
	}

	public static void formu(ProjetoFrm frm) {

		frm.getTxtAutor().setText("");
		frm.getTxtNomeProjeto().setText("");
		frm.getTxtDescricaoProjeto().setText("");
		frm.getTxtData().setText(Data.Atual());
		frm.getLblIdProjeto().setText("0");
	}
}
