package programa.janelas.quadro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

import programa.Quadro;
import programa.janelas.projeto.ProjetoFrm;
import programa.janelas.quadro.extras.QuadroBotao;
import programa.servico.QuadroService;

public class QuadroActionListener implements ActionListener {

	private ProjetoFrm frm;

	public QuadroActionListener(ProjetoFrm frm) {
		this.frm = frm;
		adicionaActionListener();

	}

	protected void adicionaActionListener() {

		frm.getBtnCopiarQuadro().addActionListener(this);
		frm.getBtnExcluirQuadro().addActionListener(this);
		frm.getBtnSalvarQuadro().addActionListener(this);
		frm.getCbQuadroPai().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("event: "+ event);

		int idFonte = Integer.parseInt(frm.getLblIdFonte().getText());

		if (event.getSource() == frm.getBtnExcluirQuadro()) {
			QuadroBotao.excluir(frm);

		} else if (event.getSource() == frm.getBtnSalvarQuadro()) {
			QuadroBotao.salvar(frm, idFonte);

		} else if (event.getSource() == frm.getBtnCopiarQuadro()) {
			QuadroBotao.copiar(frm, idFonte);

		} else if (event.getSource() == frm.getCbQuadroPai()) {
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

}
