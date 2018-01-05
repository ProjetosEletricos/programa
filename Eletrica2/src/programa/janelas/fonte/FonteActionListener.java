package programa.janelas.fonte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import programa.janelas.fonte.extras.Botao;
import programa.janelas.projeto.ProjetoFrm;

public class FonteActionListener implements ActionListener {

	private ProjetoFrm frm;

	public FonteActionListener(ProjetoFrm frm) {
		this.frm = frm;
		adicionaActionListener();

	}

	protected void adicionaActionListener() {

		frm.getBtnCopiarFonte().addActionListener(this);
		frm.getBtnExcluirFonte().addActionListener(this);
		frm.getBtnSalvarFonte().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent event) {
		int idProjeto = Integer.parseInt(frm.getLblIdProjeto().toString());
		if (event.getSource() == frm.getBtnExcluirFonte()) {
			Botao.excluir(frm);

		} else if (event.getSource() == frm.getBtnSalvarFonte()) {
			Botao.salvar(frm, idProjeto);

		} else if (event.getSource() == frm.getBtnCopiarFonte()) {
			Botao.copiar(frm, idProjeto);

		}
	}
}
