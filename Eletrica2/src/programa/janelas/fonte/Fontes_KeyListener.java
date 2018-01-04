package programa.janelas.fonte;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import programa.janelas.formatacao.ApenasNumero;

public class Fontes_KeyListener implements KeyListener {

	private FonteFrm frm;

	public Fontes_KeyListener(FonteFrm frm) {
		this.frm = frm;
		adicionarKeyListener();

	}

	public void adicionarKeyListener() {

		frm.getTxtTensao().addKeyListener(this);

	}

	@Override
	public void keyTyped(KeyEvent event) {

		ApenasNumero.campo(event, "txtTensao");

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
