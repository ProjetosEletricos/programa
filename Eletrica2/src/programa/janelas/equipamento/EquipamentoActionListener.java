package programa.janelas.equipamento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;

import javax.swing.table.TableModel;

import programa.Equipamento;
import programa.servico.EquipamentoService;
import programa.janelas.equipamento.extras.Botao;
import programa.janelas.equipamento.extras.DesabilitaCampos;

public class EquipamentoActionListener implements ActionListener {

	private EquipamentoFrm frm;
	private EquipamentoService service;
	private EquipamentoTableModel tableModel;
	private List<Equipamento> equipamentos;

	public EquipamentoActionListener(EquipamentoFrm frm) {
		this.frm = frm;
		this.service = new EquipamentoService();
		this.inicializa_TabelaEquipamentos();
		this.adiciona_ActionListener();
		this.adiciona_ListSelectionListener();
		this.adiciona_KeyListener();

		DesabilitaCampos.formu(frm);
	}

	protected void adiciona_ActionListener() {

		frm.getMntmExcluir().addActionListener(this);
		frm.getMntmInserir().addActionListener(this);
		frm.getMntmSalvar().addActionListener(this);
		frm.getMntmCancelar().addActionListener(this);
		frm.getMntmCopiar().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent event) {

		if (event.getActionCommand().equals("Inserir")) {
			Botao.inserir(frm, service);
			atualiza_TabelaEquipamentos();
		} else if (event.getActionCommand().equals("Excluir")) {
			Botao.excluir(frm, service);
			atualiza_TabelaEquipamentos();
		} else if (event.getActionCommand().equals("Salvar")) {
			Botao.salvar(frm, service);
			atualiza_TabelaEquipamentos();
		} else if (event.getActionCommand().equals("Cancelar")) {
			Botao.cancelar(frm, service);
			atualiza_TabelaEquipamentos();
		} else if (event.getActionCommand().equals("Copiar")) {
			Botao.copiar(frm, service);
			atualiza_TabelaEquipamentos();
		}

	}

	private void inicializa_TabelaEquipamentos() {

		this.equipamentos = service.getEquipamentos(new HashMap<Object, Object>());
		this.tableModel = new EquipamentoTableModel(equipamentos);
		frm.getTableEquipamentos().setModel(this.tableModel);

	}

	private void adiciona_ListSelectionListener() {

		new Equipamento_ListSelectionListener(this.frm, this.tableModel)
				.add(frm.getTableEquipamentos().getSelectionModel());

	}

	private void adiciona_KeyListener() {

		new Equipamento_KeyListener(frm);
	}

	private void atualiza_TabelaEquipamentos() {
		
		this.equipamentos = service.getEquipamentos(new HashMap<Object, Object>());
		this.tableModel.setEquipamentos(equipamentos);
		frm.getTableEquipamentos().setModel(this.tableModel);
		frm.getTableEquipamentos().updateUI();

		try {
			frm.getTableEquipamentos().clearSelection();
		} catch (ArrayIndexOutOfBoundsException e) {
			// System.out.println("Retornando -1 em atualizaTableModel() na
			// EquipamentoActionListener(): " + e);

		}

	}

	public void filtraUmEquipamento(HashMap<Object, Object> filtro) {


		limpaTabela();
		this.equipamentos = service.getEquipamentos(filtro);

		this.tableModel.setEquipamentos(equipamentos);
		frm.getTableEquipamentos().setModel(this.tableModel);

		frm.getTableEquipamentos().updateUI();
		// frm.getTableEquipamentos().selectAll();
		frm.getMntmExcluir().setEnabled(true);
		frm.getMntmInserir().setEnabled(false);
		frm.getMntmSalvar().setEnabled(true);
		frm.getMntmCancelar().setEnabled(false);
		frm.getMntmCopiar().setEnabled(false);

	}

	public void limpaTabela() {

		this.equipamentos.clear();
		this.equipamentos.add(service.registroEmBranco());

		this.tableModel.setEquipamentos(equipamentos);
		frm.getTableEquipamentos().setModel(this.tableModel);

		frm.getTableEquipamentos().updateUI();

	}

}
