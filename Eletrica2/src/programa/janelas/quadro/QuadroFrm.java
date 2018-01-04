package programa.janelas.quadro;

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
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;

public class QuadroFrm extends JInternalFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable tableQuadro;
	private JMenuItem mntmInserir;
	private JMenuItem mntmSalvar;
	private JMenuItem mntmExcluir;
	private JMenuItem mntmCancelar;
	private JMenuItem mntmCopiar;
	private JComboBox<String> cbUsabilidade;
	private JComboBox<String> cbDrGeral;
	private JComboBox<String> cbQuadroPai;
	private JTextField txtNome;
	private JTextField txtLocal;
	private JTextField txtFd;
	private JTextField txtFp;
	private JLabel lblIdQuadro;
	private JLabel lblIdFonte;

	public QuadroFrm(int idFonte) {
		setClosable(true);
		setIconifiable(true);
		setMaximizable(true);

		setTitle("Quadro");
		setBounds(100, 100, 417, 319);
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
		panel_1.setBounds(0, 19, 411, 121);
		contentPane.add(panel_1);
		panel_1.setLayout(new MigLayout("", "[][grow][][grow]", "[][][][]"));

		JLabel lblNewLabel = new JLabel("Nome:");
		panel_1.add(lblNewLabel, "cell 0 0,alignx trailing");

		txtNome = new JTextField();
		panel_1.add(txtNome, "cell 1 0,growx");
		txtNome.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Usabilidade:");
		panel_1.add(lblNewLabel_1, "cell 2 0,alignx trailing");

		cbUsabilidade = new JComboBox<>();
		cbUsabilidade.setName("cbUsabilidade");
		cbUsabilidade.setModel(new DefaultComboBoxModel<>(new String[] { "Ilumina\u00E7\u00E3o", "Tomadas", "Motores" }));
		panel_1.add(cbUsabilidade, "cell 3 0,growx");

		JLabel lblLocal = new JLabel("Local:");
		panel_1.add(lblLocal, "cell 0 1,alignx trailing");

		txtLocal = new JTextField();
		panel_1.add(txtLocal, "cell 1 1,growx");
		txtLocal.setColumns(10);

		JLabel lblDrGeral = new JLabel("DR Geral:");
		panel_1.add(lblDrGeral, "cell 2 1,alignx trailing");

		cbDrGeral = new JComboBox<>();
		cbDrGeral.setName("cbDrGeral");
		cbDrGeral.setModel(new DefaultComboBoxModel<>(new String[] { "Sim", "N\u00E3o" }));
		panel_1.add(cbDrGeral, "cell 3 1,growx");

		JLabel lblNewLabel_2 = new JLabel("FD:");
		panel_1.add(lblNewLabel_2, "cell 0 2,alignx right");

		txtFd = new JTextField();
		txtFd.setName("txtFd");
		panel_1.add(txtFd, "cell 1 2,growx");
		txtFd.setColumns(10);
		
		JLabel lblQuadroPai = new JLabel("Quadro pai:");
		panel_1.add(lblQuadroPai, "cell 2 2,alignx trailing");
		
		cbQuadroPai = new JComboBox<>();
		cbQuadroPai.setName("cbQuadroPai");
		panel_1.add(cbQuadroPai, "cell 3 2,growx");

		JLabel lblNewLabel_3 = new JLabel("FP:");
		panel_1.add(lblNewLabel_3, "cell 0 3,alignx right");

		txtFp = new JTextField();
		txtFp.setName("txtFp");
		panel_1.add(txtFp, "cell 1 3,growx");
		txtFp.setColumns(10);
		
		lblIdQuadro = new JLabel("");
		lblIdQuadro.setName("lblLblipquadro");
		panel_1.add(lblIdQuadro, "cell 2 3");
		
		lblIdFonte = new JLabel(Integer.toString(idFonte));
		lblIdFonte.setName("lblIdFonte");
		panel_1.add(lblIdFonte, "cell 3 3");

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 141, 411, 150);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setName("scrollPane");
		scrollPane.setBounds(12, 12, 387, 127);
		panel_3.add(scrollPane);

		tableQuadro = new JTable();
		tableQuadro.setName("tableQuadros");
		scrollPane.setViewportView(tableQuadro);

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



	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JComboBox<String> getCbUsabilidade() {
		return cbUsabilidade;
	}

	public void setCbUsabilidade(JComboBox<String> cbUsabilidade) {
		this.cbUsabilidade = cbUsabilidade;
	}

	public JComboBox<String> getCbDrGeral() {
		return cbDrGeral;
	}

	public void setCbDrGeral(JComboBox<String> cbDrGeral) {
		this.cbDrGeral = cbDrGeral;
	}

	public JComboBox<String> getCbQuadroPai() {
		return cbQuadroPai;
	}

	public void setCbQuadroPai(JComboBox<String> cbQuadroPai) {
		this.cbQuadroPai = cbQuadroPai;
	}

	public JTextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(JTextField txtNome) {
		this.txtNome = txtNome;
	}

	public JTextField getTxtLocal() {
		return txtLocal;
	}

	public void setTxtLocal(JTextField txtLocal) {
		this.txtLocal = txtLocal;
	}

	public JTextField getTxtFd() {
		return txtFd;
	}

	public void setTxtFd(JTextField txtFd) {
		this.txtFd = txtFd;
	}

	public JTextField getTxtFp() {
		return txtFp;
	}

	public void setTxtFp(JTextField txtFp) {
		this.txtFp = txtFp;
	}


	public void setLblIdQuadro(JLabel lblIdQuadro) {
		this.lblIdQuadro = lblIdQuadro;
	}

	public JLabel getLblIdFonte() {
		return lblIdFonte;
	}

	public void setLblIdFonte(JLabel lblIdFonte) {
		this.lblIdFonte = lblIdFonte;
	}

	public JTable getTableQuadro() {
		return tableQuadro;
	}

	public void setTableQuadro(JTable tableQuadro) {
		this.tableQuadro = tableQuadro;
	}

	public JLabel getLblIdQuadro() {
		return lblIdQuadro;
	}
}
