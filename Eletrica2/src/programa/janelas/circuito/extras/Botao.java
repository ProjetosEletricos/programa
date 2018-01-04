package programa.janelas.circuito.extras;

import java.util.HashMap;

import programa.Circuito;
import programa.janelas.circuito.CircuitoFrm;
import programa.servico.CircuitoService;

public class Botao {

	private Botao() {

		throw new IllegalStateException("Utility class");
	}

	public static void salvar(CircuitoFrm frm, int idQuadro) {

		CircuitoService service = new CircuitoService();
		service.salvar(FormToCircuito.copia(frm), idQuadro);

		ApagarDados.formu(frm);
		DesabilitaCampos.formu(frm);

		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(true);
		frm.getMntmSalvar().setEnabled(false);
		frm.getMntmCancelar().setEnabled(false);
		frm.getMntmCopiar().setEnabled(false);

	}

	public static void excluir(CircuitoFrm frm) {

		CircuitoService service = new CircuitoService();
		Circuito circuito = frm.getSelectCircuito();
		
		service.excluir(circuito);
		
		frm.removeCircuitoSelecionado();
		
		ApagarDados.formu(frm);

		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(true);
		frm.getMntmSalvar().setEnabled(false);
		frm.getMntmCancelar().setEnabled(false);
		frm.getMntmCopiar().setEnabled(false);
		DesabilitaCampos.formu(frm);
	}

	public static void inserir(CircuitoFrm frm, int idQuadro) {
		ApagarDados.formu(frm);

		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(false);
		frm.getMntmSalvar().setEnabled(true);
		frm.getMntmCancelar().setEnabled(true);
		frm.getMntmCopiar().setEnabled(false);
		HabilitaCampos.formu(frm);
	}

	public static void cancelar(CircuitoFrm frm, int idQuadro) {

		ApagarDados.formu(frm);

		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(true);
		frm.getMntmSalvar().setEnabled(false);
		frm.getMntmCancelar().setEnabled(false);
		frm.getMntmCopiar().setEnabled(false);
		DesabilitaCampos.formu(frm);
	}

	public static void copiar(CircuitoFrm frm, int idQuadro) {
		CircuitoService service = new CircuitoService();
		frm.getLblIdcircuito().setText("0");
		service.salvar(FormToCircuito.copia(frm), idQuadro);
		ApagarDados.formu(frm);
		DesabilitaCampos.formu(frm);
		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(true);
		frm.getMntmSalvar().setEnabled(false);
		frm.getMntmCancelar().setEnabled(false);
		frm.getMntmCopiar().setEnabled(false);
	}

}
