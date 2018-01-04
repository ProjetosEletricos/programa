package programa.servico;

import java.util.ArrayList;
import java.util.HashMap;

import programa.Fonte;
import programa.Dao.FonteDao;

public class FonteService {

	private FonteDao dao;

	public FonteService() {
		dao = new FonteDao();
	}

	public void salvar(Fonte fonte, int idProjeto) {

		if (fonte.getId() != 0) {
			dao.atualizar(fonte, idProjeto);
		} else {
			dao.inserir(fonte, idProjeto);

		}

	}

	public void excluir(Fonte fonte) {

		if (fonte.getId() != 0) {
			dao.excluir(fonte);
		}

	}

	public ArrayList<Fonte> registroEmBranco() {
		return dao.registroEmBranco();
	}

	public ArrayList<Fonte> getFontes(HashMap<Object, Object> filtro) {

		return dao.filtraFontes(filtro);
	}

}
