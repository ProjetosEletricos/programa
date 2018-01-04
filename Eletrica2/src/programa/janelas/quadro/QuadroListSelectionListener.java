package programa.janelas.quadro;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import programa.Quadro;
import programa.janelas.quadro.extras.HabilitaCampos;
import programa.janelas.quadro.extras.QuadroToForm;
import programa.servico.QuadroService;

public class QuadroListSelectionListener implements ListSelectionListener {

	private QuadroFrm frm;

	public QuadroListSelectionListener(QuadroFrm frm) {

		this.frm = frm;
		adicionaListSelectionListener();
	}

	private void adicionaListSelectionListener() {

		frm.getTableQuadro().getSelectionModel().addListSelectionListener(this);
		
	}

	@Override
	public void valueChanged(ListSelectionEvent event) {

		HashMap<Object, Object> filtro = new HashMap<>();
		filtro.put("Id", frm.getTableQuadro().getValueAt(frm.getTableQuadro().getSelectedRow(),0));

		ArrayList<Quadro> quadros = new ArrayList<>();
		QuadroService service = new QuadroService();
		quadros = service.getQuadros(filtro);
		QuadroToForm.copia(quadros.get(0), frm);
		
		HabilitaCampos.formu(frm);
		frm.getMntmExcluir().setEnabled(true);
		frm.getMntmInserir().setEnabled(false);
		frm.getMntmSalvar().setEnabled(true);
		frm.getMntmCancelar().setEnabled(true);
		frm.getMntmCopiar().setEnabled(true);

	}
}
