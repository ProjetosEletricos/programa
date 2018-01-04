package programa.janelas.projeto;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;

import programa.Projeto;
import programa.janelas.fonte.FonteFrm;
import programa.janelas.main.Principal;
import programa.servico.ProjetoService;

public class ProjetoMouseListener implements MouseListener {

	private ProjetoFrm frm;

	public ProjetoMouseListener(ProjetoFrm frm) {

		this.frm = frm;
		this.adicionarMouseListener();
	}

	protected void adicionarMouseListener() {

		frm.getTableProjetos().addMouseListener(this);

	}

	@Override
	public void mouseClicked(MouseEvent e) {

		if (e.getClickCount() == 2) {

			HashMap<Object, Object> filtro = new HashMap<>();
			ProjetoService service = new ProjetoService();
			filtro.put("Id", frm.getTableProjetos().getValueAt(frm.getTableProjetos().getSelectedRow(), 0));
			ArrayList<Projeto> projetos = new ArrayList<>();
			projetos = service.getProjetos(filtro);

			FonteFrm fonteFrm = new FonteFrm(projetos.get(0).getId());

			Principal.desktopPane.add(fonteFrm);
			fonteFrm.setVisible(true);
			fonteFrm.setPosicao();

			this.frm.dispose();

		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
