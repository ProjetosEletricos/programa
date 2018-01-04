package programa.janelas.circuito;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import programa.janelas.formatacao.ApenasNumero;

public class CircuitoKeyListener implements KeyListener {

	private CircuitoFrm frm;

	public CircuitoKeyListener(CircuitoFrm frm) {
		this.frm = frm;
		adicionarKeyListener();

	}

	public void adicionarKeyListener() {

		frm.getTxtdistAlimentador().addKeyListener(this);
		frm.getTxtQTensao().addKeyListener(this);
		frm.getTxtResistividaeTerm().addKeyListener(this);
		frm.getTxtTemperatura().addKeyListener(this);

	}

	@Override
	public void keyTyped(KeyEvent event) {

		ApenasNumero.campo(event, "txtdistAlimentador");
		ApenasNumero.campo(event, "txtQTensao");
		ApenasNumero.campo(event, "txtResistividaeTerm");
		ApenasNumero.campo(event, "txtTemperatura");

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
