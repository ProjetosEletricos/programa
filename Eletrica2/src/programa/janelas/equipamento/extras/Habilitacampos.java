package programa.janelas.equipamento.extras;

import programa.janelas.equipamento.EquipamentoFrm;

public class Habilitacampos {

	public static void formu(EquipamentoFrm frm) {

		frm.getlblIdEquipamento().setEnabled(true);
		frm.getTxtNome().setEnabled(true);
		frm.getTxtpnDescricao().setEnabled(true);
		frm.getCbUsabilidade().setEnabled(true);
		frm.getTxtPotencia().setEnabled(true);
		frm.getCbUniPotencia().setEnabled(true);
		frm.getTxtQuantidade().setEnabled(true);
		frm.getTxtFtPotencia().setEnabled(true);
		frm.getTxtFtServico().setEnabled(true);
		frm.getTxtFtDemanda().setEnabled(true);
		frm.getTxtFtSimutaneiedade().setEnabled(true);
		frm.getCbLigacao().setEnabled(true);
		frm.getTxtPredasreator().setEnabled(true);
		frm.getTxtRendimento().setEnabled(true);
		frm.getCbNpolos().setEnabled(true);
		frm.getTxtFtUtilizacao().setEnabled(true);
		// frm.getTableEquipamentos().setEnabled(false);
	}
}
