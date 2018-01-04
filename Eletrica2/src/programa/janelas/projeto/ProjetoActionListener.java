package programa.janelas.projeto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import programa.janelas.projeto.extras.Botao;

public class ProjetoActionListener implements ActionListener {

	private ProjetoFrm frm;

	public ProjetoActionListener(ProjetoFrm frm) {

		this.frm = frm;
		this.adicionaActionListener();
	}

	private void adicionaActionListener() {

		frm.getBtnCopiarProjeto().addActionListener(this);
		frm.getBtnExcluirProjeto().addActionListener(this);
		frm.getBtnSalvarProjeto().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == frm.getBtnExcluirProjeto()) {
			Botao.excluir(frm);

		} else if (event.getSource() == frm.getBtnSalvarProjeto()) {
			Botao.salvar(frm);

		} else if (event.getSource() == frm.getBtnCopiarProjeto()) {
			Botao.copiar(frm);

		}

	}

}
