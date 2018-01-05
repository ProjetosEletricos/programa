package programa.janelas.fonte;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import programa.janelas.main.Principal;
import programa.janelas.projeto.ProjetoFrm;
import programa.janelas.quadro.QuadroFrm;

public class FonteMouseListener implements MouseListener {

	private ProjetoFrm frm;

	public FonteMouseListener(ProjetoFrm frm) {

		this.frm = frm;
		this.adicionarMouseListener();
	}

	protected void adicionarMouseListener() {

		frm.getTableFontes().addMouseListener(this);

	}

	@Override
	public void mouseClicked(MouseEvent e) {

		if (e.getClickCount() == 2) {

			QuadroFrm quadroFrm = new QuadroFrm(Integer.parseInt(frm.getLblIdFonte().getText()));
			
			Principal.desktopPane.add(quadroFrm);
			quadroFrm.setVisible(true);
			quadroFrm.setPosicao();

			this.frm.dispose();

		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
