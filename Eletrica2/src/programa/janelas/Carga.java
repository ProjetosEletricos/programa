package programa.janelas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Carga extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carga frame = new Carga();
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
	public Carga() {
		setTitle("CARGA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEquipamento = new JLabel("Equipamento:");
		lblEquipamento.setBounds(10, 11, 73, 14);
		contentPane.add(lblEquipamento);
		
		textField = new JTextField();
		textField.setBounds(77, 8, 111, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(10, 39, 73, 14);
		contentPane.add(lblQuantidade);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(148, 36, 40, 20);
		contentPane.add(textField_1);
		
		JLabel lblPotncia = new JLabel("Pot\u00EAncia:");
		lblPotncia.setBounds(10, 69, 45, 14);
		contentPane.add(lblPotncia);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(63, 66, 47, 20);
		contentPane.add(textField_2);
		
		JLabel lblUnid = new JLabel("Unid.:");
		lblUnid.setBounds(113, 70, 40, 14);
		contentPane.add(lblUnid);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"W", "CV", "HP", "VA", "BTU"}));
		comboBox.setBounds(148, 66, 40, 20);
		contentPane.add(comboBox);
		
		JLabel lblLigao = new JLabel("Liga\u00E7\u00E3o:");
		lblLigao.setBounds(10, 100, 52, 14);
		contentPane.add(lblLigao);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"FN", "FF", "FFN", "FFF", "FFFN", "FFFN - Equilibrado", "FFFN - Desiquilibrado"}));
		comboBox_1.setBounds(63, 97, 73, 20);
		contentPane.add(comboBox_1);
		
		JLabel lblPerdasNoReator = new JLabel("Perdas no reator (W):");
		lblPerdasNoReator.setBounds(10, 128, 111, 14);
		contentPane.add(lblPerdasNoReator);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(148, 125, 40, 20);
		contentPane.add(textField_3);
		
		JLabel lblFatorDePotncia = new JLabel("Fator de pot\u00EAncia:");
		lblFatorDePotncia.setBounds(218, 11, 126, 14);
		contentPane.add(lblFatorDePotncia);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(356, 8, 40, 20);
		contentPane.add(textField_4);
		
		JLabel lblRendimeto = new JLabel("Rendimeto:");
		lblRendimeto.setBounds(10, 156, 126, 14);
		contentPane.add(lblRendimeto);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(148, 153, 40, 20);
		contentPane.add(textField_5);
		
		JLabel lblFatorDeDemanda = new JLabel("Fator de demanda:");
		lblFatorDeDemanda.setBounds(218, 39, 126, 14);
		contentPane.add(lblFatorDeDemanda);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(356, 36, 40, 20);
		contentPane.add(textField_6);
		
		JLabel lblFatorDeUtilizao = new JLabel("Fator de utiliza\u00E7\u00E3o:");
		lblFatorDeUtilizao.setBounds(218, 69, 126, 14);
		contentPane.add(lblFatorDeUtilizao);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(356, 66, 40, 20);
		contentPane.add(textField_7);
		
		JLabel lblFatorDeServio = new JLabel("Fator de servi\u00E7o:");
		lblFatorDeServio.setBounds(218, 100, 126, 14);
		contentPane.add(lblFatorDeServio);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(356, 97, 40, 20);
		contentPane.add(textField_8);
		
		JLabel lblFatorDeSimutanea = new JLabel("Fator de simutaniedade:");
		lblFatorDeSimutanea.setBounds(218, 128, 126, 14);
		contentPane.add(lblFatorDeSimutanea);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(356, 125, 40, 20);
		contentPane.add(textField_9);
	}

}
