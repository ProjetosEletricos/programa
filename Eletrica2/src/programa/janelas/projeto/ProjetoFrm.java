package programa.janelas.projeto;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import auxiliar.Data;
import net.miginfocom.swing.MigLayout;
import programa.Circuito;
import programa.Fonte;
import programa.Projeto;
import programa.Quadro;
import programa.janelas.circuito.CircuitoActionListener;
import programa.janelas.circuito.CircuitoKeyListener;
import programa.janelas.circuito.CircuitoListSelectionListener;
import programa.janelas.circuito.extras.CircuitoApagarDados;
import programa.janelas.fonte.FonteActionListener;
import programa.janelas.fonte.FonteListSelectionListener;
import programa.janelas.fonte.FontesKeyListener;
import programa.janelas.fonte.extras.FonteApagarDados;
import programa.janelas.fonte.extras.FonteTableModel;
import programa.janelas.projeto.extras.ProjetoTableModel;
import programa.janelas.quadro.QuadroActionListener;
import programa.janelas.quadro.QuadroKeyListener;
import programa.janelas.quadro.QuadroListSelectionListener;
import programa.janelas.quadro.QuadroPopupMenuListener;
import programa.janelas.quadro.extras.QuadroApagarDados;
import programa.janelas.quadro.extras.QuadroTableModel;
import programa.servico.CircuitoService;
import programa.servico.FonteService;
import programa.servico.ProjetoService;
import programa.servico.QuadroService;

public class ProjetoFrm extends JInternalFrame {

	private JPanel contentPane;
	private JComboBox<String> cbNCamadas;
	private JComboBox<String> cbEnterrado;
	private JComboBox<String> cbEspacoCabos;
	private JComboBox<String> cbMultipolar;
	private JComboBox<String> cbFormaAgrupamento;
	private JComboBox<String> cbCirAgrupados;
	private JComboBox<String> cbQuantidade;
	private JComboBox<String> cbBitolasSuessivas;
	private JComboBox<String> cbPolos;
	private JComboBox<String> txtIsolacao;
	private JComboBox<String> txtmodoInstalacao;
	private JComboBox<String> txtMaterial;
	private JTabbedPane abas;
	private JButton btnSalvarProjeto;
	private JButton btnExcluirProjeto;
	private JButton btnCopiarProjeto;
	private JList<Circuito> listCircuitos;

	@SuppressWarnings("unused")
	private static ProjetoActionListener listener;
	private JTextField txtQTensaoCircuito;
	private JTextField txtResistividadeTermCircuito;
	private JTextField txtTemperaturaCircuito;
	private JTable tableEquipamentoGeral;
	private JTextField txtNomeProjeto;
	private JTextField txtData;
	private JTextField txtAutor;
	private JTable tableProjetos;
	private JTextField txtTensaoFonte;
	private JTable tableFontes;
	private JTextField txtNomeQuadro;
	private JTextField txtLocalQuadro;
	private JTextField txtFdQuadro;
	private JTable tableQuadros;
	private JTextField txtFpQuadro;
	private JTextField txtComprimentoCircuito;
	private JTextField txtNomeEquipamento;
	private JTextField txtLocalEquipamento;
	private JTextField txtPotenciaEquipamento;
	private JTextField txtPerdas;
	private JTextField txtFpEquipamento;
	private JTextField txtRendimento;
	private JTextField txtFdEquipamento;
	private JTextField txtFUtilizacao;
	private JTextField txtFServico;
	private JTextField txtFSimutaneadade;
	private JComboBox<String> cbConcessionaria;
	private JComboBox<String> cbUsabilidadeQuadro;
	private JComboBox<String> cbDrQuadro;
	private JComboBox<Quadro> cbQuadroPai;
	private JButton btnSalvarQuadro;
	private JButton btnExcluirQuadro;
	private JButton btnCopiarQuadro;
	private JLabel lblIdQuadro;

	private JComboBox<String> cbUnidadePotEquipa;
	private JComboBox<Object> cbLigacaoEquipamento;
	private JButton btnSalvarFonte;
	private JButton btnExcluirFonte;
	private JButton btnCopiarFonte;
	private JLabel lblIdProjeto;
	private JButton btnSalvarEquipamento;
	private JButton btnDeletarEquipamento;
	private JButton btnCopiarEquipamento;
	private JLabel lblIdCircuito;
	private JButton btnCopiarCircuito;
	private JButton btnExcluirCircuito;
	private JButton btnSalvarCircuito;
	private JTextPane txtDescricaoProjeto;
	private JPanel panelFonte;
	private JPanel panelQuadro;
	private JLabel lblIdFonte;
	private JTextField txtNomeCircuito;
	private JLabel lblIdCondutor;
	private JPanel panelCircuito;

	public ProjetoFrm() {
		setClosable(true);
		setIconifiable(true);
		setMaximizable(true);
		setBounds(100, 100, 700, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 690, 367);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		abas = new JTabbedPane(JTabbedPane.TOP);
		abas.setBounds(0, 0, 692, 370);
		panel_3.add(abas);

		JPanel panel_9 = new JPanel();
		abas.addTab("Projeto", null, panel_9, null);
		panel_9.setLayout(null);

		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new TitledBorder(null, "Descri\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null,
				Color.BLUE));
		panel_10.setBounds(10, 45, 193, 284);
		panel_9.add(panel_10);

		JPanel panel_11 = new JPanel();
		panel_11.setBorder(null);
		panel_11.setBounds(8, 17, 179, 103);
		panel_10.add(panel_11);
		panel_11.setLayout(new MigLayout("", "[][grow]", "[][][]"));

		JLabel label_3 = new JLabel("Nome:");
		panel_11.add(label_3, "cell 0 0,alignx left");

		txtNomeProjeto = new JTextField();
		txtNomeProjeto.setName("txtNome");
		txtNomeProjeto.setColumns(10);
		panel_11.add(txtNomeProjeto, "cell 1 0,growx");

		JLabel label_4 = new JLabel("Data:");
		panel_11.add(label_4, "cell 0 1,alignx left");

		txtData = new JTextField();
		txtData.setName("txtData");
		txtData.setColumns(10);
		txtData.setActionCommand("txtData");
		panel_11.add(txtData, "cell 1 1,growx");

		JLabel label_5 = new JLabel("Autor:");
		panel_11.add(label_5, "cell 0 2,alignx left");

		txtAutor = new JTextField();
		txtAutor.setName("txtAutor");
		txtAutor.setColumns(10);
		panel_11.add(txtAutor, "cell 1 2,growx");

		JLabel label_1 = new JLabel("Descri\u00E7\u00E3o:");
		label_1.setBounds(18, 120, 88, 15);
		panel_10.add(label_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 136, 159, 136);
		panel_10.add(scrollPane);

		txtDescricaoProjeto = new JTextPane();
		scrollPane.setViewportView(txtDescricaoProjeto);

		JLabel label_2 = new JLabel("");
		label_2.setName("lblIdProjeto");
		label_2.setBounds(107, 105, 70, 15);
		panel_10.add(label_2);

		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Cadastrados",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_12.setBounds(205, 45, 470, 284);
		panel_9.add(panel_12);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(12, 16, 446, 256);
		panel_12.add(scrollPane_3);

