package programa.janelas.fonte;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import programa.Fonte;
import programa.janelas.fonte.extras.FonteToForm;
import programa.janelas.fonte.extras.HabilitaCampos;
import programa.servico.FonteService;

public class Fonte_ListSelectionListener implements ListSelectionListener {

	private FonteFrm frm;

	public Fonte_ListSelectionListener(FonteFrm frm) {

		this.frm = frm;
		adicionaListSelectionListener();
	}

	private void adicionaListSelectionListener() {

		frm.getTableFontes().getSelectionModel().addListSelectionListener(this);
		
	}

	@Override
	public void valueChanged(ListSelectionEvent event) {

		HashMap<Object, Object> filtro = new HashMap<>();
		filtro.put("Id", frm.getTableFontes().getValueAt(frm.getTableFontes().getSelectedRow(),0));

		ArrayList<Fonte> fontes = new ArrayList<>();
		FonteService service = new FonteService();
		fontes = service.getFontes(filtro);
		FonteToForm.copia(fontes.get(0), frm);
		
		HabilitaCampos.formu(frm);
		frm.getMntmExcluir().setEnabled(true);
		frm.getMntmInserir().setEnabled(false);
		frm.getMntmSalvar().setEnabled(true);
		frm.getMntmCancelar().setEnabled(true);
		frm.getMntmCopiar().setEnabled(true);

	}
}
