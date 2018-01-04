package programa.janelas.quadro;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;

import programa.Quadro;
import programa.janelas.circuito.CircuitoFrm;
import programa.janelas.main.Principal;
import programa.servico.QuadroService;

public class QuadroMouseListener implements MouseListener {

	private QuadroFrm frm;

	public QuadroMouseListener(QuadroFrm frm) {

		this.frm = frm;
		this.adicionarMouseListener();
	}

	protected void adicionarMouseListener() {

		frm.getTableQuadro().addMouseListener(this);

	}

	@Override
	public void mouseClicked(MouseEvent e) {

		if (e.getClickCount() == 2) {

			HashMap<Object, Object> filtro = new HashMap<>();
			QuadroService service = new QuadroService();
			filtro.put("Id", frm.getTableQuadro().getValueAt(frm.getTableQuadro().getSelectedRow(), 0));
			ArrayList<Quadro> quadros = new ArrayList<>();
			quadros = service.getQuadros(filtro);

			CircuitoFrm circuitoFrm = new CircuitoFrm(quadros.get(0).getId());
			circuitoFrm.setVisible(true);

			Principal.desktopPane.add(circuitoFrm);
			circuitoFrm.show();
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
