package programa.janelas.fonte;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import programa.janelas.formatacao.ApenasNumero;
import programa.janelas.projeto.ProjetoFrm;

public class FontesKeyListener implements KeyListener {

	private ProjetoFrm frm;

	public FontesKeyListener(ProjetoFrm frm) {
		this.frm = frm;
		this.adicionarKeyListener();

	}

	protected void adicionarKeyListener() {

		frm.getTxtTensaoFonte().addKeyListener(this);

	}

	@Override
	public void keyTyped(KeyEvent event) {

		ApenasNumero.campo(event, "txtTensaoFonte");

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
