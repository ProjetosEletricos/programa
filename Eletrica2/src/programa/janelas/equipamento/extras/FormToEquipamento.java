package programa.janelas.equipamento.extras;

import Programa.Equipamento;
import auxiliar.Numero;
import programa.janelas.equipamento.EquipamentoFrm;

public class FormToEquipamento {
	
	public static Equipamento copia(EquipamentoFrm frm) {

		Equipamento equipamento = new Equipamento();

		if (!frm.getlblIdEquipamento().getText().equals("0")) {
			equipamento.setId(Integer.parseInt(frm.getlblIdEquipamento().getText()));
		}
		
		equipamento.setNome(frm.getTxtNome().getText());
		equipamento.setDescricao(frm.getTxtpnDescricao().getText());
		equipamento.setUsabilidade(frm.getCbUsabilidade().getSelectedItem().toString());
		equipamento.setPotencia(Numero.stringToDouble(frm.getTxtPotencia().getText()));
		equipamento.setUnidade(frm.getCbUniPotencia().getSelectedItem().toString());
		equipamento.setQuantidade(Integer.parseInt(frm.getTxtQuantidade().getText()));
		equipamento.setFp(Numero.stringToDouble(frm.getTxtFtPotencia().getText()));
		equipamento.setFs(Numero.stringToDouble(frm.getTxtFtServico().getText()));
		equipamento.setFd(Numero.stringToDouble(frm.getTxtFtDemanda().getText()));
		equipamento.setfSimu(Numero.stringToDouble(frm.getTxtFtSimutaneiedade().getText()));
		equipamento.setLigacao(frm.getCbLigacao().getSelectedItem().toString());
		equipamento.setPerdasReator(Numero.stringToDouble(frm.getTxtPredasreator().getText()));
		equipamento.setRendimento(Numero.stringToDouble(frm.getTxtRendimento().getText()));
		equipamento.setnPolos(Integer.parseInt(frm.getCbNpolos().getSelectedItem().toString()));
		equipamento.setFu(Numero.stringToDouble(frm.getTxtFtUtilizacao().getText()));

		return equipamento;
	}
}
