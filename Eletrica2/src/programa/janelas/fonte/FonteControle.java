package programa.janelas.fonte;

import java.util.HashMap;

import programa.janelas.fonte.extras.FonteTableModel;
import programa.servico.FonteService;

public class Controle {

	private FonteFrm frm;

	public Controle(FonteFrm frm) {
		this.frm = frm;

		this.adiciona_ActionListener();
		this.adiciona_ListSelectionListener();
		this.adiciona_KeyListener();
		this.adiciona_MouseListener();
		this.iniciaListaFontes();

	}

	private void adiciona_ListSelectionListener() {
		new Fonte_ListSelectionListener(frm);
	}

	private void adiciona_KeyListener() {
		new Fontes_KeyListener(frm);
	}

	private void adiciona_ActionListener() {
		new FonteActionListener(frm);
	}
	
	private void adiciona_MouseListener() {
		new FonteMouseListener(frm);
	}

	private void iniciaListaFontes() {

		FonteService service = new FonteService();
		HashMap<Object, Object> filtro = new HashMap<>();
		filtro.put("idProjeto", frm.getLblIdProjeto().getText());
		FonteTableModel model = new FonteTableModel();
		model.setFontes(service.getFontes(filtro));
		frm.getTableFontes().setModel(model);
		frm.getTableFontes().updateUI();
	}

}
