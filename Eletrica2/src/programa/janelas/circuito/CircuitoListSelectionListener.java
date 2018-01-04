package programa.janelas.circuito;

import java.util.HashMap;

import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import programa.Circuito;
import programa.Condutor;
import programa.janelas.circuito.extras.CircuitoToForm;
import programa.janelas.circuito.extras.CondutorToForm;
import programa.janelas.circuito.extras.HabilitaCampos;
import programa.janelas.circuito.extras.Tabela1;

public class CircuitoListSelectionListener implements ListSelectionListener {

	private CircuitoFrm frm;

	public CircuitoListSelectionListener(CircuitoFrm frm) {
		this.frm = frm;
	}

	@Override
	public void valueChanged(ListSelectionEvent event) {

		// Lista lista = new Lista();

		Circuito circuito = frm.getSelectCircuito();

		CircuitoToForm.copia(circuito, frm);
		Condutor condutor = circuito.getCondutor();
		CondutorToForm.copia(condutor, frm);

		HashMap<Object, Object> filtroEqui = new HashMap<Object, Object>();
		filtroEqui.put("idCir", frm.getLblIdcircuito());
		new Tabela1(frm).filtra(new HashMap<>());
		// new Tabela2(frm).filtra(filtroEqui);

		HabilitaCampos.formu(frm);

	}

	public void add(ListSelectionModel model) {
		model.addListSelectionListener(this);
	}
}
