package programa.janelas.quadro;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import programa.janelas.formatacao.ApenasNumero;
import programa.janelas.projeto.ProjetoFrm;

public class QuadroKeyListener implements KeyListener {

	private ProjetoFrm frm;

	public QuadroKeyListener(ProjetoFrm frm) {
		this.frm = frm;
		adicionarKeyListener();

	}

	public void adicionarKeyListener() {

		frm.getTxtFpQuadro().addKeyListener(this);
		frm.getTxtFdQuadro().addKeyListener(this);

	}

	@Override
	public void keyTyped(KeyEvent event) {

		ApenasNumero.campo(event, "txtFdQuadro");
		ApenasNumero.campo(event, "txtFpQuadro");

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
