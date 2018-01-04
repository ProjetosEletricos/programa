package programa.janelas.quadro.extras;

import java.util.HashMap;

import programa.Quadro;
import programa.janelas.quadro.QuadroFrm;
import programa.servico.QuadroService;

public class Botao {

	private Botao() {

		throw new IllegalStateException("Utility class");
	}

	public static void salvar(QuadroFrm frm, int idFonte) {

		QuadroService service = new QuadroService();
		service.salvar(FormToQuadro.copia(frm), idFonte);

		ApagarDados.formu(frm);
		DesabilitaCampos.formu(frm);

		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(true);
		frm.getMntmSalvar().setEnabled(false);
		frm.getMntmCancelar().setEnabled(false);
		frm.getMntmCopiar().setEnabled(false);

	}

	public static void excluir(QuadroFrm frm) {

		QuadroService service = new QuadroService();
		HashMap<Object, Object> filtro = new HashMap<>();
		filtro.put("Id", frm.getTableQuadro().getModel().getValueAt(frm.getTableQuadro().getSelectedRow(), 0));
		Quadro quadro = new Quadro();
		quadro = service.getQuadros(filtro).get(0);
		service.excluir(quadro);

		ApagarDados.formu(frm);

		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(true);
		frm.getMntmSalvar().setEnabled(false);
		frm.getMntmCancelar().setEnabled(false);
		frm.getMntmCopiar().setEnabled(false);
		DesabilitaCampos.formu(frm);
	}

	public static void inserir(QuadroFrm frm, int idFonte) {
		ApagarDados.formu(frm);

		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(false);
		frm.getMntmSalvar().setEnabled(true);
		frm.getMntmCancelar().setEnabled(true);
		frm.getMntmCopiar().setEnabled(false);
		HabilitaCampos.formu(frm);
	}

	public static void cancelar(QuadroFrm frm, int idFonte) {

		ApagarDados.formu(frm);

		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(true);
		frm.getMntmSalvar().setEnabled(false);
		frm.getMntmCancelar().setEnabled(false);
		frm.getMntmCopiar().setEnabled(false);
		DesabilitaCampos.formu(frm);
	}

	public static void copiar(QuadroFrm frm, int idFonte) {
		QuadroService service = new QuadroService();
		frm.getLblIdQuadro().setText("0");
		service.salvar(FormToQuadro.copia(frm), idFonte);
		ApagarDados.formu(frm);
		DesabilitaCampos.formu(frm);
		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(true);
		frm.getMntmSalvar().setEnabled(false);
		frm.getMntmCancelar().setEnabled(false);
		frm.getMntmCopiar().setEnabled(false);
	}

}
