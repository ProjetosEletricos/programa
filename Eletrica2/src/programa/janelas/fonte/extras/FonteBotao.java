package programa.janelas.fonte.extras;

import java.util.ArrayList;
import java.util.HashMap;

import programa.Fonte;
import programa.janelas.projeto.ProjetoFrm;
import programa.servico.FonteService;

public class FonteBotao {

	private FonteBotao() {

		throw new IllegalStateException("Utility class");
	}

	public static void salvar(ProjetoFrm frm, int idProjeto) {

		FonteService service = new FonteService();
		Fonte fonte = FormToFonte.copia(frm);
		service.salvar(fonte, idProjeto);
		ArrayList<Fonte> fontes = new ArrayList<>();
		fontes = service.getFontes(new HashMap<>());
		frm.setFontes(fontes);
		FonteApagarDados.formu(frm);

	}

	public static void excluir(ProjetoFrm frm) {

		FonteService service = new FonteService();
		if (!(frm.getTableFontes().getSelectedRow() < 0)) {
			service.excluir(frm.getSelectFonte());
		}
		frm.setFontes(service.getFontes(new HashMap<>()));
		FonteApagarDados.formu(frm);

	}

	public static void inserir(ProjetoFrm frm, int idProjeto) {
		FonteApagarDados.formu(frm);

	}

	public static void cancelar(ProjetoFrm frm, int idProjeto) {

		FonteApagarDados.formu(frm);

	}

	public static void copiar(ProjetoFrm frm, int idProjeto) {
		FonteService service = new FonteService();
		frm.getLblIdFonte().setText("0");
		service.salvar(FormToFonte.copia(frm), idProjeto);
		frm.setFontes(service.getFontes(new HashMap<>()));
		FonteApagarDados.formu(frm);

	}

}
