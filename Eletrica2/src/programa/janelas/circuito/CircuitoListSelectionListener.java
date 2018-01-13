package programa.janelas.circuito;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import programa.Circuito;
import programa.Condutor;
import programa.janelas.circuito.extras.CircuitoToForm;
import programa.janelas.circuito.extras.CondutorToForm;
import programa.janelas.projeto.ProjetoFrm;

public class CircuitoListSelectionListener implements ListSelectionListener {

	private ProjetoFrm frm;

	public CircuitoListSelectionListener(ProjetoFrm frm) {
		this.frm = frm;
	}

	@Override
	public void valueChanged(ListSelectionEvent event) {

		Circuito circuito = frm.getSelectCircuito();
		CircuitoToForm.copia(circuito, frm);
		Condutor condutor = circuito.getCondutor();
		CondutorToForm.copia(condutor, frm);

	}
}
