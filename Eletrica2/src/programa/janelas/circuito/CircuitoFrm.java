package programa.janelas.circuito;

import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;
import programa.Circuito;
import javax.swing.border.LineBorder;

public class CircuitoFrm extends JInternalFrame {

	private JPanel contentPane;
	private JLabel lblIdcondutor;
	private JLabel lblIdcircuito;
	private JLabel lblIdQuadro;
	private JComboBox<String> cbNCamadas;
	private JComboBox<String> cbEnterrado;
	private JComboBox<String> cbEspacoCabos;
	private JComboBox<String> cbMultipolar;
	private JComboBox<String> cbFormaAgrupamento;
	private JComboBox<String> cbCirAgrupados;
	private JTabbedPane tabbedPane;

	private JButton bntRetEqui;
	private JButton bntAdiciEqui;
	private JList<Circuito> listCircuitos;
	private JScrollPane scrollLista;

	@SuppressWarnings("unused")
	private static CircuitoActionListener listener;
	private JTextField txtdistAlimentador;
	private JTextField txtmodoInstalacao;
	private JTextField txtMaterial;
	private JTextField txtQTensao;
	private JTextField txtIsolacao;

	private JComboBox<String> cbBitolasSuessivas;
	private JTextField txtResistividaeTerm;
	private JTextField txtTemperatura;
	private JTable tableEquipamentoCir;
	private JTable tableEquipamentoGeral;
	private JTextField txtNome;
	private JTextField txtData;
	private JTextField txtAutor;
	private JTable tableListaProj;

	public CircuitoFrm(int idQuadro) {
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

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 692, 370);
		panel_3.add(tabbedPane);

