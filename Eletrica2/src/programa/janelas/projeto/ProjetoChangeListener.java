package programa.janelas.projeto;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import programa.janelas.circuito.extras.CircuitoApagarDados;
import programa.janelas.fonte.extras.FonteApagarDados;
import programa.janelas.quadro.extras.QuadroApagarDados;

public class ProjetoChangeListener implements ChangeListener {

	private ProjetoFrm frm;

	public ProjetoChangeListener(ProjetoFrm frm) {

		this.frm = frm;
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {

		if (frm.getAbas().getSelectedComponent() == frm.getPanelFonte()) {

			frm.iniciaTabelaFontes();
			FonteApagarDados.formu(frm);

		}
		if (frm.getAbas().getSelectedComponent() == frm.getPanelQuadro()) {

			frm.iniciaTabelaQuadros();
			
			QuadroApagarDados.formu(frm);

		}
		if (frm.getAbas().getSelectedComponent() == frm.getPanelCircuito()) {

			frm.iniciaListCircuitos();
			
			CircuitoApagarDados.formu(frm);

		}

	}

}
