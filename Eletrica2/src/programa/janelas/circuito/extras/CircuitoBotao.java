package programa.janelas.circuito.extras;

import java.util.ArrayList;
import java.util.HashMap;

import programa.Circuito;
import programa.Condutor;
import programa.janelas.projeto.ProjetoFrm;
import programa.servico.CircuitoService;
import programa.servico.CondutorService;

public class CircuitoBotao {

	private CircuitoBotao() {

		throw new IllegalStateException("Utility class");
	}

	public static void salvar(ProjetoFrm frm, int idQuadro) {

		CircuitoService serviceCir = new CircuitoService();
		CondutorService serviceCond = new CondutorService();
		Circuito circuito = FormToCircuito.copia(frm);
		Condutor condutor = FormToCondutor.copia(frm);
		serviceCir.salvar(circuito, idQuadro);
		serviceCond.salvar(condutor);
		ArrayList<Circuito> circuitos = new ArrayList<>();
		circuitos = serviceCir.getCircuitos(new HashMap<>());
		frm.setCircuitos(circuitos);
		CircuitoApagarDados.formu(frm);
	}

	public static void excluir(ProjetoFrm frm) {

		CircuitoService service = new CircuitoService();
		Circuito circuito = frm.getSelectCircuito();
		service.excluir(circuito);
		frm.getListCircuitos().remove(frm.getListCircuitos().getSelectedIndex());
		CircuitoApagarDados.formu(frm);

	}

	public static void inserir(ProjetoFrm frm, int idQuadro) {
		CircuitoApagarDados.formu(frm);

	}

	public static void cancelar(ProjetoFrm frm, int idQuadro) {

		CircuitoApagarDados.formu(frm);

	}

	public static void copiar(ProjetoFrm frm, int idQuadro) {
		CircuitoService service = new CircuitoService();
		frm.getLblIdCircuito().setText("0");
		service.salvar(FormToCircuito.copia(frm), idQuadro);
		frm.setCircuitos(service.getCircuitos(new HashMap<>()));
		CircuitoApagarDados.formu(frm);
	}

}
