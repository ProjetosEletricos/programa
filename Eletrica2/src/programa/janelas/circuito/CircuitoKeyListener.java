package programa.janelas.circuito;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import programa.janelas.formatacao.ApenasNumero;
import programa.janelas.projeto.ProjetoFrm;

public class CircuitoKeyListener implements KeyListener {

	private ProjetoFrm frm;

	public CircuitoKeyListener(ProjetoFrm frm) {
		this.frm = frm;
		adicionarKeyListener();

	}

	public void adicionarKeyListener() {

		frm.getTxtComprimento().addKeyListener(this);
		frm.getTxtQTensao().addKeyListener(this);
		frm.getTxtResistividaeTerm().addKeyListener(this);
		frm.getTxtTemperatura().addKeyListener(this);

	}

	@Override
	public void keyTyped(KeyEvent event) {

		ApenasNumero.campo(event, "txtComprimentoCircuito");
		ApenasNumero.campo(event, "txtQTensaoCircuito");
		ApenasNumero.campo(event, "txtResistividadeTermCircuito");
		ApenasNumero.campo(event, "txtTemperaturaCircuito");

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
