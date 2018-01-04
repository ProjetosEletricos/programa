package programa.janelas.equipamento.extras;

import Programa.Equipamento;
import auxiliar.Numero;
import programa.janelas.equipamento.EquipamentoFrm;

public class EquipamentoToForm {

	
	public static void copia(Equipamento equipamento, EquipamentoFrm frm) {

		frm.getlblIdEquipamento().setText(Integer.toString(equipamento.getId()));
		frm.getTxtNome().setText(equipamento.getNome());
		frm.getTxtpnDescricao().setText(equipamento.getDescricao());
		frm.getCbUsabilidade().setSelectedItem(equipamento.getUsabilidade());
		frm.getTxtPotencia().setText(Numero.decimal(equipamento.getPotencia(), "0.##"));
		frm.getCbUniPotencia().setSelectedItem(equipamento.getUnidade());
		frm.getTxtQuantidade().setText(Integer.toString(equipamento.getQuantidade()));
		frm.getTxtFtPotencia().setText(Numero.decimal(equipamento.getFp(), "0.##"));
		frm.getTxtFtServico().setText(Numero.decimal(equipamento.getFs(), "0.##"));
		frm.getTxtFtDemanda().setText(Numero.decimal(equipamento.getFd(), "0.##"));
		frm.getTxtFtSimutaneiedade().setText(Numero.decimal(equipamento.getfSimu(), "0.##"));
		frm.getCbLigacao().setSelectedItem(equipamento.getLigacao());
		frm.getTxtPredasreator().setText(Numero.decimal(equipamento.getPerdasReator(), "0.##"));
		frm.getTxtRendimento().setText(Numero.decimal(equipamento.getRendimento(), "0.##"));
		frm.getCbNpolos().setSelectedItem(equipamento.getnPolos());
		frm.getTxtFtUtilizacao().setText(Numero.decimal(equipamento.getFu(), "0.##"));
	}
}
