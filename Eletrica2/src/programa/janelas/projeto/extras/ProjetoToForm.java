package programa.janelas.projeto.extras;

import auxiliar.Data;
import programa.Projeto;
import programa.janelas.projeto.ProjetoFrm;

public class ProjetoToForm {

	private ProjetoToForm() {
		throw new IllegalStateException("Utility class");
	}

	public static void copia(Projeto projeto, ProjetoFrm frm) {

		frm.getTxtAutor().setText(projeto.getAutor());
		frm.getTxtNomeProjeto().setText(projeto.getNome());
		frm.getTxtDescricaoProjeto().setText(projeto.getDescricao());
		frm.getTxtData().setText(Data.DataToString(projeto.getData()));
		frm.getLblIdProjeto().setText(Integer.toString(projeto.getId()));
	}
}
