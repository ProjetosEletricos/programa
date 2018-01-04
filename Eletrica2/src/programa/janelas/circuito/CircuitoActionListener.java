package programa.janelas.circuito;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import programa.janelas.circuito.extras.Botao;
import programa.janelas.circuito.extras.DesabilitaCampos;
import programa.janelas.circuito.extras.Tabela1;

public class CircuitoActionListener implements ActionListener {

	private CircuitoFrm frm;

	public CircuitoActionListener(CircuitoFrm frm) {
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

		int idQuadro = 0;

		if (!(frm.getLblIdQuadro().getText().equals("0") || frm.getLblIdQuadro().getText().equals(""))) {
			idQuadro = Integer.parseInt(frm.getLblIdQuadro().getText());
		}

		if (event.getActionCommand().equals("Inserir")) {
			Botao.inserir(frm, idQuadro);
		} else if (event.getActionCommand().equals("Excluir")) {
			Botao.excluir(frm);
			atualizaTabela();
		} else if (event.getActionCommand().equals("Salvar")) {
			Botao.salvar(frm, idQuadro);
			atualizaLista();
		} else if (event.getActionCommand().equals("Cancelar")) {
			Botao.cancelar(frm, idQuadro);
			atualizaTabela();
		} else if (event.getActionCommand().equals("Copiar")) {
			Botao.copiar(frm, idQuadro);
			atualizaTabela();
		}

	}

	public void atualizaTabela() {
		HashMap<Object, Object> filtro = new HashMap<>();
		filtro.put("idQuadro", frm.getLblIdQuadro().getText());
		new Tabela1(frm).filtra(filtro);
	}

	public void atualizaLista() {
		HashMap<Object, Object> filtro = new HashMap<>();
		filtro.put("idQuadro", frm.getLblIdQuadro().getText());
		// new Lista(frm).filtra(filtro);
	}

}
