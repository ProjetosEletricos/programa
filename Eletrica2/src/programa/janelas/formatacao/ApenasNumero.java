package programa.janelas.formatacao;

import java.awt.event.KeyEvent;

public class ApenasNumero {
	
	private ApenasNumero() {
		throw new IllegalStateException("Utility class");
	}
	
	public static void campo(KeyEvent event, String nomeComponente) {

		String stri = String.valueOf(event.getKeyChar());
		char caract = event.getKeyChar();

		if (event.getComponent().getName().equals(nomeComponente) && !(stri.equals(","))
				&& !(caract >= KeyEvent.VK_0 && caract <= KeyEvent.VK_9)) {
			event.consume();

		}
	}

}
