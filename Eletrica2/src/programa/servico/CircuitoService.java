package programa.servico;

import java.util.ArrayList;
import java.util.HashMap;

import programa.Circuito;
import programa.Dao.CircuitoDao;

public class CircuitoService {

	private CircuitoDao dao;

	public CircuitoService() {
		dao = new CircuitoDao();
	}

	public void salvar(Circuito circuito, int idQuadro) {

		if (circuito.getId() != 0) {
			dao.atualizar(circuito, idQuadro);
		} else {
			dao.inserir(circuito, idQuadro);
		}
	}

	public void excluir(Circuito circuito) {

		if (circuito.getId() != 0) {
			dao.excluir(circuito);
		}

	}

	public ArrayList<Circuito> registroEmBranco() {
		return dao.registroEmBranco();
	}

	public ArrayList<Circuito> getCircuitos(HashMap<Object, Object> filtro) {

		return dao.filtraCircuito(filtro);
	}

}