		tableProjetos = new JTable();
		scrollPane_3.setViewportView(tableProjetos);

		JPanel panel_18 = new JPanel();
		panel_18.setBounds(12, 0, 116, 43);
		panel_9.add(panel_18);
		panel_18.setLayout(new MigLayout("", "[][][][]", "[]"));

		btnSalvarProjeto = new JButton("");
		btnSalvarProjeto.setName("btnSalvarProjeto");
		btnSalvarProjeto.setBackground(Color.GRAY);
		btnSalvarProjeto.setIcon(new ImageIcon(ProjetoFrm.class.getResource("/programa/janelas/images/add1-24.png")));
		btnSalvarProjeto.setSelectedIcon(null);
		btnSalvarProjeto.setMaximumSize(new Dimension(30, 30));
		panel_18.add(btnSalvarProjeto, "cell 0 0");

		btnExcluirProjeto = new JButton("");
		btnExcluirProjeto.setName("btnExcluirProjeto");
		btnExcluirProjeto.setBackground(Color.GRAY);
		btnExcluirProjeto.setIcon(new ImageIcon(ProjetoFrm.class.getResource("/programa/janelas/images/close24.png")));
		btnExcluirProjeto.setMaximumSize(new Dimension(30, 30));
		panel_18.add(btnExcluirProjeto, "cell 1 0");

		btnCopiarProjeto = new JButton("");
		btnCopiarProjeto.setName("btnCopiarProjeto");
		btnCopiarProjeto.setBackground(Color.GRAY);
		btnCopiarProjeto.setIcon(new ImageIcon(ProjetoFrm.class.getResource("/programa/janelas/images/copy24.png")));
		btnCopiarProjeto.setMaximumSize(new Dimension(30, 30));
		panel_18.add(btnCopiarProjeto, "cell 2 0");

		lblIdProjeto = new JLabel("");
		lblIdProjeto.setBounds(146, 20, 70, 15);
		panel_9.add(lblIdProjeto);

		panelFonte = new JPanel();
		abas.addTab("Fonte", null, panelFonte, null);
		panelFonte.setLayout(null);

		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Informa\u00E7\u00F5es",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_15.setBounds(12, 44, 352, 80);
		panelFonte.add(panel_15);

		JLabel label_6 = new JLabel("Tens\u00E3o nominal (F-N):");
		label_6.setBounds(12, 19, 154, 16);
		panel_15.add(label_6);

		JLabel label_9 = new JLabel("V");
		label_9.setBounds(217, 20, 18, 16);
		panel_15.add(label_9);

		JLabel label_10 = new JLabel("Concession\u00E1ria:");
		label_10.setBounds(12, 47, 125, 15);
		panel_15.add(label_10);

		cbConcessionaria = new JComboBox<String>();
		cbConcessionaria.setModel(new DefaultComboBoxModel<>(new String[] { "Light" }));
		cbConcessionaria.setName("cbConcessionaria");
		cbConcessionaria.setBounds(168, 42, 163, 24);
		panel_15.add(cbConcessionaria);

		txtTensaoFonte = new JTextField();
		txtTensaoFonte.setName("txtTensaoFonte");
		txtTensaoFonte.setHorizontalAlignment(SwingConstants.CENTER);
		txtTensaoFonte.setColumns(10);
		txtTensaoFonte.setBounds(168, 18, 45, 22);
		panel_15.add(txtTensaoFonte);

		JPanel panel_19 = new JPanel();
		panel_19.setBounds(12, 0, 116, 43);
		panelFonte.add(panel_19);
		panel_19.setLayout(new MigLayout("", "[][][]", "[]"));

		btnSalvarFonte = new JButton("");
		btnSalvarFonte.setName("btnSalvarFonte");
		btnSalvarFonte.setIcon(new ImageIcon(ProjetoFrm.class.getResource("/programa/janelas/images/add1-24.png")));
		btnSalvarFonte.setMaximumSize(new Dimension(30, 30));
		btnSalvarFonte.setBackground(Color.GRAY);
		panel_19.add(btnSalvarFonte, "cell 0 0");

		btnExcluirFonte = new JButton("");
		btnExcluirFonte.setName("btnExcluirFonte");
		btnExcluirFonte.setIcon(new ImageIcon(ProjetoFrm.class.getResource("/programa/janelas/images/close24.png")));
		btnExcluirFonte.setMaximumSize(new Dimension(30, 30));
		btnExcluirFonte.setBackground(Color.GRAY);
		panel_19.add(btnExcluirFonte, "cell 1 0");

		btnCopiarFonte = new JButton("");
		btnCopiarFonte.setName("btnCopiarFonte");
		btnCopiarFonte.setIcon(new ImageIcon(ProjetoFrm.class.getResource("/programa/janelas/images/copy24.png")));
		btnCopiarFonte.setMaximumSize(new Dimension(30, 30));
		btnCopiarFonte.setBackground(Color.GRAY);
		panel_19.add(btnCopiarFonte, "cell 2 0");

		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Cadastrados",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_20.setBounds(12, 128, 352, 203);
		panelFonte.add(panel_20);
		panel_20.setLayout(null);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(12, 19, 328, 172);
		panel_20.add(scrollPane_4);
		scrollPane_4.setName("scrollPane");

		tableFontes = new JTable();
		scrollPane_4.setViewportView(tableFontes);

		lblIdFonte = new JLabel("");
		lblIdFonte.setName("lblIdFonte");
		lblIdFonte.setBounds(143, 17, 70, 15);
		panelFonte.add(lblIdFonte);

		panelQuadro = new JPanel();
		abas.addTab("Quadro", null, panelQuadro, null);
		panelQuadro.setLayout(null);

		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Descri\u00E7\u00E3o",
				TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_16.setBounds(12, 43, 411, 288);
		panelQuadro.add(panel_16);
		panel_16.setLayout(new MigLayout("", "[][grow][][grow]", "[][][][]"));

		JLabel label_7 = new JLabel("Nome:");
		panel_16.add(label_7, "cell 0 0,alignx trailing");

		txtNomeQuadro = new JTextField();
		txtNomeQuadro.setMaximumSize(new Dimension(100, 2147483647));
		txtNomeQuadro.setColumns(10);
		panel_16.add(txtNomeQuadro, "cell 1 0,growx");

		JLabel label_8 = new JLabel("Usabilidade:");
		panel_16.add(label_8, "cell 2 0,alignx trailing");

		cbUsabilidadeQuadro = new JComboBox<String>();
		cbUsabilidadeQuadro.setModel(new DefaultComboBoxModel<>(new String[] { "Ilumina\u00E7\u00E3o" }));
		cbUsabilidadeQuadro.setName("cbUsabilidade");
		panel_16.add(cbUsabilidadeQuadro, "cell 3 0,growx");

		JLabel label_11 = new JLabel("Local:");
		panel_16.add(label_11, "cell 0 1,alignx trailing");

		txtLocalQuadro = new JTextField();
		txtLocalQuadro.setMaximumSize(new Dimension(100, 2147483647));
		txtLocalQuadro.setColumns(10);
		panel_16.add(txtLocalQuadro, "cell 1 1,growx");

		JLabel label_12 = new JLabel("DR Geral:");
		panel_16.add(label_12, "cell 2 1,alignx trailing");

