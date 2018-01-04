package programa.janelas.projeto.extras;

import auxiliar.Data;
import programa.Projeto;
import programa.janelas.projeto.ProjetoFrm;

public class FormToProjeto {

	private static Projeto projeto;
	
	private FormToProjeto() {
		throw new IllegalStateException("Utility class");
	}

	public static Projeto copia(ProjetoFrm frm) {

		projeto = new Projeto();
		
		if (!(frm.getLblIdProjeto().getText().equals("0") || frm.getLblIdProjeto().getText().equals(""))) {
			projeto.setId(Integer.parseInt(frm.getLblIdProjeto().getText()));
		}

		projeto.setNome(frm.getTxtNomeProjeto().getText());
		projeto.setAutor(frm.getTxtAutor().getText());
		projeto.setDescricao(frm.getTxtDescricaoProjeto().getText());
		projeto.setData(Data.stringToData(frm.getTxtData().getText()));

		return projeto;
	}
	
	public static int getIdProjeto() {
		return projeto.getId();
	}
}
