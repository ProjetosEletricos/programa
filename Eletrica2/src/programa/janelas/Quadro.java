package programa.janelas;


import java.awt.Font;
import java.awt.EventQueue;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Quadro extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfLocal;
	private JTextField tfDistAlimen;
	private JTextField tfQuedaTensao;
	private JTextField tfTempQuadro;
	private JTextField tfNCircuitos;
	private JTextField tfResisTermSolo;
	private JTable tableCircuitos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quadro frame = new Quadro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Quadro() {
		setTitle("QUADRO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNomeQuadro = new JLabel("Nome:");
		lblNomeQuadro.setBounds(10, 42, 46, 14);
		contentPane.add(lblNomeQuadro);

		tfNome = new JTextField();
		tfNome.setBounds(114, 40, 109, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);

		JLabel lblLocal = new JLabel("Local:");
		lblLocal.setBounds(10, 70, 46, 14);
		contentPane.add(lblLocal);

		tfLocal = new JTextField();
		tfLocal.setColumns(10);
		tfLocal.setBounds(114, 68, 109, 20);
		contentPane.add(tfLocal);

		JLabel lblDistAoAlimentador = new JLabel("Dist. ao alimentador:");
		lblDistAoAlimentador.setBounds(10, 95, 105, 20);
		contentPane.add(lblDistAoAlimentador);

		tfDistAlimen = new JTextField();
		tfDistAlimen.setColumns(10);
		tfDistAlimen.setBounds(187, 96, 36, 20);
		contentPane.add(tfDistAlimen);

		JLabel lblInstalDoAlimentador = new JLabel("Instala\u00E7\u00E3o:");
		lblInstalDoAlimentador.setBounds(259, 36, 67, 20);
		contentPane.add(lblInstalDoAlimentador);

		JComboBox cbInstalAlimentador = new JComboBox();
		cbInstalAlimentador.setModel(new DefaultComboBoxModel(new String[] { "teste", "teste2" }));
		cbInstalAlimentador.setBounds(360, 36, 46, 20);
		contentPane.add(cbInstalAlimentador);

		JLabel lblIsolaAlimentador = new JLabel("Isola\u00E7\u00E3o:");
		lblIsolaAlimentador.setBounds(259, 64, 46, 20);
		contentPane.add(lblIsolaAlimentador);

		JLabel lblMaterialDoalimentador = new JLabel("Material:");
		lblMaterialDoalimentador.setBounds(259, 95, 46, 20);
		contentPane.add(lblMaterialDoalimentador);

		JComboBox cbIsolaAimentador = new JComboBox();
		cbIsolaAimentador.setModel(new DefaultComboBoxModel(new String[] { "Cobre", "Alum\u00EDnio" }));
		cbIsolaAimentador.setBounds(360, 64, 46, 20);
		contentPane.add(cbIsolaAimentador);

		JComboBox cbMaterialAlimentadr = new JComboBox();
		cbMaterialAlimentadr.setModel(new DefaultComboBoxModel(new String[] { "PVC", "XLPE ou EPR" }));
		cbMaterialAlimentadr.setBounds(360, 95, 46, 20);
		contentPane.add(cbMaterialAlimentadr);

		JLabel lblQuedaDeTenso = new JLabel("Queda de tens\u00E3o:");
		lblQuedaDeTenso.setBounds(10, 126, 105, 20);
		contentPane.add(lblQuedaDeTenso);

		tfQuedaTensao = new JTextField();
		tfQuedaTensao.setColumns(10);
		tfQuedaTensao.setBounds(187, 127, 36, 20);
		contentPane.add(tfQuedaTensao);

		JLabel lblDrGerl = new JLabel("DR Geral:");
		lblDrGerl.setBounds(10, 157, 105, 20);
		contentPane.add(lblDrGerl);

		JComboBox cbDrGeral = new JComboBox();
		cbDrGeral.setModel(new DefaultComboBoxModel(new String[] { "Sim", "N\u00E3o" }));
		cbDrGeral.setBounds(177, 158, 46, 20);
		contentPane.add(cbDrGeral);

		tfTempQuadro = new JTextField();
		tfTempQuadro.setColumns(10);
		tfTempQuadro.setBounds(187, 189, 36, 20);
		contentPane.add(tfTempQuadro);

		JLabel lblTemperaturaDoQuadro = new JLabel("Temperatura do quadro:");
		lblTemperaturaDoQuadro.setBounds(10, 188, 121, 20);
		contentPane.add(lblTemperaturaDoQuadro);

		JLabel lblNCirOu = new JLabel("N\u00B0 de cir. ou cabos mult agrupados:");
		lblNCirOu.setBounds(435, 128, 178, 17);
		contentPane.add(lblNCirOu);

		tfNCircuitos = new JTextField();
		tfNCircuitos.setColumns(10);
		tfNCircuitos.setBounds(613, 124, 36, 20);
		contentPane.add(tfNCircuitos);

		JLabel lblAlimentador = new JLabel("Alimentador");
		lblAlimentador.setFont(new Font("Arial", Font.PLAIN, 14));
		lblAlimentador.setBounds(259, 7, 87, 20);
		contentPane.add(lblAlimentador);

		JLabel lblAgrupamento = new JLabel("Agrupamento:");
		lblAgrupamento.setBounds(259, 126, 74, 20);
		contentPane.add(lblAgrupamento);

		JComboBox cbAgrupamento = new JComboBox();
		cbAgrupamento.setModel(new DefaultComboBoxModel(
				new String[] { "Em feixe ao ar livre ou sobre superf\u00EDcie em condutores fechados" }));
		cbAgrupamento.setBounds(360, 126, 46, 20);
		contentPane.add(cbAgrupamento);

		JLabel lblNDeCamadas = new JLabel("N. de camadas:");
		lblNDeCamadas.setBounds(259, 157, 81, 20);
		contentPane.add(lblNDeCamadas);

		JComboBox cbNCamadas = new JComboBox();
		cbNCamadas.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
		cbNCamadas.setBounds(360, 157, 46, 20);
		contentPane.add(cbNCamadas);

		JLabel lblCaboMultipolar = new JLabel("Cabo multipolar:");
		lblCaboMultipolar.setBounds(259, 189, 81, 20);
		contentPane.add(lblCaboMultipolar);

		JComboBox cbCaboMultipolar = new JComboBox();
		cbCaboMultipolar.setModel(new DefaultComboBoxModel(new String[] { "Sim", "N\u00E3o" }));
		cbCaboMultipolar.setBounds(360, 189, 46, 20);
		contentPane.add(cbCaboMultipolar);

		JLabel lblEnterrado = new JLabel("Enterrado:");
		lblEnterrado.setBounds(442, 34, 81, 20);
		contentPane.add(lblEnterrado);

		JComboBox cbEnterrado = new JComboBox();
		cbEnterrado.setModel(new DefaultComboBoxModel(new String[] { "N\u00E3o", "Sim" }));
		cbEnterrado.setBounds(603, 34, 46, 20);
		contentPane.add(cbEnterrado);

		JLabel lblEspaoEntreCabos = new JLabel("Espa\u00E7o entre cabos:");
		lblEspaoEntreCabos.setBounds(442, 65, 98, 20);
		contentPane.add(lblEspaoEntreCabos);

		JComboBox cbEspacoCabos = new JComboBox();
		cbEspacoCabos.setModel(new DefaultComboBoxModel(
				new String[] { "Nula", "0,125  m", "0,25 m", "0,50 m", "1 Di\u00E2metro", "1 m" }));
		cbEspacoCabos.setBounds(603, 65, 46, 20);
		contentPane.add(cbEspacoCabos);

		JLabel lblResistTrmicaSolo = new JLabel("Resist t\u00E9rmica solo (K.m/W):");
		lblResistTrmicaSolo.setBounds(442, 98, 144, 17);
		contentPane.add(lblResistTrmicaSolo);

		tfResisTermSolo = new JTextField();
		tfResisTermSolo.setColumns(10);
		tfResisTermSolo.setBounds(613, 94, 36, 20);
		contentPane.add(tfResisTermSolo);

		JLabel lblQuadro = new JLabel("Quadro");
		lblQuadro.setFont(new Font("Arial", Font.PLAIN, 14));
		lblQuadro.setBounds(10, 11, 87, 20);
		contentPane.add(lblQuadro);

		JLabel lblCircuittos = new JLabel("Circuitos");
		lblCircuittos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCircuittos.setBounds(10, 229, 87, 20);
		contentPane.add(lblCircuittos);

		tableCircuitos = new JTable();
		tableCircuitos.setBounds(10, 333, 639, -67);
		contentPane.add(tableCircuitos);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(78, 229, 89, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(177, 229, 89, 23);
		contentPane.add(btnRemover);
	}
}
