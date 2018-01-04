package programa.janelas.fonte;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import programa.janelas.fonte.extras.Botao;
import programa.janelas.fonte.extras.DesabilitaCampos;
import programa.janelas.fonte.extras.Tabela;

public class FonteActionListener implements ActionListener {

	private FonteFrm frm;

	public FonteActionListener(FonteFrm frm) {
		this.frm = frm;
		adiciona_ActionListener();
		DesabilitaCampos.formu(frm);
	}

	protected void adiciona_ActionListener() {

		frm.getMntmExcluir().addActionListener(this);
		frm.getMntmInserir().addActionListener(this);
		frm.getMntmSalvar().addActionListener(this);
		frm.getMntmCancelar().addActionListener(this);
		frm.getMntmCopiar().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent event) {

		int idProjeto = 0;

		if (!(frm.getLblIdProjeto().getText().equals("0") || frm.getLblIdProjeto().getText().equals(""))) {
			idProjeto = Integer.parseInt(frm.getLblIdProjeto().getText());
		}

		if (event.getActionCommand().equals("Inserir")) {
			Botao.inserir(frm, idProjeto);
		} else if (event.getActionCommand().equals("Excluir")) {
			Botao.excluir(frm);
			atualizaTabela();
		} else if (event.getActionCommand().equals("Salvar")) {
			Botao.salvar(frm, idProjeto);
			atualizaTabela();
		} else if (event.getActionCommand().equals("Cancelar")) {
			Botao.cancelar(frm, idProjeto);
			atualizaTabela();
		} else if (event.getActionCommand().equals("Copiar")) {
			Botao.copiar(frm, idProjeto);
			atualizaTabela();
		}

	}

	public void atualizaTabela() {
		HashMap<Object,Object> filtro = new HashMap<>();
		filtro.put("idProjeto", frm.getLblIdProjeto().getText());
		new Tabela(frm).filtra(filtro);
	}



}