		cbDrQuadro = new JComboBox<String>();
		cbDrQuadro.setModel(new DefaultComboBoxModel<>(new String[] { "N\u00E3o", "Sim" }));
		cbDrQuadro.setName("cbDrGeral");
		panel_16.add(cbDrQuadro, "cell 3 1,growx");

		JLabel label_13 = new JLabel("FD:");
		panel_16.add(label_13, "cell 0 2,alignx trailing");

		txtFdQuadro = new JTextField();
		txtFdQuadro.setName("txtFdQuadro");
		txtFdQuadro.setMaximumSize(new Dimension(100, 2147483647));
		txtFdQuadro.setColumns(10);
		panel_16.add(txtFdQuadro, "cell 1 2,growx");

		JLabel label_14 = new JLabel("Quadro pai:");
		panel_16.add(label_14, "cell 2 2,alignx trailing");

		cbQuadroPai = new JComboBox<Quadro>();
		cbQuadroPai.setName("cbQuadroPai");
		panel_16.add(cbQuadroPai, "cell 3 2,growx");

		JLabel label_15 = new JLabel("FP:");
		panel_16.add(label_15, "cell 0 3,alignx trailing");

		txtFpQuadro = new JTextField();
		txtFpQuadro.setName("txtFpQuadro");
		txtFpQuadro.setMaximumSize(new Dimension(100, 2147483647));
		txtFpQuadro.setColumns(10);
		panel_16.add(txtFpQuadro, "cell 1 3,growx");

