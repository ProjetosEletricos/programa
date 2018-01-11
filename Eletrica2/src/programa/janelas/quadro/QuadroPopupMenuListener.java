package programa.janelas.quadro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.event.PopupMenuEvent;

import programa.Quadro;
import programa.janelas.projeto.ProjetoFrm;
import programa.servico.QuadroService;

public class QuadroPopupMenuListener implements javax.swing.event.PopupMenuListener {
	private ProjetoFrm frm;

	public QuadroPopupMenuListener(ProjetoFrm frm) {
		this.frm = frm;
	}

	@Override
	public void popupMenuCanceled(PopupMenuEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
		System.out.println("teste");
		List<Quadro> ls = new ArrayList<Quadro>();
		QuadroService service = new QuadroService();
		ls = service.getQuadros(new HashMap<>());
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
		for (int i = 0; i < ls.size(); i++) {
			model.addElement(ls.get(i).getNome());
		}

		frm.getCbQuadroPai().setModel(model);

	}

}
