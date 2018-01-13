package programa.janelas.circuito;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import programa.janelas.projeto.ProjetoFrm;
import programa.janelas.quadro.extras.QuadroBotao;

public class CircuitoActionListener implements ActionListener {

	private ProjetoFrm frm;

	public CircuitoActionListener(ProjetoFrm frm) {
		this.frm = frm;
		adicionaActionListener();

	}

	protected void adicionaActionListener() {

		frm.getBtnCopiarCircuito().addActionListener(this);
		frm.getBtnExcluirCircuito().addActionListener(this);
		frm.getBtnSalvarCircuito().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent event) {
System.out.println("teste");
		int idQuadro = Integer.parseInt(frm.getLblIdQuadro().getText());

		if (event.getSource() == frm.getBtnExcluirCircuito()) {
			QuadroBotao.excluir(frm);

		} else if (event.getSource() == frm.getBtnSalvarCircuito()) {
			QuadroBotao.salvar(frm, idQuadro);

		} else if (event.getSource() == frm.getBtnCopiarCircuito()) {
			QuadroBotao.copiar(frm, idQuadro);

		}
	}
}
