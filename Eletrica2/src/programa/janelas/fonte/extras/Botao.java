package programa.janelas.fonte.extras;

import programa.janelas.projeto.ProjetoFrm;
import programa.servico.FonteService;

public class Botao {

	private Botao() {

		throw new IllegalStateException("Utility class");
	}

	public static void salvar(ProjetoFrm frm, int idProjeto) {

		FonteService service = new FonteService();
		service.salvar(FormToFonte.copia(frm), idProjeto);
		frm.atualizarTabelaFontes();
		ApagarDados.formu(frm);

	}

	public static void excluir(ProjetoFrm frm) {

		new FonteService().excluir(frm.getSelectFonte());
		frm.atualizarTabelaFontes();
		ApagarDados.formu(frm);

	}

	public static void inserir(ProjetoFrm frm, int idProjeto) {
		ApagarDados.formu(frm);

	}

	public static void cancelar(ProjetoFrm frm, int idProjeto) {

		ApagarDados.formu(frm);

	}

	public static void copiar(ProjetoFrm frm, int idProjeto) {
		FonteService service = new FonteService();
		frm.getLblIdFonte().setText("0");
		service.salvar(FormToFonte.copia(frm), idProjeto);
		frm.atualizarTabelaFontes();
		ApagarDados.formu(frm);

	}

}
