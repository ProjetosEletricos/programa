package programa.janelas.equipamento.extras;

import javax.swing.JOptionPane;

import programa.servico.EquipamentoService;
import programa.janelas.equipamento.EquipamentoFrm;

public class Botao {

	public static void salvar(EquipamentoFrm frm, EquipamentoService service) {

		try {
			service.salvar(FormToEquipamento.copia(frm));
		} catch (Exception e) {
			System.out.println("Não coseguiu salvar! erro em EquipamentoActionListener()/salvar()");
		}
		
		DesabilitaCampos.formu(frm);
		//atualizaCircuitoFrm();
		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(true);
		frm.getMntmSalvar().setEnabled(false);
		frm.getMntmCancelar().setEnabled(false);
		frm.getMntmCopiar().setEnabled(false);

		JOptionPane.showMessageDialog(frm, "Equipamento Salvo", "Salvar", JOptionPane.INFORMATION_MESSAGE);

	}

	public static void excluir(EquipamentoFrm frm, EquipamentoService service) {
		//service.excluir(excluirDados());
		ApagarDados.formu(frm);

		//atualizaCircuitoFrm();
		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(true);
		frm.getMntmSalvar().setEnabled(false);
		frm.getMntmCancelar().setEnabled(false);
		frm.getMntmCopiar().setEnabled(false);
		DesabilitaCampos.formu(frm);
	}

	public static void inserir(EquipamentoFrm frm, EquipamentoService service) {
		ApagarDados.formu(frm);
		
		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(false);
		frm.getMntmSalvar().setEnabled(true);
		frm.getMntmCancelar().setEnabled(true);
		frm.getMntmCopiar().setEnabled(false);
		Habilitacampos.formu(frm);
	}

	public static void cancelar(EquipamentoFrm frm, EquipamentoService service) {

		ApagarDados.formu(frm);
		
		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(true);
		frm.getMntmSalvar().setEnabled(false);
		frm.getMntmCancelar().setEnabled(false);
		frm.getMntmCopiar().setEnabled(false);
		DesabilitaCampos.formu(frm);
	}

	public static void copiar(EquipamentoFrm frm, EquipamentoService service) {
		service.salvar(FormToEquipamento.copia(frm, "0"));
		
		DesabilitaCampos.formu(frm);
		frm.getMntmExcluir().setEnabled(false);
		frm.getMntmInserir().setEnabled(true);
		frm.getMntmSalvar().setEnabled(false);
		frm.getMntmCancelar().setEnabled(false);
		frm.getMntmCopiar().setEnabled(false);
	}

}
