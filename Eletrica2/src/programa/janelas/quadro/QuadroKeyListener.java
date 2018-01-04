package programa.janelas.quadro;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import programa.janelas.formatacao.ApenasNumero;

public class QuadroKeyListener implements KeyListener {

	private QuadroFrm frm;

	public QuadroKeyListener(QuadroFrm frm) {
		this.frm = frm;
		adicionarKeyListener();

	}

	public void adicionarKeyListener() {

		frm.getTxtFp().addKeyListener(this);
		frm.getTxtFd().addKeyListener(this);

	}

	@Override
	public void keyTyped(KeyEvent event) {

		ApenasNumero.campo(event, "txtFd");
		ApenasNumero.campo(event, "txtFp");

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
