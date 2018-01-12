package programa.janelas.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import programa.janelas.projeto.ProjetoFrm;

public class Principal extends JFrame {

	private JPanel contentPanePrincipal;
	public static JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("PROJETOS EL\u00C9TRICOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 713);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnJanelas = new JMenu("Menu");
		menuBar.add(mnJanelas);

		JMenuItem mntmNovoProjeto = new JMenuItem("Projetos");
		mntmNovoProjeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProjetoFrm form = new ProjetoFrm();

				Principal.desktopPane.add(form);
				form.setVisible(true);
				form.setPosicao();
			}
		});
		mnJanelas.add(mntmNovoProjeto);
		contentPanePrincipal = new JPanel();
		contentPanePrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanePrincipal.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPanePrincipal);

		Principal.desktopPane = new JDesktopPane();
		contentPanePrincipal.add(Principal.desktopPane, BorderLayout.CENTER);
	}

	public JPanel getContentPanePrincipal() {
		return contentPanePrincipal;
	}

	public void setContentPanePrincipal(JPanel contentPanePrincipal) {
		this.contentPanePrincipal = contentPanePrincipal;
	}

}
