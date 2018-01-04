package programa.janelas.fonte.extras;

import java.util.HashMap;

import programa.Fonte;
import programa.janelas.fonte.FonteFrm;
import programa.servico.FonteService;

public class Botao {

	private Botao() {

		throw new IllegalStateException("Utility class");
	}

	public static void salvar(FonteFrm frm, int idProjeto) {

		FonteService service = new FonteService();
		service.salvar(FormToFonte.copia(frm), idProjeto);

		ApagarDados.formu(frm);
		DesabilitaCampos.formu(frm);

		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(true);
		frm.getMntmSalvar().setEnabled(false);
		frm.getMntmCancelar().setEnabled(false);
		frm.getMntmCopiar().setEnabled(false);

	}

	public static void excluir(FonteFrm frm) {

		FonteService service = new FonteService();
		HashMap<Object, Object> filtro = new HashMap<>();
		filtro.put("Id", frm.getTableFontes().getModel().getValueAt(frm.getTableFontes().getSelectedRow(), 0));
		Fonte fonte = new Fonte();
		fonte = service.getFontes(filtro).get(0);
		service.excluir(fonte);

		ApagarDados.formu(frm);

		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(true);
		frm.getMntmSalvar().setEnabled(false);
		frm.getMntmCancelar().setEnabled(false);
		frm.getMntmCopiar().setEnabled(false);
		DesabilitaCampos.formu(frm);
	}

	public static void inserir(FonteFrm frm, int idProjeto) {
		ApagarDados.formu(frm);

		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(false);
		frm.getMntmSalvar().setEnabled(true);
		frm.getMntmCancelar().setEnabled(true);
		frm.getMntmCopiar().setEnabled(false);
		HabilitaCampos.formu(frm);
	}

	public static void cancelar(FonteFrm frm, int idProjeto) {

		ApagarDados.formu(frm);

		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(true);
		frm.getMntmSalvar().setEnabled(false);
		frm.getMntmCancelar().setEnabled(false);
		frm.getMntmCopiar().setEnabled(false);
		DesabilitaCampos.formu(frm);
	}

	public static void copiar(FonteFrm frm, int idProjeto) {
		FonteService service = new FonteService();
		frm.getLblIdFonte().setText("0");
		service.salvar(FormToFonte.copia(frm),idProjeto);
		ApagarDados.formu(frm);
		DesabilitaCampos.formu(frm);
		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(true);
		frm.getMntmSalvar().setEnabled(false);
		frm.getMntmCancelar().setEnabled(false);
		frm.getMntmCopiar().setEnabled(false);
	}

}
