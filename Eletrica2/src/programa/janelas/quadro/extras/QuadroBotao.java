package programa.janelas.quadro.extras;

import java.util.ArrayList;
import java.util.HashMap;

import programa.Quadro;
import programa.janelas.projeto.ProjetoFrm;
import programa.servico.QuadroService;

public class QuadroBotao {

	private QuadroBotao() {

		throw new IllegalStateException("Utility class");
	}

	public static void salvar(ProjetoFrm frm, int idFonte) {

		QuadroService service = new QuadroService();
		Quadro quadro = FormToQuadro.copia(frm);
		service.salvar(quadro, idFonte);
		ArrayList<Quadro> quadros = new ArrayList<>();
		quadros = service.getQuadros(new HashMap<>());
		frm.setQuadros(quadros);
		QuadroApagarDados.formu(frm);

	}

	public static void excluir(ProjetoFrm frm) {

		QuadroService service = new QuadroService();
		if (!(frm.getTableQuadros().getSelectedRow() < 0)) {
			service.excluir(frm.getSelectQuadro());
		}
		frm.setQuadros(service.getQuadros(new HashMap<>()));
		QuadroApagarDados.formu(frm);

	}

	public static void inserir(ProjetoFrm frm, int idFonte) {
		QuadroApagarDados.formu(frm);

	}

	public static void cancelar(ProjetoFrm frm, int idFonte) {

		QuadroApagarDados.formu(frm);

	}

	public static void copiar(ProjetoFrm frm, int idFonte) {
		QuadroService service = new QuadroService();
		frm.getLblIdQuadro().setText("0");
		service.salvar(FormToQuadro.copia(frm), idFonte);
		frm.setQuadros(service.getQuadros(new HashMap<>()));
		QuadroApagarDados.formu(frm);
	}

}
