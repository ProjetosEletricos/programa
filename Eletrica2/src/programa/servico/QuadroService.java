package programa.servico;

import java.util.ArrayList;
import java.util.HashMap;


import programa.Quadro;

import programa.Dao.QuadroDao;

public class QuadroService {

	private QuadroDao dao;

	public QuadroService() {
		dao = new QuadroDao();
	}

	public void salvar(Quadro quadro, int idFonte) {

		if (quadro.getId() != 0) {
			dao.atualizar(quadro,idFonte);
		} else {
			dao.inserir(quadro,idFonte);

		}

	}

	public void excluir(Quadro quadro) {

		if (quadro.getId() != 0) {
			dao.excluir(quadro);
		}

	}

	public ArrayList<Quadro> registroEmBranco() {
		return dao.registroEmBranco();
	}

	public ArrayList<Quadro> getQuadros(HashMap<Object, Object> filtro) {

		return dao.filtraQuadros(filtro);
	}

}
