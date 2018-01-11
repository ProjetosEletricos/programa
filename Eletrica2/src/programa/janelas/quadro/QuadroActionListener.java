package programa.janelas.quadro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import programa.janelas.projeto.ProjetoFrm;
import programa.janelas.quadro.extras.QuadroBotao;

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

	}

	@Override
	public void actionPerformed(ActionEvent event) {

		int idFonte = Integer.parseInt(frm.getLblIdFonte().getText());

		if (event.getSource() == frm.getBtnExcluirQuadro()) {
			QuadroBotao.excluir(frm);

		} else if (event.getSource() == frm.getBtnSalvarQuadro()) {
			QuadroBotao.salvar(frm, idFonte);

		} else if (event.getSource() == frm.getBtnCopiarQuadro()) {
			QuadroBotao.copiar(frm, idFonte);

		}

	}

}
