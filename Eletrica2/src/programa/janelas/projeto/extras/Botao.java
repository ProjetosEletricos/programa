package programa.janelas.projeto.extras;

import programa.janelas.projeto.ProjetoFrm;
import programa.servico.ProjetoService;

public class Botao {

	private Botao() {

		throw new IllegalStateException("Utility class");
	}

	public static void salvar(ProjetoFrm frm) {

		ProjetoService service = new ProjetoService();
		service.salvar(FormToProjeto.copia(frm));

		ApagarDados.formu(frm);

	}

	public static void excluir(ProjetoFrm frm) {

		new ProjetoService().excluir(frm.getSelectProjeto());

		frm.removeProjetoSelecionado();

		ApagarDados.formu(frm);

	}

	public static void inserir(ProjetoFrm frm) {
		ApagarDados.formu(frm);

	}

	public static void cancelar(ProjetoFrm frm) {

		ApagarDados.formu(frm);

	}

	public static void copiar(ProjetoFrm frm) {
		ProjetoService service = new ProjetoService();
		frm.getLblIdProjeto().setText("0");
		service.salvar(FormToProjeto.copia(frm));

	}

}
