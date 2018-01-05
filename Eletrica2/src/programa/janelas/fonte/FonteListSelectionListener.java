package programa.janelas.fonte;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import programa.Fonte;
import programa.janelas.fonte.extras.FonteToForm;
import programa.janelas.projeto.ProjetoFrm;

public class FonteListSelectionListener implements ListSelectionListener {

	private ProjetoFrm frm;

	public FonteListSelectionListener(ProjetoFrm frm) {

		this.frm = frm;

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		/*
		 * HashMap<Object, Object> filtro = new HashMap<>(); filtro.put("Id",
		 * frm.getTableFontes().getValueAt(frm.getTableFontes().getSelectedRow(),0));
		 * 
		 * ArrayList<Fonte> fontes = new ArrayList<>(); FonteService service = new
		 * FonteService(); fontes = service.getFontes(filtro);
		 * FonteToForm.copia(fontes.get(0), frm);
		 * 
		 */
		int firstIndex = e.getFirstIndex();

		if (firstIndex >= 0 && firstIndex < frm.getTableFontes().getModel().getRowCount()) {

			Fonte fonte = frm.getSelectFonte();
			FonteToForm.copia(fonte, frm);

		}

	}
}
