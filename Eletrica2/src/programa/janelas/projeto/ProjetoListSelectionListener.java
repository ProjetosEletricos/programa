package programa.janelas.projeto;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import programa.Projeto;
import programa.janelas.projeto.extras.ProjetoToForm;

public class ProjetoListSelectionListener implements ListSelectionListener {

	private ProjetoFrm frm;

	public ProjetoListSelectionListener(ProjetoFrm frm) {

		this.frm = frm;
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

		int firstIndex = e.getFirstIndex();
		
		if (firstIndex >= 0 && firstIndex < frm.getTableProjetos().getModel().getRowCount()) {
			
			Projeto projeto = frm.getSelectProjeto();
			ProjetoToForm.copia(projeto, frm);

		}else {
			System.out.println("teste");
		}
	}

}
