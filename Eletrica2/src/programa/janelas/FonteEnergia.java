package programa.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FonteEnergia extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfTensaoFF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FonteEnergia frame = new FonteEnergia();
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
	public FonteEnergia() {
		setTitle("FONTE DE ENERGIA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 268, 138);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 46, 14);
		contentPane.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(96, 8, 117, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblTensoFf = new JLabel("Tens\u00E3o FF:");
		lblTensoFf.setBounds(10, 39, 61, 14);
		contentPane.add(lblTensoFf);
		
		tfTensaoFF = new JTextField();
		tfTensaoFF.setBounds(96, 36, 61, 20);
		contentPane.add(tfTensaoFF);
		tfTensaoFF.setColumns(10);
		
		JLabel lblConcessionria = new JLabel("Concession\u00E1ria:");
		lblConcessionria.setBounds(10, 67, 76, 14);
		contentPane.add(lblConcessionria);
		
		JComboBox cbConcessionaria = new JComboBox();
		cbConcessionaria.setModel(new DefaultComboBoxModel(new String[] {"Ligth"}));
		cbConcessionaria.setBounds(96, 67, 117, 20);
		contentPane.add(cbConcessionaria);
	}
}
