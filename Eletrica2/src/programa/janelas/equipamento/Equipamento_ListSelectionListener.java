package programa.janelas.equipamento;

import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import Programa.Equipamento;
import programa.janelas.equipamento.extras.EquipamentoToForm;
import programa.janelas.equipamento.extras.Habilitacampos;

public class Equipamento_ListSelectionListener implements ListSelectionListener {

	private EquipamentoFrm frm;
	private EquipamentoTableModel tableModel;

	public Equipamento_ListSelectionListener(EquipamentoFrm frm,EquipamentoTableModel tableModel) {
		
		this.frm = frm;
		this.tableModel = tableModel;
	}

	@Override
	public void valueChanged(ListSelectionEvent event) {
		
		Equipamento equipamento = tableModel.getEquipamentos().get(frm.getTableEquipamentos().getSelectedRow());
		EquipamentoToForm.copia(equipamento, frm);
		Habilitacampos.formu(frm);
		frm.getMntmExcluir().setEnabled(true);
		frm.getMntmInserir().setEnabled(false);
		frm.getMntmSalvar().setEnabled(true);
		frm.getMntmCancelar().setEnabled(true);
		frm.getMntmCopiar().setEnabled(true);

	}
	
	public void add(ListSelectionModel model) {
		model.addListSelectionListener(this);
	}
	


}
