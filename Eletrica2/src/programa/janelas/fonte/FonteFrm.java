package programa.janelas.fonte;

import java.awt.Dimension;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
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
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class FonteFrm extends JInternalFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextField txtTensao;
	private JTable tableFontes;
	private JMenuItem mntmInserir;
	private JMenuItem mntmSalvar;
	private JMenuItem mntmExcluir;
	private JMenuItem mntmCancelar;
	private JMenuItem mntmCopiar;
	private JLabel lblIdProjeto;
	private JLabel lblIdFonte;
	private JComboBox<String> cbConcessionaria;



	public FonteFrm(int idProjeto) {
		setClosable(true);
		setIconifiable(true);
		setMaximizable(true);

		setTitle("Fonte");
		setBounds(100, 100, 421, 218);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(0, 0, 411, 20);
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
		panel_1.setBounds(0, 19, 417, 80);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNome = new JLabel("Tens\u00E3o nominal (F-N):");
		lblNome.setBounds(12, 12, 154, 16);
		panel_1.add(lblNome);

		txtTensao = new JTextField();
		txtTensao.setHorizontalAlignment(SwingConstants.CENTER);
		txtTensao.setName("txtTensao");
		txtTensao.setBounds(168, 11, 45, 20);
		panel_1.add(txtTensao);
		txtTensao.setColumns(10);

		lblIdProjeto = new JLabel(String.valueOf(idProjeto));
		lblIdProjeto.setName("lblIdProjeto");
		lblIdProjeto.setBounds(292, 12, 55, 16);
		panel_1.add(lblIdProjeto);

		lblIdFonte = new JLabel("");
		lblIdFonte.setName("lblIdFonte");
		lblIdFonte.setBounds(247, 12, 55, 16);
		panel_1.add(lblIdFonte);

		JLabel lblV = new JLabel("V");
		lblV.setBounds(217, 13, 18, 16);
		panel_1.add(lblV);

		JLabel lblConcessionria = new JLabel("Concession\u00E1ria:");
		lblConcessionria.setBounds(12, 40, 125, 15);
		panel_1.add(lblConcessionria);

		cbConcessionaria = new JComboBox<String>();
		cbConcessionaria.setName("cbConcessionaria");
		cbConcessionaria.setModel(new DefaultComboBoxModel<String>(new String[] { "Nenhuma", "Light" }));
		cbConcessionaria.setBounds(168, 35, 111, 24);
		panel_1.add(cbConcessionaria);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 100, 411, 133);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setName("scrollPane");
		scrollPane.setBounds(12, 12, 387, 66);
		panel_3.add(scrollPane);

		tableFontes = new JTable();
		tableFontes.setName("tableFontes");
		scrollPane.setViewportView(tableFontes);

		listener();
	}

	public void listener() {

		new Controle(this);

	}

	public void setPosicao() {
	    Dimension d = this.getDesktopPane().getSize();
	    this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
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

	public JTextField getTxtTensao() {
		return txtTensao;
	}

	public void setTxtTensao(JTextField txtTensao) {
		this.txtTensao = txtTensao;
	}

	public JTable getTableFontes() {
		return tableFontes;
	}

	public void setTableFontes(JTable tableFonte) {
		this.tableFontes = tableFonte;
	}

	public JLabel getLblIdProjeto() {
		return lblIdProjeto;
	}

	public void setLblIdProjeto(JLabel lblIdProjeto) {
		this.lblIdProjeto = lblIdProjeto;
	}

	public JLabel getLblIdFonte() {
		return lblIdFonte;
	}

	public void setLblIdFonte(JLabel lblIdFonte) {
		this.lblIdFonte = lblIdFonte;
	}

	public JComboBox<String> getCbConcessionaria() {
		return cbConcessionaria;
	}

	public void setCbConcessionaria(JComboBox<String> cbConcessionaria) {
		this.cbConcessionaria = cbConcessionaria;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}
}
