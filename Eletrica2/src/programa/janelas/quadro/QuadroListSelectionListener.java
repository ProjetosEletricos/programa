package programa.janelas.quadro;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import programa.Quadro;
import programa.janelas.projeto.ProjetoFrm;
import programa.janelas.quadro.extras.QuadroToForm;

public class QuadroListSelectionListener implements ListSelectionListener {

	private ProjetoFrm frm;

	public QuadroListSelectionListener(ProjetoFrm frm) {

		this.frm = frm;

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

		int firstIndex = e.getFirstIndex();

		if (firstIndex >= 0 && firstIndex < frm.getTableQuadros().getModel().getRowCount()) {

			Quadro quadro = frm.getSelectQuadro();
			QuadroToForm.copia(quadro, frm);

		}
	}
}
