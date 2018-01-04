package programa.janelas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Circuito extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JLabel lblCorrDeCurto;
	private JTextField textField_16;
	private JLabel lblTempoElimDe;
	private JTextField textField_17;
	private JLabel lblTemperaturaMaxDe;
	private JTextField textField_18;
	private JLabel lblTemperaturaMaxAdmissvel;
	private JTextField textField_19;
	private JLabel lblCaboTerra;
	private JLabel lblResistividadeTrmicakmw;
	private JTextField textField_21;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Circuito frame = new Circuito();
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
	public Circuito() {
		setTitle("CIRCUITO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 14, 46, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(129, 11, 76, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(129, 39, 76, 20);
		contentPane.add(textField_1);
		
		JLabel lblTipo = new JLabel("Queda de tens\u00E3o:");
		lblTipo.setBounds(10, 42, 99, 14);
		contentPane.add(lblTipo);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(129, 70, 76, 20);
		contentPane.add(textField_2);
		
		JLabel lblUsabilidade = new JLabel("Usabilidade:");
		lblUsabilidade.setBounds(10, 73, 64, 14);
		contentPane.add(lblUsabilidade);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(129, 101, 76, 20);
		contentPane.add(textField_3);
		
		JLabel lblLocalOuDescrio = new JLabel("Local ou descri\u00E7\u00E3o:");
		lblLocalOuDescrio.setBounds(10, 104, 99, 14);
		contentPane.add(lblLocalOuDescrio);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(129, 132, 76, 20);
		contentPane.add(textField_4);
		
		JLabel lblTemperatura = new JLabel("Temperatura:");
		lblTemperatura.setBounds(10, 135, 75, 14);
		contentPane.add(lblTemperatura);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(129, 163, 76, 20);
		contentPane.add(textField_5);
		
		JLabel lblDistParaO = new JLabel("Dist para o quadro (m):");
		lblDistParaO.setBounds(10, 166, 119, 14);
		contentPane.add(lblDistParaO);
		
		JLabel lblNPolosMotor = new JLabel("Material do condutor:");
		lblNPolosMotor.setBounds(10, 197, 119, 14);
		contentPane.add(lblNPolosMotor);
		
		JLabel lblIsolao = new JLabel("Isola\u00E7\u00E3o:");
		lblIsolao.setBounds(10, 228, 46, 14);
		contentPane.add(lblIsolao);
		
		JLabel lblEnterrado = new JLabel("Enterrado:");
		lblEnterrado.setBounds(227, 14, 64, 14);
		contentPane.add(lblEnterrado);
		
		JLabel lblMultipolar = new JLabel("Multipolar:");
		lblMultipolar.setBounds(227, 42, 64, 14);
		contentPane.add(lblMultipolar);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(352, 70, 58, 20);
		contentPane.add(textField_10);
		
		JLabel lblMtodoDeInstalao = new JLabel("M\u00E9todo de instala\u00E7\u00E3o:");
		lblMtodoDeInstalao.setBounds(227, 73, 115, 14);
		contentPane.add(lblMtodoDeInstalao);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(362, 101, 48, 20);
		contentPane.add(textField_11);
		
		JLabel lblFormaDeAgrupamento = new JLabel("Forma de agrupamento:");
		lblFormaDeAgrupamento.setBounds(227, 104, 127, 14);
		contentPane.add(lblFormaDeAgrupamento);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(386, 132, 24, 20);
		contentPane.add(textField_12);
		
		JLabel lblNCirOu = new JLabel("N\u00B0 cir ou cabos\r \nmult agrupados:");
		lblNCirOu.setBounds(227, 135, 160, 14);
		contentPane.add(lblNCirOu);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(324, 163, 86, 20);
		contentPane.add(textField_13);
		
		JLabel lblNDeCamadas = new JLabel("N\u00B0 de camadas:");
		lblNDeCamadas.setBounds(227, 166, 99, 14);
		contentPane.add(lblNDeCamadas);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(364, 194, 46, 20);
		contentPane.add(textField_14);
		
		JLabel lblEspaamentoDosCabos = new JLabel("Espa\u00E7amento dos cabos:");
		lblEspaamentoDosCabos.setBounds(227, 197, 127, 14);
		contentPane.add(lblEspaamentoDosCabos);
		
		JLabel lblBitolasSucessivas = new JLabel("Bitolas sucessivas:");
		lblBitolasSucessivas.setBounds(227, 228, 115, 14);
		contentPane.add(lblBitolasSucessivas);
		
		lblCorrDeCurto = new JLabel("Corr de curto (KA):");
		lblCorrDeCurto.setBounds(227, 259, 115, 14);
		contentPane.add(lblCorrDeCurto);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(362, 256, 48, 20);
		contentPane.add(textField_16);
		
		lblTempoElimDe = new JLabel("Tempo elim de defeito (seg):");
		lblTempoElimDe.setBounds(227, 287, 139, 14);
		contentPane.add(lblTempoElimDe);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(362, 284, 48, 20);
		contentPane.add(textField_17);
		
		lblTemperaturaMaxDe = new JLabel("Temperatura max de curto circuito do cond (\u00B0C):");
		lblTemperaturaMaxDe.setBounds(10, 259, 172, 14);
		contentPane.add(lblTemperaturaMaxDe);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(181, 256, 24, 20);
		contentPane.add(textField_18);
		
		lblTemperaturaMaxAdmissvel = new JLabel("Temperatura max admiss\u00EDvel em regime normal do cond (\u00B0C):");
		lblTemperaturaMaxAdmissvel.setBounds(10, 284, 172, 14);
		contentPane.add(lblTemperaturaMaxAdmissvel);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(181, 281, 24, 20);
		contentPane.add(textField_19);
		
		lblCaboTerra = new JLabel("Cabo terra:");
		lblCaboTerra.setBounds(10, 312, 75, 14);
		contentPane.add(lblCaboTerra);
		
		lblResistividadeTrmicakmw = new JLabel("Resistividade t\u00E9rmica (K.m/W):");
		lblResistividadeTrmicakmw.setBounds(227, 315, 139, 14);
		contentPane.add(lblResistividadeTrmicakmw);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(362, 312, 48, 20);
		contentPane.add(textField_21);
		
		comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cobre", "Alum\u00EDnio"}));
		comboBox.setBounds(129, 194, 76, 20);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"PVC", "XLPE ou EPR"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(129, 225, 76, 20);
		contentPane.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Sim", "N\u00E3o"}));
		comboBox_2.setToolTipText("");
		comboBox_2.setBounds(129, 309, 76, 20);
		contentPane.add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"N\u00E3o", "Sim"}));
		comboBox_3.setToolTipText("");
		comboBox_3.setBounds(334, 11, 76, 20);
		contentPane.add(comboBox_3);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"N\u00E3o", "Sm"}));
		comboBox_4.setToolTipText("");
		comboBox_4.setBounds(334, 39, 76, 20);
		contentPane.add(comboBox_4);
		
		comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Sim", "N\u00E3o"}));
		comboBox_5.setToolTipText("");
		comboBox_5.setBounds(334, 225, 76, 20);
		contentPane.add(comboBox_5);
	}
}