		JPanel panel_17 = new JPanel();
		panel_17.setBorder(
				new TitledBorder(null, "Cadastrados", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_17.setLayout(null);
		panel_17.setBounds(427, 43, 248, 288);
		panelQuadro.add(panel_17);

		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setName("scrollPane");
		scrollPane_5.setBounds(12, 17, 224, 259);
		panel_17.add(scrollPane_5);

		tableQuadros = new JTable();
		tableQuadros.setName("tableQuadros");
		tableQuadros.setAutoscrolls(false);
		scrollPane_5.setViewportView(tableQuadros);

		JPanel panel_21 = new JPanel();
		panel_21.setBounds(12, 0, 116, 43);
		panelQuadro.add(panel_21);
		panel_21.setLayout(new MigLayout("", "[][][]", "[]"));

		btnSalvarQuadro = new JButton("");
		btnSalvarQuadro.setName("btnSalvarQuadro");
		btnSalvarQuadro.setIcon(new ImageIcon(ProjetoFrm.class.getResource("/programa/janelas/images/add1-24.png")));
		btnSalvarQuadro.setMaximumSize(new Dimension(30, 30));
		btnSalvarQuadro.setBackground(Color.GRAY);
		panel_21.add(btnSalvarQuadro, "cell 0 0");

		btnExcluirQuadro = new JButton("");
		btnExcluirQuadro.setName("btnExcluirQuadro");
		btnExcluirQuadro.setIcon(new ImageIcon(ProjetoFrm.class.getResource("/programa/janelas/images/close24.png")));
		btnExcluirQuadro.setMaximumSize(new Dimension(30, 30));
		btnExcluirQuadro.setBackground(Color.GRAY);
		panel_21.add(btnExcluirQuadro, "cell 1 0");

		btnCopiarQuadro = new JButton("");
		btnCopiarQuadro.setName("btnCopiarQuadro");
		btnCopiarQuadro.setIcon(new ImageIcon(ProjetoFrm.class.getResource("/programa/janelas/images/copy24.png")));
		btnCopiarQuadro.setMaximumSize(new Dimension(30, 30));
		btnCopiarQuadro.setBackground(Color.GRAY);
		panel_21.add(btnCopiarQuadro, "cell 2 0");

		lblIdQuadro = new JLabel("");
		lblIdQuadro.setName("lblIdQuadro");
		lblIdQuadro.setBounds(146, 15, 55, 16);
		panelQuadro.add(lblIdQuadro);

		panelCircuito = new JPanel();
		abas.addTab("Circuito", null, panelCircuito, null);
		abas.setEnabledAt(3, true);
		panelCircuito.setLayout(null);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Cadastrados",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_6.setBounds(558, 43, 117, 290);
		panelCircuito.add(panel_6);
		panel_6.setLayout(null);

		JScrollPane scrollLista = new JScrollPane();
		scrollLista.setName("scrollLista");
		scrollLista.setBounds(12, 22, 93, 256);
		panel_6.add(scrollLista);

		listCircuitos = new JList<>();
		listCircuitos.setName("listCircuitos");
		scrollLista.setViewportView(listCircuitos);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(
				new TitledBorder(null, "Propriedades", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_8.setBounds(12, 43, 542, 288);
		panelCircuito.add(panel_8);
		panel_8.setLayout(new MigLayout("", "[][grow][][]", "[][][][][][][][]"));

		JLabel lblComprimento = new JLabel("Nome:");
		panel_8.add(lblComprimento, "cell 0 0,alignx left");

		txtNomeCircuito = new JTextField();
		txtNomeCircuito.setName("txtNomeCircuito");
		txtNomeCircuito.setColumns(3);
		panel_8.add(txtNomeCircuito, "cell 1 0,growx");

		JLabel lblEnterrado = new JLabel("Enterrado:");
		panel_8.add(lblEnterrado, "cell 2 0");

		cbEnterrado = new JComboBox<String>();
		panel_8.add(cbEnterrado, "cell 3 0,growx");
		cbEnterrado.setModel(new DefaultComboBoxModel<String>(new String[] { "N\u00E3o", "Sim" }));
		cbEnterrado.setName("cbEnterrado");

		JLabel lblInstalacao = new JLabel("Instala\u00E7\u00E3o:");
		panel_8.add(lblInstalacao, "cell 0 1");

		txtmodoInstalacao = new JComboBox<>();
		txtmodoInstalacao.setModel(new DefaultComboBoxModel<>(new String[] { "B1", "F" }));
		panel_8.add(txtmodoInstalacao, "cell 1 1,growx");
		txtmodoInstalacao.setName("txtmodoInstalacao");

		JLabel lblEspaoEntreCabos = new JLabel("Espa\u00E7o entre cabos:");
		panel_8.add(lblEspaoEntreCabos, "cell 2 1");

		cbEspacoCabos = new JComboBox<String>();
		panel_8.add(cbEspacoCabos, "cell 3 1,growx");
		cbEspacoCabos.setModel(new DefaultComboBoxModel<String>(new String[] { "modo1", "modo2" }));
		cbEspacoCabos.setName("cbEspacoCabos");

		JLabel lblMaterial = new JLabel("Material:");
		panel_8.add(lblMaterial, "cell 0 2");

		txtMaterial = new JComboBox<>();
		txtMaterial.setModel(new DefaultComboBoxModel<>(new String[] { "Cobre", "Alum\u00EDnio" }));
		panel_8.add(txtMaterial, "cell 1 2,growx");
		txtMaterial.setName("txtMaterial");

		JLabel lblMultipolar = new JLabel("Multipolar:");
		panel_8.add(lblMultipolar, "cell 2 2");

		cbMultipolar = new JComboBox<String>();
		panel_8.add(cbMultipolar, "cell 3 2,growx");
		cbMultipolar.setModel(new DefaultComboBoxModel<String>(new String[] { "N\u00E3o", "Sim" }));
		cbMultipolar.setName("cbMultipolar");

		JLabel lblQuedaTenso = new JLabel("Queda tens\u00E3o:");
		panel_8.add(lblQuedaTenso, "cell 0 3");

		txtQTensaoCircuito = new JTextField();
		panel_8.add(txtQTensaoCircuito, "cell 1 3,growx");
		txtQTensaoCircuito.setName("txtQTensaoCircuito");
		txtQTensaoCircuito.setColumns(3);

		JLabel lblFormaDeAgrupamento = new JLabel("Forma de agrupamento:");
		panel_8.add(lblFormaDeAgrupamento, "cell 2 3");

		cbFormaAgrupamento = new JComboBox<String>();
		panel_8.add(cbFormaAgrupamento, "cell 3 3");
		cbFormaAgrupamento.setModel(new DefaultComboBoxModel<String>(new String[] { "modo1", "modo2", "modo3" }));
		cbFormaAgrupamento.setName("cbFormaAgrupamento");

		JLabel lblIsolao = new JLabel("Isola\u00E7\u00E3o:");
		panel_8.add(lblIsolao, "cell 0 4");

		txtIsolacao = new JComboBox<>();
		txtIsolacao.setModel(new DefaultComboBoxModel<>(new String[] { "PVC", "XLPE" }));
		panel_8.add(txtIsolacao, "cell 1 4,growx");
		txtIsolacao.setName("txtIsolacao");

		JLabel lblSicessivas = new JLabel("Bitolas sucessivas:");
		panel_8.add(lblSicessivas, "cell 2 4");

		cbBitolasSuessivas = new JComboBox<String>();
		panel_8.add(cbBitolasSuessivas, "cell 3 4,growx");
		cbBitolasSuessivas.setName("cbBitolasSuessivas");
		cbBitolasSuessivas.setModel(new DefaultComboBoxModel<String>(new String[] { "Sim", "N\u00E3o" }));

		JLabel lblResistividadeTrmica = new JLabel("Resistividade t\u00E9rmica:");
		panel_8.add(lblResistividadeTrmica, "cell 0 5");

		txtResistividadeTermCircuito = new JTextField();
		panel_8.add(txtResistividadeTermCircuito, "cell 1 5,growx");
		txtResistividadeTermCircuito.setName("txtResistividadeTermCircuito");
		txtResistividadeTermCircuito.setColumns(3);

		JLabel lblNDeCircuitos = new JLabel("N\u00B0 de circuitos agrup.:");
		panel_8.add(lblNDeCircuitos, "cell 2 5");

		cbCirAgrupados = new JComboBox<String>();
		panel_8.add(cbCirAgrupados, "cell 3 5,growx");
		cbCirAgrupados.setName("cbCirAgrupados");
		cbCirAgrupados.setModel(
				new DefaultComboBoxModel<String>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

		JLabel lblTemperatura = new JLabel("Temperatura (\u00B0C):");
		panel_8.add(lblTemperatura, "cell 0 6");

		txtTemperaturaCircuito = new JTextField();
		panel_8.add(txtTemperaturaCircuito, "cell 1 6,growx");
		txtTemperaturaCircuito.setName("txtTemperaturaCircuito");
		txtTemperaturaCircuito.setColumns(3);

		JLabel lblNDeCamadas = new JLabel("N\u00B0 de camadas:");
		panel_8.add(lblNDeCamadas, "cell 2 6");

		cbNCamadas = new JComboBox<String>();
		panel_8.add(cbNCamadas, "cell 3 6,growx");
		cbNCamadas.setModel(
				new DefaultComboBoxModel<String>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
		cbNCamadas.setName("cbNCamadas");

		JLabel label_16 = new JLabel("Comprimento (m):");
		panel_8.add(label_16, "cell 0 7,alignx left");

		txtComprimentoCircuito = new JTextField();
		txtComprimentoCircuito.setName("txtTemperaturaCircuito");
		txtComprimentoCircuito.setColumns(3);
		panel_8.add(txtComprimentoCircuito, "cell 1 7,growx");

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 0, 116, 43);
		panelCircuito.add(panel_2);
		panel_2.setLayout(new MigLayout("", "[][][]", "[]"));

		btnSalvarCircuito = new JButton("");
		btnSalvarCircuito.setName("btnSalvarCircuito");
		btnSalvarCircuito.setIcon(new ImageIcon(ProjetoFrm.class.getResource("/programa/janelas/images/add1-24.png")));
		btnSalvarCircuito.setMaximumSize(new Dimension(30, 30));
		btnSalvarCircuito.setBackground(Color.GRAY);
		panel_2.add(btnSalvarCircuito, "cell 0 0");

		btnExcluirCircuito = new JButton("");
		btnExcluirCircuito.setName("btnExcluirCircuito");
		btnExcluirCircuito.setIcon(new ImageIcon(ProjetoFrm.class.getResource("/programa/janelas/images/close24.png")));
		btnExcluirCircuito.setMaximumSize(new Dimension(30, 30));
		btnExcluirCircuito.setBackground(Color.GRAY);
		panel_2.add(btnExcluirCircuito, "cell 1 0");

		btnCopiarCircuito = new JButton("");
		btnCopiarCircuito.setName("btnCopiarCircuito");
		btnCopiarCircuito.setIcon(new ImageIcon(ProjetoFrm.class.getResource("/programa/janelas/images/copy24.png")));
		btnCopiarCircuito.setMaximumSize(new Dimension(30, 30));
		btnCopiarCircuito.setBackground(Color.GRAY);
		panel_2.add(btnCopiarCircuito, "cell 2 0");

		lblIdCircuito = new JLabel("");
		lblIdCircuito.setBounds(146, 16, 70, 15);
		panelCircuito.add(lblIdCircuito);

		lblIdCondutor = new JLabel("");
		lblIdCondutor.setName("lblIdCondutor");
		lblIdCondutor.setBounds(226, 16, 70, 15);
		panelCircuito.add(lblIdCondutor);

		JPanel panel_5 = new JPanel();
		abas.addTab("Equipamento", null, panel_5, null);
		panel_5.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Cadastrados",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_1.setBounds(469, 47, 206, 284);
		panel_5.add(panel_1);
		panel_1.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 17, 182, 255);
		panel_1.add(scrollPane_1);

		tableEquipamentoGeral = new JTable();
		tableEquipamentoGeral.setName("tableEquipamentoGeral");
		scrollPane_1.setViewportView(tableEquipamentoGeral);

		JPanel panel_22 = new JPanel();
		panel_22.setBounds(12, 0, 116, 43);
		panel_5.add(panel_22);
		panel_22.setLayout(new MigLayout("", "[][][]", "[]"));

		btnSalvarEquipamento = new JButton("");
		btnSalvarEquipamento.setName("btnSalvarEquipamento");
		btnSalvarEquipamento
				.setIcon(new ImageIcon(ProjetoFrm.class.getResource("/programa/janelas/images/add1-24.png")));
		btnSalvarEquipamento.setMaximumSize(new Dimension(30, 30));
		btnSalvarEquipamento.setBackground(Color.GRAY);
		panel_22.add(btnSalvarEquipamento, "cell 0 0");

		btnDeletarEquipamento = new JButton("");
		btnDeletarEquipamento.setName("btnDeletarEquipamento");
		btnDeletarEquipamento
				.setIcon(new ImageIcon(ProjetoFrm.class.getResource("/programa/janelas/images/close24.png")));
		btnDeletarEquipamento.setMaximumSize(new Dimension(30, 30));
		btnDeletarEquipamento.setBackground(Color.GRAY);
		panel_22.add(btnDeletarEquipamento, "cell 1 0");

		btnCopiarEquipamento = new JButton("");
		btnCopiarEquipamento.setName("btnCopiarEquipamento");
		btnCopiarEquipamento
				.setIcon(new ImageIcon(ProjetoFrm.class.getResource("/programa/janelas/images/copy24.png")));
		btnCopiarEquipamento.setMaximumSize(new Dimension(30, 30));
		btnCopiarEquipamento.setBackground(Color.GRAY);
		panel_22.add(btnCopiarEquipamento, "cell 2 0");

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Informa\u00E7\u00F5es",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_7.setBounds(12, 47, 451, 284);
		panel_5.add(panel_7);
		panel_7.setLayout(new MigLayout("", "[][grow][grow][][grow]", "[][][][][][][][]"));

		JLabel lblNewLabel = new JLabel("Nome:");
		panel_7.add(lblNewLabel, "cell 0 0,alignx left");

		txtNomeEquipamento = new JTextField();
		txtNomeEquipamento.setMaximumSize(new Dimension(120, 2147483647));
		panel_7.add(txtNomeEquipamento, "cell 1 0,growx");
		txtNomeEquipamento.setColumns(10);

		JLabel lblFp = new JLabel("FP:");
		panel_7.add(lblFp, "cell 3 0,alignx left");

		txtFpEquipamento = new JTextField();
		txtFpEquipamento.setMaximumSize(new Dimension(50, 2147483647));
		txtFpEquipamento.setColumns(10);
		panel_7.add(txtFpEquipamento, "cell 4 0,growx");

		JLabel lblLocal = new JLabel("Local/Descr:");
		panel_7.add(lblLocal, "cell 0 1,alignx left");

		txtLocalEquipamento = new JTextField();
		txtLocalEquipamento.setMaximumSize(new Dimension(120, 2147483647));
		txtLocalEquipamento.setColumns(10);
		panel_7.add(txtLocalEquipamento, "cell 1 1,growx");

		JLabel lblRendimento = new JLabel("Rendimento:");
		panel_7.add(lblRendimento, "cell 3 1,alignx left");

		txtRendimento = new JTextField();
		txtRendimento.setMaximumSize(new Dimension(50, 2147483647));
		txtRendimento.setColumns(10);
		panel_7.add(txtRendimento, "cell 4 1,growx");

		JLabel lblNewLabel_1 = new JLabel("Usabilidade:");
		panel_7.add(lblNewLabel_1, "cell 0 2,alignx left");

		JLabel lblFd = new JLabel("Fd:");
		panel_7.add(lblFd, "cell 3 2,alignx left");

		txtFdEquipamento = new JTextField();
		txtFdEquipamento.setMaximumSize(new Dimension(50, 2147483647));
		txtFdEquipamento.setColumns(10);
		panel_7.add(txtFdEquipamento, "cell 4 2,growx");

		JLabel lblQuantidade_1 = new JLabel("Quantidade:");
		panel_7.add(lblQuantidade_1, "cell 0 3,alignx left");

		cbQuantidade = new JComboBox<>();
		cbQuantidade.setMaximumSize(new Dimension(100, 32767));
		panel_7.add(cbQuantidade, "cell 1 3");
		cbQuantidade.setModel(
				new DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

		JLabel lblFutil = new JLabel("FUtil:");
		panel_7.add(lblFutil, "cell 3 3,alignx left");

		txtFUtilizacao = new JTextField();
		txtFUtilizacao.setMaximumSize(new Dimension(50, 2147483647));
		txtFUtilizacao.setColumns(10);
		panel_7.add(txtFUtilizacao, "cell 4 3,growx");

		JLabel lblQuantidade = new JLabel("Pot\u00EAncia:");
		panel_7.add(lblQuantidade, "cell 0 4,alignx left");

		txtPotenciaEquipamento = new JTextField();
		txtPotenciaEquipamento.setMaximumSize(new Dimension(120, 2147483647));
		txtPotenciaEquipamento.setColumns(10);
		panel_7.add(txtPotenciaEquipamento, "cell 1 4,growx");

		cbUnidadePotEquipa = new JComboBox<>();
		cbUnidadePotEquipa.setModel(new DefaultComboBoxModel<>(new String[] { "W", "VA", "CV", "HP", "BTU" }));
		panel_7.add(cbUnidadePotEquipa, "cell 2 4,growx");

		JLabel lblTotal = new JLabel("Total:");
		panel_7.add(lblTotal, "cell 3 4,aligny baseline");

		JLabel lblValorTotal = new JLabel("");
		panel_7.add(lblValorTotal, "cell 4 4");

		JLabel lblPlos = new JLabel("P\u00F3los:");
		panel_7.add(lblPlos, "cell 0 5,alignx left");

		cbPolos = new JComboBox<>();
		cbPolos.setModel(new DefaultComboBoxModel<>(new String[] { "2", "4" }));
		cbPolos.setMaximumSize(new Dimension(45, 32767));
		panel_7.add(cbPolos, "cell 1 5,growx");

		JLabel lblFserv = new JLabel("FServ:");
		panel_7.add(lblFserv, "cell 3 5,alignx left");

		txtFServico = new JTextField();
		txtFServico.setMaximumSize(new Dimension(50, 2147483647));
		txtFServico.setColumns(10);
		panel_7.add(txtFServico, "cell 4 5,growx");

		JLabel lblLigao = new JLabel("Liga\u00E7\u00E3o:");
		panel_7.add(lblLigao, "cell 0 6,alignx left");

		cbLigacaoEquipamento = new JComboBox<Object>();
		cbLigacaoEquipamento.setMinimumSize(new Dimension(40, 24));
		cbLigacaoEquipamento.setModel(new DefaultComboBoxModel<>(new String[] { "FN", "FF", "FFN", "FFF", "FFFN" }));
		cbLigacaoEquipamento.setMaximumSize(new Dimension(60, 32767));
		panel_7.add(cbLigacaoEquipamento, "cell 1 6,growx");

		JLabel lblFsimu = new JLabel("FSimu:");
		panel_7.add(lblFsimu, "cell 3 6,alignx left");

		txtFSimutaneadade = new JTextField();
		txtFSimutaneadade.setMaximumSize(new Dimension(50, 2147483647));
		txtFSimutaneadade.setColumns(10);
		panel_7.add(txtFSimutaneadade, "cell 4 6,growx");

		JLabel lblPerdasw = new JLabel("Perdas (W):");
		panel_7.add(lblPerdasw, "cell 0 7,alignx left");

		txtPerdas = new JTextField();
		txtPerdas.setMaximumSize(new Dimension(120, 2147483647));
		txtPerdas.setColumns(10);
		panel_7.add(txtPerdas, "cell 1 7,growx");

		JLabel lblIdEquipamento = new JLabel("");
		lblIdEquipamento.setBounds(146, 20, 70, 15);
		panel_5.add(lblIdEquipamento);

		JPanel panel = new JPanel();
		abas.addTab("Resultados", null, panel, null);
		panel.setLayout(null);

		listener();
	}

	public void listener() {

		this.iniciaTabelaProjetos();
		this.tableProjetos.getSelectionModel().addListSelectionListener(new ProjetoListSelectionListener(this));
		this.tableQuadros.getSelectionModel().addListSelectionListener(new QuadroListSelectionListener(this));
		this.tableFontes.getSelectionModel().addListSelectionListener(new FonteListSelectionListener(this));
		this.listCircuitos.getSelectionModel().addListSelectionListener(new CircuitoListSelectionListener(this));
		this.abas.addChangeListener(new ProjetoChangeListener(this));
		this.txtData.setText(Data.Atual());
		this.cbQuadroPai.addPopupMenuListener(new QuadroPopupMenuListener(this));
		new FontesKeyListener(this);
		new FonteActionListener(this);
		new QuadroKeyListener(this);
		new QuadroActionListener(this);
		new CircuitoKeyListener(this);
		new CircuitoActionListener(this);

	}

	public void iniciaTabelaFontes() {

		FonteApagarDados.formu(this);
		HashMap<Object, Object> filtro = new HashMap<>();
		if (!(lblIdProjeto.getText().equals("") || lblIdProjeto.getText().equals("0"))) {
			filtro.put("idProjeto", Integer.parseInt(lblIdProjeto.getText()));
			this.setFontes(new FonteService().getFontes(filtro));
		} else {
			this.tableFontes.setModel(new DefaultTableModel());
		}
	}

	public void iniciaTabelaQuadros() {

		QuadroApagarDados.formu(this);
		HashMap<Object, Object> filtro = new HashMap<>();
		if (!(lblIdFonte.getText().equals("") || lblIdFonte.getText().equals("0"))) {
			filtro.put("idFonte", Integer.parseInt(lblIdFonte.getText()));
			this.setQuadros(new QuadroService().getQuadros(filtro));
		} else {
			this.tableQuadros.setModel(new DefaultTableModel());
		}
	}
	
	public void iniciaListCircuitos() {

		CircuitoApagarDados.formu(this);
		HashMap<Object,Object> filtro = new HashMap<>();
		filtro.put("idQuadro",this.lblIdQuadro.getText());
		this.setCircuitos(new CircuitoService().getCircuitos(filtro));
	}

	public void iniciaTabelaProjetos() {
		
		this.setProjetos(new ProjetoService().getProjetos(new HashMap<>()));
	}

	public void setCircuitos(List<Circuito> circuitos) {
		this.listCircuitos.setListData(circuitos.toArray(new Circuito[circuitos.size()]));
	}

	public Circuito getSelectCircuito() {
		return this.listCircuitos.getSelectedValue();
	}

	public void setQuadros(ArrayList<Quadro> quadros) {

		QuadroTableModel model = new QuadroTableModel();
		model.setQuadros(quadros);

		this.tableQuadros.setModel(model);

	}

	public Quadro getSelectQuadro() {

		int index = this.tableQuadros.getSelectedRow();
		QuadroTableModel model = (QuadroTableModel) this.tableQuadros.getModel();
		return model.getQuadro(index);

	}

	public void setFontes(ArrayList<Fonte> fontes) {

		FonteTableModel model = new FonteTableModel();
		model.setFontes(fontes);

		this.tableFontes.setModel(model);

	}

	public Fonte getSelectFonte() {

		int index = this.tableFontes.getSelectedRow();
		FonteTableModel model = (FonteTableModel) this.tableFontes.getModel();
		return model.getFonte(index);

	}

	public void setProjetos(ArrayList<Projeto> projetos) {

		ProjetoTableModel model = new ProjetoTableModel();
		model.setProjetos(projetos);
		this.tableProjetos.setModel(model);

	}

	public JLabel getLblIdCondutor() {
		return lblIdCondutor;
	}

	public void setLblIdCondutor(JLabel lblIdCondutor) {
		this.lblIdCondutor = lblIdCondutor;
	}

	public Projeto getSelectProjeto() {

		int index = this.tableProjetos.getSelectedRow();
		ProjetoTableModel model = (ProjetoTableModel) this.tableProjetos.getModel();
		return model.getProjeto(index);

	}

	public JTextField getTxtQTensaoCircuito() {
		return txtQTensaoCircuito;
	}

	public void setTxtQTensaoCircuito(JTextField txtQTensaoCircuito) {
		this.txtQTensaoCircuito = txtQTensaoCircuito;
	}

	public JTextField getTxtResistividadeTermCircuito() {
		return txtResistividadeTermCircuito;
	}

	public void setTxtResistividadeTermCircuito(JTextField txtResistividadeTermCircuito) {
		this.txtResistividadeTermCircuito = txtResistividadeTermCircuito;
	}

	public JTextField getTxtTemperaturaCircuito() {
		return txtTemperaturaCircuito;
	}

	public void setTxtTemperaturaCircuito(JTextField txtTemperaturaCircuito) {
		this.txtTemperaturaCircuito = txtTemperaturaCircuito;
	}

	public JTextField getTxtComprimentoCircuito() {
		return txtComprimentoCircuito;
	}

	public void setTxtComprimentoCircuito(JTextField txtComprimentoCircuito) {
		this.txtComprimentoCircuito = txtComprimentoCircuito;
	}

	public JTextField getTxtNomeCircuito() {
		return txtNomeCircuito;
	}

	public void setTxtNomeCircuito(JTextField txtNomeCircuito) {
		this.txtNomeCircuito = txtNomeCircuito;
	}

	public void setPosicao() {
		Dimension d = this.getDesktopPane().getSize();
		this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
	}

	public JLabel getLblIdFonte() {
		return lblIdFonte;
	}

	public void setLblIdFonte(JLabel lblIdFonte) {
		this.lblIdFonte = lblIdFonte;
	}

	public JPanel getPanelFonte() {
		return panelFonte;
	}

	public void setPanelFonte(JPanel panelFonte) {
		this.panelFonte = panelFonte;
	}

	public JPanel getPanelCircuito() {
		return panelCircuito;
	}

	public void setPanelCircuito(JPanel panelCircuito) {
		this.panelCircuito = panelCircuito;
	}

	public JPanel getPanelQuadro() {
		return panelQuadro;
	}

	public void setPanelQuadro(JPanel panelQuadro) {
		this.panelQuadro = panelQuadro;
	}

	public JComboBox<String> getCbNCamadas() {
		return cbNCamadas;
	}

	public void setCbNCamadas(JComboBox<String> cbNCamadas) {
		this.cbNCamadas = cbNCamadas;
	}

	public JComboBox<String> getCbEnterrado() {
		return cbEnterrado;
	}

	public void setCbEnterrado(JComboBox<String> cbEnterrado) {
		this.cbEnterrado = cbEnterrado;
	}

	public JComboBox<String> getCbEspacoCabos() {
		return cbEspacoCabos;
	}

	public void setCbEspacoCabos(JComboBox<String> cbEspacoCabos) {
		this.cbEspacoCabos = cbEspacoCabos;
	}

	public JComboBox<String> getCbMultipolar() {
		return cbMultipolar;
	}

	public void setCbMultipolar(JComboBox<String> cbMultipolar) {
		this.cbMultipolar = cbMultipolar;
	}

	public JComboBox<String> getCbFormaAgrupamento() {
		return cbFormaAgrupamento;
	}

	public void setCbFormaAgrupamento(JComboBox<String> cbFormaAgrupamento) {
		this.cbFormaAgrupamento = cbFormaAgrupamento;
	}

	public JTextField getTxtQTensao() {
		return txtQTensaoCircuito;
	}

	public void setTxtQTensao(JTextField txtQTensao) {
		this.txtQTensaoCircuito = txtQTensao;
	}

	public JComboBox<String> getCbBitolasSuessivas() {
		return cbBitolasSuessivas;
	}

	public void setCbBitolasSuessivas(JComboBox<String> cbBitolasSuessivas) {
		this.cbBitolasSuessivas = cbBitolasSuessivas;
	}

	public JTextField getTxtResistividaeTerm() {
		return txtResistividadeTermCircuito;
	}

	public void setTxtResistividaeTerm(JTextField txtResistividaeTerm) {
		this.txtResistividadeTermCircuito = txtResistividaeTerm;
	}

	public JTextField getTxtTemperatura() {
		return txtTemperaturaCircuito;
	}

	public void setTxtTemperatura(JTextField txtTemperatura) {
		this.txtTemperaturaCircuito = txtTemperatura;
	}

	public JComboBox<String> getCbCirAgrupados() {
		return cbCirAgrupados;
	}

	public void setCbCirAgrupados(JComboBox<String> cbCirAgrupados) {
		this.cbCirAgrupados = cbCirAgrupados;
	}

	public JTable getTableEquipamentoGeral() {
		return tableEquipamentoGeral;
	}

	public void setTableEquipamentoGeral(JTable tableEquipamentoGeral) {
		this.tableEquipamentoGeral = tableEquipamentoGeral;
	}

	public JComboBox<String> getCbQuantidade() {
		return cbQuantidade;
	}

	public void setCbQuantidade(JComboBox<String> cbQuantidade) {
		this.cbQuantidade = cbQuantidade;
	}

	public JComboBox<String> getCbPolos() {
		return cbPolos;
	}

	public void setCbPolos(JComboBox<String> cbPolos) {
		this.cbPolos = cbPolos;
	}

	public JComboBox<String> getTxtIsolacao() {
		return txtIsolacao;
	}

	public void setTxtIsolacao(JComboBox<String> txtIsolacao) {
		this.txtIsolacao = txtIsolacao;
	}

	public JComboBox<String> getTxtmodoInstalacao() {
		return txtmodoInstalacao;
	}

	public void setTxtmodoInstalacao(JComboBox<String> txtmodoInstalacao) {
		this.txtmodoInstalacao = txtmodoInstalacao;
	}

	public JComboBox<String> getTxtMaterial() {
		return txtMaterial;
	}

	public void setTxtMaterial(JComboBox<String> txtMaterial) {
		this.txtMaterial = txtMaterial;
	}

	public JButton getBtnSalvarProjeto() {
		return btnSalvarProjeto;
	}

	public void setBtnSalvarProjeto(JButton btnSalvarProjeto) {
		this.btnSalvarProjeto = btnSalvarProjeto;
	}

	public JButton getBtnExcluirProjeto() {
		return btnExcluirProjeto;
	}

	public void setBtnExcluirProjeto(JButton btnExcluirProjeto) {
		this.btnExcluirProjeto = btnExcluirProjeto;
	}

	public JButton getBtnCopiarProjeto() {
		return btnCopiarProjeto;
	}

	public void setBtnCopiarProjeto(JButton btnCopiarProjeto) {
		this.btnCopiarProjeto = btnCopiarProjeto;
	}

	public JList<Circuito> getListCircuitos() {
		return listCircuitos;
	}

	public void setListCircuitos(JList<Circuito> listCircuitos) {
		this.listCircuitos = listCircuitos;
	}

	public JTextField getTxtNomeProjeto() {
		return txtNomeProjeto;
	}

	public void setTxtNomeProjeto(JTextField txtNomeProjeto) {
		this.txtNomeProjeto = txtNomeProjeto;
	}

	public JTextField getTxtData() {
		return txtData;
	}

	public void setTxtData(JTextField txtData) {
		this.txtData = txtData;
	}

	public JTextField getTxtAutor() {
		return txtAutor;
	}

	public void setTxtAutor(JTextField txtAutor) {
		this.txtAutor = txtAutor;
	}

	public JTable getTableProjetos() {
		return tableProjetos;
	}

	public void setTableProjetos(JTable tableProjetos) {
		this.tableProjetos = tableProjetos;
	}

	public JTextField getTxtTensaoFonte() {
		return txtTensaoFonte;
	}

	public void setTxtTensaoFonte(JTextField txtTensaoFonte) {
		this.txtTensaoFonte = txtTensaoFonte;
	}

	public JTable getTableFontes() {
		return tableFontes;
	}

	public void setTableFontes(JTable tableFontes) {
		this.tableFontes = tableFontes;
	}

	public JTextField getTxtNomeQuadro() {
		return txtNomeQuadro;
	}

	public void setTxtNomeQuadro(JTextField txtNomeQuadro) {
		this.txtNomeQuadro = txtNomeQuadro;
	}

	public JTextField getTxtLocalQuadro() {
		return txtLocalQuadro;
	}

	public void setTxtLocalQuadro(JTextField txtLocalQuadro) {
		this.txtLocalQuadro = txtLocalQuadro;
	}

	public JTextField getTxtFdQuadro() {
		return txtFdQuadro;
	}

	public void setTxtFdQuadro(JTextField txtFdQuadro) {
		this.txtFdQuadro = txtFdQuadro;
	}

	public JTable getTableQuadros() {
		return tableQuadros;
	}

	public void setTableQuadros(JTable tableQuadro) {
		this.tableQuadros = tableQuadro;
	}

	public JTextField getTxtFpQuadro() {
		return txtFpQuadro;
	}

	public void setTxtFpQuadro(JTextField txtFpQuadro) {
		this.txtFpQuadro = txtFpQuadro;
	}

	public JTextField getTxtComprimento() {
		return txtComprimentoCircuito;
	}

	public void setTxtComprimento(JTextField txtComprimento) {
		this.txtComprimentoCircuito = txtComprimento;
	}

	public JTextField getTxtNomeEquipamento() {
		return txtNomeEquipamento;
	}

	public void setTxtNomeEquipamento(JTextField txtNomeEquipamento) {
		this.txtNomeEquipamento = txtNomeEquipamento;
	}

	public JTextField getTxtLocalEquipamento() {
		return txtLocalEquipamento;
	}

	public void setTxtLocalEquipamento(JTextField txtLocalEquipamento) {
		this.txtLocalEquipamento = txtLocalEquipamento;
	}

	public JTextField getTxtPotenciaEquipamento() {
		return txtPotenciaEquipamento;
	}

	public void setTxtPotenciaEquipamento(JTextField txtPotenciaEquipamento) {
		this.txtPotenciaEquipamento = txtPotenciaEquipamento;
	}

	public JTextField getTxtPerdas() {
		return txtPerdas;
	}

	public void setTxtPerdas(JTextField txtPerdas) {
		this.txtPerdas = txtPerdas;
	}

	public JTextField getTxtFpEquipamento() {
		return txtFpEquipamento;
	}

	public void setTxtFpEquipamento(JTextField txtFpEquipamento) {
		this.txtFpEquipamento = txtFpEquipamento;
	}

	public JTextField getTxtRendimento() {
		return txtRendimento;
	}

	public void setTxtRendimento(JTextField txtRendimento) {
		this.txtRendimento = txtRendimento;
	}

	public JTextField getTxtFdEquipamento() {
		return txtFdEquipamento;
	}

	public void setTxtFdEquipamento(JTextField txtFdEquipamento) {
		this.txtFdEquipamento = txtFdEquipamento;
	}

	public JTextField getTxtFUtilizacao() {
		return txtFUtilizacao;
	}

	public void setTxtFUtilizacao(JTextField txtFUtilizacao) {
		this.txtFUtilizacao = txtFUtilizacao;
	}

	public JTextField getTxtFServico() {
		return txtFServico;
	}

	public void setTxtFServico(JTextField txtFServico) {
		this.txtFServico = txtFServico;
	}

	public JTextField getTxtFSimutaneadade() {
		return txtFSimutaneadade;
	}

	public void setTxtFSimutaneadade(JTextField txtFSimutaneadade) {
		this.txtFSimutaneadade = txtFSimutaneadade;
	}

	public JComboBox<String> getCbConcessionaria() {
		return cbConcessionaria;
	}

	public void setCbConcessionaria(JComboBox<String> cbConcessionaria) {
		this.cbConcessionaria = cbConcessionaria;
	}

	public JComboBox<String> getCbUsabilidadeQuadro() {
		return cbUsabilidadeQuadro;
	}

	public void setCbUsabilidadeQuadro(JComboBox<String> cbUsabilidadeQuadro) {
		this.cbUsabilidadeQuadro = cbUsabilidadeQuadro;
	}

	public JComboBox<String> getCbDrQuadro() {
		return cbDrQuadro;
	}

	public void setCbDrQuadro(JComboBox<String> cbDrQuadro) {
		this.cbDrQuadro = cbDrQuadro;
	}

	public JComboBox<Quadro> getCbQuadroPai() {
		return cbQuadroPai;
	}

	public void setCbQuadroPai(JComboBox<Quadro> cbQuadroPai) {
		this.cbQuadroPai = cbQuadroPai;
	}

	public JButton getBtnSalvarQuadro() {
		return btnSalvarQuadro;
	}

	public void setBtnSalvarQuadro(JButton btnSalvarQuadro) {
		this.btnSalvarQuadro = btnSalvarQuadro;
	}

	public JButton getBtnExcluirQuadro() {
		return btnExcluirQuadro;
	}

	public void setBtnExcluirQuadro(JButton btnExcluirQuadro) {
		this.btnExcluirQuadro = btnExcluirQuadro;
	}

	public JButton getBtnCopiarQuadro() {
		return btnCopiarQuadro;
	}

	public void setBtnCopiarQuadro(JButton btnCopiarQuadro) {
		this.btnCopiarQuadro = btnCopiarQuadro;
	}

	public JLabel getLblIdQuadro() {
		return lblIdQuadro;
	}

	public void setLblIdQuadro(JLabel lblIdQuadro) {
		this.lblIdQuadro = lblIdQuadro;
	}

	public JComboBox<String> getCbUnidadePotEquipa() {
		return cbUnidadePotEquipa;
	}

	public void setCbUnidadePotEquipa(JComboBox<String> cbUnidadePotEquipa) {
		this.cbUnidadePotEquipa = cbUnidadePotEquipa;
	}

	public JComboBox<Object> getCbLigacaoEquipamento() {
		return cbLigacaoEquipamento;
	}

	public void setCbLigacaoEquipamento(JComboBox<Object> cbLigacaoEquipamento) {
		this.cbLigacaoEquipamento = cbLigacaoEquipamento;
	}

	public JButton getBtnSalvarFonte() {
		return btnSalvarFonte;
	}

	public void setBtnSalvarFonte(JButton btnSalvarFonte) {
		this.btnSalvarFonte = btnSalvarFonte;
	}

	public JButton getBtnExcluirFonte() {
		return btnExcluirFonte;
	}

	public void setBtnExcluirFonte(JButton btnExcluirFonte) {
		this.btnExcluirFonte = btnExcluirFonte;
	}

	public JButton getBtnCopiarFonte() {
		return btnCopiarFonte;
	}

	public void setBtnCopiarFonte(JButton btnCopiarFonte) {
		this.btnCopiarFonte = btnCopiarFonte;
	}

	public JLabel getLblIdProjeto() {
		return lblIdProjeto;
	}

	public void setLblIdProjeto(JLabel lblIdProjeto) {
		this.lblIdProjeto = lblIdProjeto;
	}

	public JButton getBtnSalvarEquipamento() {
		return btnSalvarEquipamento;
	}

	public void setBtnSalvarEquipamento(JButton btnSalvarEquipamento) {
		this.btnSalvarEquipamento = btnSalvarEquipamento;
	}

	public JButton getBtnDeletarEquipamento() {
		return btnDeletarEquipamento;
	}

	public void setBtnDeletarEquipamento(JButton btnDeletarEquipamento) {
		this.btnDeletarEquipamento = btnDeletarEquipamento;
	}

	public JButton getBtnCopiarEquipamento() {
		return btnCopiarEquipamento;
	}

	public void setBtnCopiarEquipamento(JButton btnCopiarEquipamento) {
		this.btnCopiarEquipamento = btnCopiarEquipamento;
	}

	public JButton getBtnCopiarCircuito() {
		return btnCopiarCircuito;
	}

	public void setBtnCopiarCircuito(JButton btnCopiarCircuito) {
		this.btnCopiarCircuito = btnCopiarCircuito;
	}

	public JLabel getLblIdCircuito() {
		return lblIdCircuito;
	}

	public void setLblIdCircuito(JLabel lblIdCircuito) {
		this.lblIdCircuito = lblIdCircuito;
	}

	public JTextPane getTxtDescricaoProjeto() {
		return txtDescricaoProjeto;
	}

	public void setTxtDescricaoProjeto(JTextPane txtDescricaoProjeto) {
		this.txtDescricaoProjeto = txtDescricaoProjeto;
	}

	public JButton getBtnExcluirCircuito() {
		return btnExcluirCircuito;
	}

	public void setBtnExcluirCircuito(JButton btnExcluirCircuito) {
		this.btnExcluirCircuito = btnExcluirCircuito;
	}

	public JButton getBtnSalvarCircuito() {
		return btnSalvarCircuito;
	}

	public void setBtnSalvarCircuito(JButton btnSalvarCircuito) {
		this.btnSalvarCircuito = btnSalvarCircuito;
	}

	public JTabbedPane getAbas() {
		return abas;
	}

	public void setAbas(JTabbedPane abas) {
		this.abas = abas;
	}
}
