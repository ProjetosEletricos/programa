package programa.janelas.quadro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import programa.janelas.quadro.extras.Botao;
import programa.janelas.quadro.extras.DesabilitaCampos;
import programa.janelas.quadro.extras.Tabela;

public class QuadroActionListener implements ActionListener {

	private QuadroFrm frm;

	public QuadroActionListener(QuadroFrm frm) {
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

		int idFonte = 0;

		if (!(frm.getLblIdFonte().getText().equals("0") || frm.getLblIdFonte().getText().equals(""))) {
			idFonte = Integer.parseInt(frm.getLblIdFonte().getText());
		}

		if (event.getActionCommand().equals("Inserir")) {
			Botao.inserir(frm, idFonte);
		} else if (event.getActionCommand().equals("Excluir")) {
			Botao.excluir(frm);
			atualizaTabela();
		} else if (event.getActionCommand().equals("Salvar")) {
			Botao.salvar(frm, idFonte);
			atualizaTabela();
		} else if (event.getActionCommand().equals("Cancelar")) {
			Botao.cancelar(frm, idFonte);
			atualizaTabela();
		} else if (event.getActionCommand().equals("Copiar")) {
			Botao.copiar(frm, idFonte);
			atualizaTabela();
		}

	}

	public void atualizaTabela() {
		HashMap<Object,Object> filtro = new HashMap<>();
		filtro.put("idFonte", frm.getLblIdFonte().getText());
		new Tabela(frm).filtra(filtro);
	}



}
