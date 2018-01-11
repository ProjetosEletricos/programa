package programa.janelas.projeto.extras;

import java.util.HashMap;

import programa.janelas.projeto.ProjetoFrm;
import programa.servico.ProjetoService;

public class ProjetoBotao {

	private ProjetoBotao() {

		throw new IllegalStateException("Utility class");
	}

	public static void salvar(ProjetoFrm frm) {

		ProjetoService service = new ProjetoService();
		service.salvar(FormToProjeto.copia(frm));
		frm.setProjetos(service.getProjetos(new HashMap<>()));
		ProjetoApagarDados.formu(frm);

	}

	public static void excluir(ProjetoFrm frm) {
		if (!(frm.getTableProjetos().getSelectedRow() < 0)) {
			new ProjetoService().excluir(frm.getSelectProjeto());
		}
		ProjetoService service = new ProjetoService();
		frm.setProjetos(service.getProjetos(new HashMap<>()));

		ProjetoApagarDados.formu(frm);

	}

	public static void inserir(ProjetoFrm frm) {
		ProjetoApagarDados.formu(frm);
		;

	}

	public static void cancelar(ProjetoFrm frm) {

		ProjetoApagarDados.formu(frm);

	}

	public static void copiar(ProjetoFrm frm) {

		ProjetoService service = new ProjetoService();
		frm.getLblIdProjeto().setText("0");
		service.salvar(FormToProjeto.copia(frm));
		frm.setProjetos(service.getProjetos(new HashMap<>()));
		ProjetoApagarDados.formu(frm);

	}

}
