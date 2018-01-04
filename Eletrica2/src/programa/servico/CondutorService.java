package programa.servico;

import java.util.ArrayList;
import java.util.HashMap;

import programa.Condutor;
import programa.Dao.CondutorDao;

public class CondutorService {

	private CondutorDao dao;

	public CondutorService() {
		dao = new CondutorDao();
	}

	public void salvar(Condutor condutor) {

		if (condutor.getId() != 0) {
			dao.atualizar(condutor);
		} else {

			dao.inserir(condutor);

		}

	}

	public void excluir(Condutor condutor) {

		if (condutor.getId() != 0) {
			dao.excluir(condutor);
		} else {

		}

	}

	public ArrayList<Condutor> registroEmBranco() {
		return dao.registroEmBranco();
	}
	
	public ArrayList<Condutor> getCondutor(HashMap<Object,Object> filtro) {
		
		return dao.filtraCondutor(filtro);
	}

}
