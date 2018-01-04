package programa.janelas.equipamento.extras;

import programa.janelas.equipamento.EquipamentoFrm;

public class ApagarDados {
	public static void formu(EquipamentoFrm frm) {

		frm.getlblIdEquipamento().setText("0");
		frm.getTxtNome().setText("");
		frm.getTxtpnDescricao().setText("");
		frm.getCbUsabilidade().setSelectedItem(null);
		frm.getTxtPotencia().setText("");
		frm.getCbUniPotencia().setSelectedItem(null);
		frm.getTxtQuantidade().setText("");
		frm.getTxtFtPotencia().setText("");
		frm.getTxtFtServico().setText("");
		frm.getTxtFtDemanda().setText("");
		frm.getTxtFtSimutaneiedade().setText("");
		frm.getCbLigacao().setSelectedItem(null);
		frm.getTxtPredasreator().setText("");
		frm.getTxtRendimento().setText("");
		frm.getCbNpolos().setSelectedItem(null);
		frm.getTxtFtUtilizacao().setText("");
	}
}
