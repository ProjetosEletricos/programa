package programa.janelas.equipamento;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Locale;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class EquipamentoFrm extends JInternalFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtQuantidade;
	private JTextField txtPotencia;
	private JFormattedTextField txtFtSimutaneiedade;
	private JTextField txtFtDemanda;
	private JTextField txtFtServico;
	private JTextField txtFtPotencia;
	private JTextField txtFtUtilizacao;
	private JTextField txtPerdasReator;
	private JTable tableEquipamentos;
	private JMenuItem mntmInserir;
	private JMenuItem mntmSalvar;
	private JMenuItem mntmExcluir;
	private JMenuItem mntmCancelar;
	private JMenuItem mntmCopiar;
	private JLabel lblIdequipamento;
	private JTextPane txtpnDescricao;
	private JComboBox<String> cbUsabilidade;
	private JComboBox<String> cbUniPotencia;
	private JComboBox<String> cbLigacao;
	private JComboBox<String> cbNpolos;
	private JFormattedTextField txtRendimento;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EquipamentoFrm frame = new EquipamentoFrm();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	


	public EquipamentoFrm() {
		setClosable(true);
		setIconifiable(true);
		setMaximizable(true);

		setTitle("Equipamentos");
		setBounds(100, 100, 421, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(0, 0, 417, 20);
		contentPane.add(panel);
		panel.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 417, 20);
		panel.add(menuBar);

		JMenu mnArquivo = new JMenu("Arquivo");
		menuBar.add(mnArquivo);

		mntmInserir = new JMenuItem("Inserir");
		mntmInserir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_MASK));
		mnArquivo.add(mntmInserir);

		mntmCopiar = new JMenuItem("Copiar");
		mnArquivo.add(mntmCopiar);

		JSeparator separator = new JSeparator();
		mnArquivo.add(separator);

		mntmSalvar = new JMenuItem("Salvar");

		mntmSalvar.setEnabled(false);
		mntmSalvar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnArquivo.add(mntmSalvar);

		mntmCancelar = new JMenuItem("Cancelar");
		mntmCancelar.setEnabled(false);
		mnArquivo.add(mntmCancelar);

		mntmExcluir = new JMenuItem("Excluir");
		mntmExcluir.setEnabled(false);
		mntmExcluir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
		mnArquivo.add(mntmExcluir);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(0, 19, 417, 276);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(12, 12, 45, 16);
		panel_1.add(lblNome);

		txtNome = new JTextField();
		txtNome.setName("txtNome");
		txtNome.setBounds(63, 11, 123, 20);
		panel_1.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblQtd = new JLabel("Qtd:");
		lblQtd.setBounds(12, 40, 31, 16);
		panel_1.add(lblQtd);

		txtQuantidade = new JTextField();
		txtQuantidade.setHorizontalAlignment(SwingConstants.CENTER);
		txtQuantidade.setName("txtQuantidade");
		txtQuantidade.setBounds(63, 39, 31, 20);
		panel_1.add(txtQuantidade);
		txtQuantidade.setColumns(10);

		JLabel lblPotncia = new JLabel("Pot\u00EAncia:");
		lblPotncia.setBounds(100, 40, 67, 16);
		panel_1.add(lblPotncia);

		txtPotencia = new JTextField();
		txtPotencia.setHorizontalAlignment(SwingConstants.CENTER);
		txtPotencia.setName("txtPotencia");
		txtPotencia.setBounds(172, 39, 89, 20);
		panel_1.add(txtPotencia);
		txtPotencia.setColumns(10);

		cbUniPotencia = new JComboBox<String>();
		cbUniPotencia.setModel(new DefaultComboBoxModel<String>(new String[] { "W", "CV", "VA", "BTU" }));

		cbUniPotencia.setBounds(270, 38, 45, 20);
		panel_1.add(cbUniPotencia);

		JLabel lblUsabilidade = new JLabel("Usabilidade:");
		lblUsabilidade.setBounds(196, 12, 89, 16);
		panel_1.add(lblUsabilidade);

		cbUsabilidade = new JComboBox<String>();
		cbUsabilidade.setModel(new DefaultComboBoxModel<String>(new String[] { "Ilumina\u00E7\u00E3o", "For\u00E7a" }));
		cbUsabilidade.setSelectedIndex(0);

		cbUsabilidade.setBounds(288, 10, 111, 20);
		panel_1.add(cbUsabilidade);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 68, 190, 202);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNDePolos = new JLabel("N\u00B0 de p\u00F3los:");
		lblNDePolos.setBounds(1, 2, 130, 16);
		panel_2.add(lblNDePolos);

		cbNpolos = new JComboBox<String>();
		cbNpolos.setModel(new DefaultComboBoxModel<String>(new String[] { "4", "2" }));

		cbNpolos.setBounds(136, 0, 42, 20);
		panel_2.add(cbNpolos);

		JLabel lblRendimento = new JLabel("Rendimento:");
		lblRendimento.setBounds(1, 32, 95, 16);
		panel_2.add(lblRendimento);

		JLabel lblFatorDemanda = new JLabel("Fator de demanda:");
		lblFatorDemanda.setBounds(0, 92, 142, 16);
		panel_2.add(lblFatorDemanda);

		JLabel lblFatorDeSimutaniedade = new JLabel("Fator de simutani.:");
		lblFatorDeSimutaniedade.setBounds(0, 62, 142, 16);
		panel_2.add(lblFatorDeSimutaniedade);

		JLabel lblFatorDeServio = new JLabel("Fator de servi\u00E7o:");
		lblFatorDeServio.setBounds(0, 152, 131, 16);
		panel_2.add(lblFatorDeServio);

		JLabel lblFatorDePotncia = new JLabel("Fator de pot\u00EAncia:");
		lblFatorDePotncia.setBounds(0, 182, 131, 16);
		panel_2.add(lblFatorDePotncia);

		JLabel lblFatorDeUtilizacao = new JLabel("Fator de utiliza\u00E7\u00E3o:");
		lblFatorDeUtilizacao.setBounds(0, 122, 142, 16);
		panel_2.add(lblFatorDeUtilizacao);

		txtFtSimutaneiedade = new JFormattedTextField();
		txtFtSimutaneiedade.setHorizontalAlignment(SwingConstants.CENTER);
		txtFtSimutaneiedade.setName("txtFtSimutaneiedade");
		txtFtSimutaneiedade.setBounds(146, 60, 32, 20);
		panel_2.add(txtFtSimutaneiedade);
		txtFtSimutaneiedade.setColumns(10);

		txtFtDemanda = new JTextField();
		txtFtDemanda.setHorizontalAlignment(SwingConstants.CENTER);
		txtFtDemanda.setName("txtFtDemanda");
		txtFtDemanda.setBounds(146, 90, 32, 20);
		panel_2.add(txtFtDemanda);
		txtFtDemanda.setColumns(10);

		txtFtUtilizacao = new JTextField();
		txtFtUtilizacao.setHorizontalAlignment(SwingConstants.CENTER);
		txtFtUtilizacao.setName("txtFtUtilizacao");
		txtFtUtilizacao.setBounds(146, 120, 32, 20);
		panel_2.add(txtFtUtilizacao);
		txtFtUtilizacao.setColumns(10);

		txtFtServico = new JTextField();
		txtFtServico.setHorizontalAlignment(SwingConstants.CENTER);
		txtFtServico.setName("txtFtServico");
		txtFtServico.setBounds(146, 150, 32, 20);
		panel_2.add(txtFtServico);
		txtFtServico.setColumns(10);

		txtFtPotencia = new JTextField();
		txtFtPotencia.setHorizontalAlignment(SwingConstants.CENTER);
		txtFtPotencia.setName("txtFtPotencia");
		txtFtPotencia.setBounds(146, 180, 32, 20);
		panel_2.add(txtFtPotencia);
		txtFtPotencia.setColumns(10);

		txtRendimento = new JFormattedTextField();

		txtRendimento.setLocale(new Locale("pt", "BR"));
		txtRendimento.setHorizontalAlignment(SwingConstants.CENTER);
		txtRendimento.setName("txtRendimento");
		txtRendimento.setBounds(146, 30, 32, 20);
		panel_2.add(txtRendimento);

		JLabel lblPerdasNoReator = new JLabel("Perdas no reator (W):");
		lblPerdasNoReator.setBounds(210, 99, 154, 16);
		panel_1.add(lblPerdasNoReator);

		txtPerdasReator = new JTextField();
		txtPerdasReator.setHorizontalAlignment(SwingConstants.CENTER);
		txtPerdasReator.setName("txtPerdasReator");
		txtPerdasReator.setBounds(368, 97, 31, 20);
		panel_1.add(txtPerdasReator);
		txtPerdasReator.setColumns(10);

		JLabel lblLigao = new JLabel("Liga\u00E7\u00E3o:");
		lblLigao.setBounds(209, 70, 67, 16);
		panel_1.add(lblLigao);

		cbLigacao = new JComboBox<String>();
		cbLigacao.setModel(new DefaultComboBoxModel<String>(new String[] { "FF", "FN", "FFF", "FFFN" }));

		cbLigacao.setBounds(270, 68, 45, 20);
		panel_1.add(cbLigacao);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(209, 144, 190, 64);
		panel_1.add(scrollPane);

		txtpnDescricao = new JTextPane();
		scrollPane.setViewportView(txtpnDescricao);
		txtpnDescricao.setName("txtpnDescricao");

		JLabel lblLocalDescrio = new JLabel("Local / Descri\u00E7\u00E3o:");
		lblLocalDescrio.setBounds(210, 127, 135, 16);
		panel_1.add(lblLocalDescrio);

		lblIdequipamento = new JLabel("");
		lblIdequipamento.setBounds(333, 68, 55, 16);
		panel_1.add(lblIdequipamento);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 295, 411, 133);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 12, 387, 109);
		panel_3.add(scrollPane_1);

		tableEquipamentos = new JTable();
		scrollPane_1.setViewportView(tableEquipamentos);

		listener();
	}

	public void listener() {

	new EquipamentoActionListener(this);
		
	}
	
	public void setPosicao() {
	    Dimension d = this.getDesktopPane().getSize();
	    this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
	}


	public JTextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}

	public JTextField getTxtQuantidade() {
		return txtQuantidade;
	}

	public void setTxtQuantidade(JTextField txtQuantidade) {
		this.txtQuantidade = txtQuantidade;
	}

	public JTextField getTxtPotencia() {
		return txtPotencia;
	}

	public void setTxtPotencia(JTextField txtPotencia) {
		this.txtPotencia = txtPotencia;
	}

	public JFormattedTextField getTxtFtSimutaneiedade() {
		return txtFtSimutaneiedade;
	}

	public void setTxtFtSimutaneiedade(JFormattedTextField txtFtSimutaneiedade) {
		this.txtFtSimutaneiedade = txtFtSimutaneiedade;
	}

	public JTextField getTxtFtDemanda() {
		return txtFtDemanda;
	}

	public void setTxtFtDemanda(JTextField txtFtDemanda) {
		this.txtFtDemanda = txtFtDemanda;
	}

	public JTextField getTxtFtServico() {
		return txtFtServico;
	}

	public void setTxtFtServico(JTextField txtFtServico) {
		this.txtFtServico = txtFtServico;
	}

	public JFormattedTextField getTxtRendimento() {
		return txtRendimento;
	}

	public void setTxtRendimento(JFormattedTextField txtRendimento) {
		this.txtRendimento = txtRendimento;
	}

	public JTextField getTxtFtPotencia() {
		return txtFtPotencia;
	}

	public void setTxtFtPotencia(JTextField txtFtPotencia) {
		this.txtFtPotencia = txtFtPotencia;
	}

	public JTextField getTxtFtUtilizacao() {
		return txtFtUtilizacao;
	}

	public void setTxtFtUtilizacao(JTextField txtFtUtilizacao) {
		this.txtFtUtilizacao = txtFtUtilizacao;
	}

	public JTextField getTxtPredasreator() {
		return txtPerdasReator;
	}

	public void setTxtPredasreator(JTextField txtPredasreator) {
		this.txtPerdasReator = txtPredasreator;
	}

	public JTable getTableEquipamentos() {
		return tableEquipamentos;
	}

	public void setTableEquipamentos(JTable tableEquipamentos) {
		this.tableEquipamentos = tableEquipamentos;
	}

	public JMenuItem getMntmInserir() {
		return mntmInserir;
	}

	public void setMntmInserir(JMenuItem mntmInserir) {
		this.mntmInserir = mntmInserir;
	}

	public JMenuItem getMntmSalvar() {
		return mntmSalvar;
	}

	public void setMntmSalvar(JMenuItem mntmSalvar) {
		this.mntmSalvar = mntmSalvar;
	}

	public JMenuItem getMntmExcluir() {
		return mntmExcluir;
	}

	public void setMntmExcluir(JMenuItem mntmExcluir) {
		this.mntmExcluir = mntmExcluir;
	}

	public JLabel getlblIdEquipamento() {
		return lblIdequipamento;
	}

	public void setlblIdequipamento(JLabel lblIdequipamento) {
		this.lblIdequipamento = lblIdequipamento;
	}

	public JTextPane getTxtpnDescricao() {
		return txtpnDescricao;
	}

	public void setTxtpnDescricao(JTextPane txtpnDescricao) {
		this.txtpnDescricao = txtpnDescricao;
	}

	public JComboBox<?> getCbUsabilidade() {
		return cbUsabilidade;
	}

	public void setCbUsabilidade(JComboBox<String> cbUsabilidade) {
		this.cbUsabilidade = cbUsabilidade;
	}

	public JComboBox<?> getCbUniPotencia() {
		return cbUniPotencia;
	}

	public void setCbUniPotencia(JComboBox<String> cbUniPotencia) {
		this.cbUniPotencia = cbUniPotencia;
	}

	public JComboBox<?> getCbNpolos() {
		return cbNpolos;
	}

	public void setCbNpolos(JComboBox<String> cbNpolos) {
		this.cbNpolos = cbNpolos;
	}

	public JComboBox<?> getCbLigacao() {
		return cbLigacao;
	}

	public void setCbLigacao(JComboBox<String> cbLigacao) {
		this.cbLigacao = cbLigacao;
	}

	public JMenuItem getMntmCancelar() {
		return mntmCancelar;
	}

	public void setMntmCancelar(JMenuItem mntmCancelar) {
		this.mntmCancelar = mntmCancelar;
	}

	public JMenuItem getMntmCopiar() {
		return mntmCopiar;
	}

	public void setMntmCopiar(JMenuItem mntmCopiar) {
		this.mntmCopiar = mntmCopiar;
	}




}
