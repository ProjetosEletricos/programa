package programa.servico;

import java.util.ArrayList;
import java.util.HashMap;

import programa.Projeto;
import programa.Dao.ProjetoDao;

public class ProjetoService {

	private ProjetoDao dao;

	public ProjetoService() {
		dao = new ProjetoDao();
	}

	public void salvar(Projeto novo) {

		if (novo.getId() != 0) {
			dao.atualizar(novo);
		} else {
			dao.inserir(novo);

		}

	}

	public void excluir(Projeto projeto) {

		if (projeto.getId() != 0) {
			dao.excluir(projeto);
		}

	}

	public ArrayList<Projeto> registroEmBranco() {
		return dao.registroEmBranco();
	}

	public ArrayList<Projeto> getProjetos(HashMap<Object, Object> filtro) {

		return dao.filtraProjetos(filtro);
	}

}
