package programa.janelas.equipamento.extras;

import programa.janelas.equipamento.EquipamentoFrm;

public class DesabilitaCampos {

	public static void formu(EquipamentoFrm frm) {

		frm.getlblIdEquipamento().setEnabled(false);
		frm.getTxtNome().setEnabled(false);
		frm.getTxtpnDescricao().setEnabled(false);
		frm.getCbUsabilidade().setEnabled(false);
		frm.getTxtPotencia().setEnabled(false);
		frm.getCbUniPotencia().setEnabled(false);
		frm.getTxtQuantidade().setEnabled(false);
		frm.getTxtFtPotencia().setEnabled(false);
		frm.getTxtFtServico().setEnabled(false);
		frm.getTxtFtDemanda().setEnabled(false);
		frm.getTxtFtSimutaneiedade().setEnabled(false);
		frm.getCbLigacao().setEnabled(false);
		frm.getTxtPredasreator().setEnabled(false);
		frm.getTxtRendimento().setEnabled(false);
		frm.getCbNpolos().setEnabled(false);
		frm.getTxtFtUtilizacao().setEnabled(false);

	}
}