		JPanel panel_9 = new JPanel();
		tabbedPane.addTab("Projeto", null, panel_9, null);
		panel_9.setLayout(null);

		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new TitledBorder(null, "Descri\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null,
				Color.BLUE));
		panel_10.setBounds(10, 47, 193, 284);
		panel_9.add(panel_10);

		JPanel panel_11 = new JPanel();
		panel_11.setBorder(null);
		panel_11.setBounds(8, 17, 179, 87);
		panel_10.add(panel_11);
		panel_11.setLayout(new MigLayout("", "[][grow]", "[][][]"));

		JLabel label_3 = new JLabel("Nome:");
		panel_11.add(label_3, "cell 0 0,alignx left");

		txtNome = new JTextField();
		txtNome.setName("txtNome");
		txtNome.setColumns(10);
		panel_11.add(txtNome, "cell 1 0,growx");

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
		label_1.setBounds(17, 105, 88, 15);
		panel_10.add(label_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 122, 159, 150);
		panel_10.add(scrollPane);

		JTextPane txtTexto = new JTextPane();
		scrollPane.setViewportView(txtTexto);

		JLabel label_2 = new JLabel("");
		label_2.setName("lblIdProjeto");
		label_2.setBounds(107, 105, 70, 15);
		panel_10.add(label_2);

		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Cadastrados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_12.setBounds(205, 47, 470, 284);
		panel_9.add(panel_12);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(12, 16, 446, 256);
		panel_12.add(scrollPane_3);
		
		tableListaProj = new JTable();
		scrollPane_3.setViewportView(tableListaProj);

		JPanel panel_18 = new JPanel();
		panel_18.setBounds(12, 0, 116, 43);
		panel_9.add(panel_18);
		panel_18.setLayout(new MigLayout("", "[][][][]", "[]"));

		JButton btnSalvar = new JButton("");
		btnSalvar.setBackground(Color.GRAY);
		btnSalvar.setIcon(new ImageIcon(CircuitoFrm.class.getResource("/programa/janelas/images/add1-24.png")));
		btnSalvar.setSelectedIcon(null);
		btnSalvar.setMaximumSize(new Dimension(30, 30));
		panel_18.add(btnSalvar, "cell 0 0");

		JButton btnExcluir = new JButton("");
		btnExcluir.setBackground(Color.GRAY);
		btnExcluir.setIcon(new ImageIcon(CircuitoFrm.class.getResource("/programa/janelas/images/close24.png")));
		btnExcluir.setMaximumSize(new Dimension(30, 30));
		panel_18.add(btnExcluir, "cell 1 0");

		JButton btnCopiar = new JButton("");
		btnCopiar.setBackground(Color.GRAY);
		btnCopiar.setIcon(new ImageIcon(CircuitoFrm.class.getResource("/programa/janelas/images/copy24.png")));
		btnCopiar.setMaximumSize(new Dimension(30, 30));
		panel_18.add(btnCopiar, "cell 2 0");

		JPanel panel_13 = new JPanel();
		tabbedPane.addTab("Fonte", null, panel_13, null);
		panel_13.setLayout(null);

		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_15.setBounds(12, 12, 417, 80);
		panel_13.add(panel_15);

		JLabel label_6 = new JLabel("Tens\u00E3o nominal (F-N):");
		label_6.setBounds(12, 12, 154, 16);
		panel_15.add(label_6);

		JLabel label_7 = new JLabel("0");
		label_7.setName("lblIdProjeto");
		label_7.setBounds(292, 12, 55, 16);
		panel_15.add(label_7);

		JLabel label_8 = new JLabel("");
		label_8.setName("lblIdFonte");
		label_8.setBounds(247, 12, 55, 16);
		panel_15.add(label_8);

		JLabel label_9 = new JLabel("V");
		label_9.setBounds(217, 13, 18, 16);
		panel_15.add(label_9);

		JLabel label_10 = new JLabel("Concession\u00E1ria:");
		label_10.setBounds(12, 40, 125, 15);
		panel_15.add(label_10);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setName("cbConcessionaria");
		comboBox.setBounds(168, 35, 111, 24);
		panel_15.add(comboBox);

		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setName("scrollPane");
		scrollPane_4.setBounds(24, 105, 387, 66);
		panel_13.add(scrollPane_4);

		JPanel panel_14 = new JPanel();
		tabbedPane.addTab("Quadro", null, panel_14, null);
		panel_14.setLayout(null);

		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_16.setBounds(0, 0, 411, 121);
		panel_14.add(panel_16);
		panel_16.setLayout(new MigLayout("", "[]", "[]"));

		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBounds(0, 122, 411, 150);
		panel_14.add(panel_17);

		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setName("scrollPane");
		scrollPane_5.setBounds(12, 12, 387, 127);
		panel_17.add(scrollPane_5);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Circuito", null, panel_4, null);
		tabbedPane.setEnabledAt(3, true);
		panel_4.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 0, 663, 43);
		panel_4.add(panel_2);
		panel_2.setLayout(null);

		JLabel label = new JLabel("Nome:");
		label.setBounds(12, 14, 55, 16);
		panel_2.add(label);

		txtNome = new JTextField();
		txtNome.setBounds(59, 13, 58, 20);
		panel_2.add(txtNome);
		txtNome.setName("txtNome");
		txtNome.setColumns(10);

		lblIdcircuito = new JLabel("");
		lblIdcircuito.setName("lblIdcircuito");
		lblIdcircuito.setBounds(160, 14, 70, 15);
		panel_2.add(lblIdcircuito);

		lblIdcondutor = new JLabel("");
		lblIdcondutor.setBounds(193, 15, 70, 15);
		panel_2.add(lblIdcondutor);
		lblIdcondutor.setName("lblIdcondutor");

		lblIdQuadro = new JLabel(Integer.toString(idQuadro));
		lblIdQuadro.setName("lblIdQuadro");
		lblIdQuadro.setBounds(275, 15, 70, 15);
		panel_2.add(lblIdQuadro);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(
				new TitledBorder(null, "Adicionados", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_6.setBounds(521, 41, 154, 238);
		panel_4.add(panel_6);
		panel_6.setLayout(null);

		scrollLista = new JScrollPane();
		scrollLista.setName("scrollLista");
		scrollLista.setBounds(12, 22, 130, 205);
		panel_6.add(scrollLista);

		listCircuitos = new JList<>();
		listCircuitos.setName("listCircuitos");
		scrollLista.setViewportView(listCircuitos);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(
				new TitledBorder(null, "Propriedades", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_8.setBounds(12, 41, 511, 238);
		panel_4.add(panel_8);
		panel_8.setLayout(new MigLayout("", "[][][][][fill]", "[][][][][][][]"));

		JLabel lblComprimento = new JLabel("Comprimento (m):");
		panel_8.add(lblComprimento, "cell 0 0");

		txtdistAlimentador = new JTextField();
		panel_8.add(txtdistAlimentador, "cell 1 0");
		txtdistAlimentador.setName("txtdistAlimentador");
		txtdistAlimentador.setColumns(3);

		JLabel lblEnterrado = new JLabel("Enterrado:");
		panel_8.add(lblEnterrado, "cell 3 0");

		cbEnterrado = new JComboBox<String>();
		panel_8.add(cbEnterrado, "cell 4 0");
		cbEnterrado.setModel(new DefaultComboBoxModel<String>(new String[] { "N\u00E3o", "Sim" }));
		cbEnterrado.setName("cbEnterrado");

		JLabel lblInstalacao = new JLabel("Instala\u00E7\u00E3o:");
		panel_8.add(lblInstalacao, "cell 0 1");

		txtmodoInstalacao = new JTextField();
		panel_8.add(txtmodoInstalacao, "cell 1 1");
		txtmodoInstalacao.setName("txtmodoInstalacao");
		txtmodoInstalacao.setColumns(3);

		JLabel lblEspaoEntreCabos = new JLabel("Espa\u00E7o entre cabos:");
		panel_8.add(lblEspaoEntreCabos, "cell 3 1");

		cbEspacoCabos = new JComboBox<String>();
		panel_8.add(cbEspacoCabos, "cell 4 1,alignx left");
		cbEspacoCabos.setModel(new DefaultComboBoxModel<String>(new String[] { "modo1", "modo2" }));
		cbEspacoCabos.setName("cbEspacoCabos");

		JLabel lblMaterial = new JLabel("Material:");
		panel_8.add(lblMaterial, "cell 0 2");

		txtMaterial = new JTextField();
		panel_8.add(txtMaterial, "cell 1 2");
		txtMaterial.setName("txtMaterial");
		txtMaterial.setColumns(3);

		JLabel lblMultipolar = new JLabel("Multipolar:");
		panel_8.add(lblMultipolar, "cell 3 2");

		cbMultipolar = new JComboBox<String>();
		panel_8.add(cbMultipolar, "cell 4 2");
		cbMultipolar.setModel(new DefaultComboBoxModel<String>(new String[] { "N\u00E3o", "Sim" }));
		cbMultipolar.setName("cbMultipolar");

		JLabel lblQuedaTenso = new JLabel("Queda tens\u00E3o:");
		panel_8.add(lblQuedaTenso, "cell 0 3");

		txtQTensao = new JTextField();
		panel_8.add(txtQTensao, "cell 1 3");
		txtQTensao.setName("txtQTensao");
		txtQTensao.setColumns(3);

		JLabel lblFormaDeAgrupamento = new JLabel("Forma de agrupamento:");
		panel_8.add(lblFormaDeAgrupamento, "cell 3 3");

		cbFormaAgrupamento = new JComboBox<String>();
		panel_8.add(cbFormaAgrupamento, "cell 4 3");
		cbFormaAgrupamento.setModel(new DefaultComboBoxModel<String>(new String[] { "modo1", "modo2", "modo3" }));
		cbFormaAgrupamento.setName("cbFormaAgrupamento");

		JLabel lblIsolao = new JLabel("Isola\u00E7\u00E3o:");
		panel_8.add(lblIsolao, "cell 0 4");

		txtIsolacao = new JTextField();
		panel_8.add(txtIsolacao, "cell 1 4");
		txtIsolacao.setName("txtIsolacao");
		txtIsolacao.setColumns(3);

		JLabel lblSicessivas = new JLabel("Bitolas sucessivas:");
		panel_8.add(lblSicessivas, "cell 3 4");

		cbBitolasSuessivas = new JComboBox<String>();
		panel_8.add(cbBitolasSuessivas, "cell 4 4");
		cbBitolasSuessivas.setName("cbBitolasSuessivas");
		cbBitolasSuessivas.setModel(new DefaultComboBoxModel<String>(new String[] { "Sim", "N\u00E3o" }));

		JLabel lblResistividadeTrmica = new JLabel("Resistividade t\u00E9rmica:");
		panel_8.add(lblResistividadeTrmica, "cell 0 5");

		txtResistividaeTerm = new JTextField();
		panel_8.add(txtResistividaeTerm, "cell 1 5");
		txtResistividaeTerm.setName("txtResistividaeTerm");
		txtResistividaeTerm.setColumns(3);

		JLabel lblNDeCircuitos = new JLabel("N\u00B0 de circuitos agrup.:");
		panel_8.add(lblNDeCircuitos, "cell 3 5");

		cbCirAgrupados = new JComboBox<String>();
		panel_8.add(cbCirAgrupados, "cell 4 5");
		cbCirAgrupados.setName("cbCirAgrupados");
		cbCirAgrupados.setModel(
				new DefaultComboBoxModel<String>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

		JLabel lblTemperatura = new JLabel("Temperatura (\u00B0C):");
		panel_8.add(lblTemperatura, "cell 0 6");

		txtTemperatura = new JTextField();
		panel_8.add(txtTemperatura, "cell 1 6");
		txtTemperatura.setName("txtTemperatura");
		txtTemperatura.setColumns(3);

		JLabel lblNDeCamadas = new JLabel("N\u00B0 de camadas:");
		panel_8.add(lblNDeCamadas, "cell 3 6");

		cbNCamadas = new JComboBox<String>();
		panel_8.add(cbNCamadas, "cell 4 6");
		cbNCamadas.setModel(
				new DefaultComboBoxModel<String>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
		cbNCamadas.setName("cbNCamadas");

		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Equipamento", null, panel_5, null);
		panel_5.setLayout(null);

		bntAdiciEqui = new JButton("");
		bntAdiciEqui.setIcon(new ImageIcon(
				"/home/chris/eclipse-workspace/Eletrica2/src/Programa/janelas/images/addressbook-add24.png"));
		bntAdiciEqui.setName("bntAdiciEqui");
		bntAdiciEqui.setBounds(39, 11, 32, 36);
		panel_5.add(bntAdiciEqui);

		bntRetEqui = new JButton("");
		bntRetEqui.setIcon(new ImageIcon(
				"/home/chris/eclipse-workspace/Eletrica2/src/Programa/janelas/images/addressbook-remove24.png"));
		bntRetEqui.setName("bntRetEqui");
		bntRetEqui.setBounds(81, 11, 32, 36);
		panel_5.add(bntRetEqui);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Lista", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_1.setBounds(12, 47, 663, 122);
		panel_5.add(panel_1);
		panel_1.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 17, 639, 93);
		panel_1.add(scrollPane_1);

		tableEquipamentoGeral = new JTable();
		tableEquipamentoGeral.setName("tableEquipamentoGeral");
		scrollPane_1.setViewportView(tableEquipamentoGeral);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(
				new TitledBorder(null, "Adicionados", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		panel_7.setBounds(12, 181, 663, 116);
		panel_5.add(panel_7);
		panel_7.setLayout(null);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(12, 19, 639, 85);
		panel_7.add(scrollPane_2);

		tableEquipamentoCir = new JTable();
		tableEquipamentoCir.setName("tableEquipamentoCir");
		scrollPane_2.setViewportView(tableEquipamentoCir);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Resultados", null, panel, null);
		panel.setLayout(null);

		listener();
	}

	public void listener() {

		new Controle(this);
		listCircuitos.getSelectionModel().addListSelectionListener(new CircuitoListSelectionListener(this));
	}

	public void setPosicao() {
		Dimension d = this.getDesktopPane().getSize();
		this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
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

	public JTextField getTxtdistAlimentador() {
		return txtdistAlimentador;
	}

	public void setTxtdistAlimentador(JTextField txtdistAlimentador) {
		this.txtdistAlimentador = txtdistAlimentador;
	}

	public JTextField getTxtmodoInstalacao() {
		return txtmodoInstalacao;
	}

	public void setTxtmodoInstalacao(JTextField txtmodoInstalacao) {
		this.txtmodoInstalacao = txtmodoInstalacao;
	}

	public JTextField getTxtMaterial() {
		return txtMaterial;
	}

	public void setTxtMaterial(JTextField txtMaterial) {
		this.txtMaterial = txtMaterial;
	}

	public JTextField getTxtQTensao() {
		return txtQTensao;
	}

	public void setTxtQTensao(JTextField txtQTensao) {
		this.txtQTensao = txtQTensao;
	}

	public JTextField getTxtIsolacao() {
		return txtIsolacao;
	}

	public void setTxtIsolacao(JTextField txtIsolacao) {
		this.txtIsolacao = txtIsolacao;
	}

	public JComboBox<String> getCbBitolasSuessivas() {
		return cbBitolasSuessivas;
	}

	public void setCbBitolasSuessivas(JComboBox<String> cbBitolasSuessivas) {
		this.cbBitolasSuessivas = cbBitolasSuessivas;
	}

	public JTextField getTxtResistividaeTerm() {
		return txtResistividaeTerm;
	}

	public void setTxtResistividaeTerm(JTextField txtResistividaeTerm) {
		this.txtResistividaeTerm = txtResistividaeTerm;
	}

	public JTextField getTxtTemperatura() {
		return txtTemperatura;
	}

	public void setTxtTemperatura(JTextField txtTemperatura) {
		this.txtTemperatura = txtTemperatura;
	}

	public JLabel getLblIdcondutor() {
		return lblIdcondutor;
	}

	public void setLblIdcondutor(JLabel lblIdcondutor) {
		this.lblIdcondutor = lblIdcondutor;
	}

	public JComboBox<String> getCbCirAgrupados() {
		return cbCirAgrupados;
	}

	public void setCbCirAgrupados(JComboBox<String> cbCirAgrupados) {
		this.cbCirAgrupados = cbCirAgrupados;
	}

	public JTable getTableEquipamentoCir() {
		return tableEquipamentoCir;
	}

	public void setTableEquipamentoCir(JTable tableEquipamentoCir) {
		this.tableEquipamentoCir = tableEquipamentoCir;
	}

	public JTable getTableEquipamentoGeral() {
		return tableEquipamentoGeral;
	}

	public void setTableEquipamentoGeral(JTable tableEquipamentoGeral) {
		this.tableEquipamentoGeral = tableEquipamentoGeral;
	}

	public JButton getBntRetEqui() {
		return bntRetEqui;
	}

	public void setBntRetEqui(JButton bntRetEqui) {
		this.bntRetEqui = bntRetEqui;
	}

	public JButton getBntAdiciEqui() {
		return bntAdiciEqui;
	}

	public void setBntAdiciEqui(JButton bntAdiciEqui) {
		this.bntAdiciEqui = bntAdiciEqui;
	}

	public JLabel getLblIdcircuito() {
		return lblIdcircuito;
	}

	public void setLblIdcircuito(JLabel lblIdcircuito) {
		this.lblIdcircuito = lblIdcircuito;
	}

	public JTextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}

	public JLabel getLblIdQuadro() {
		return lblIdQuadro;
	}

	public void setLblIdQuadro(JLabel lblIdQuadro) {
		this.lblIdQuadro = lblIdQuadro;
	}

	public JScrollPane getScrollLista() {
		return scrollLista;
	}

	public void setScrollLista(JScrollPane scrollLista) {
		this.scrollLista = scrollLista;
	}

	public void setCircuitos(List<Circuito> circuitos) {
		this.listCircuitos.setListData(circuitos.toArray(new Circuito[circuitos.size()]));
	}

	public Circuito getSelectCircuito() {
		return this.listCircuitos.getSelectedValue();
	}

	public void removeCircuitoSelecionado() {
		this.listCircuitos.remove(this.listCircuitos.getSelectedIndex());
	}
}
