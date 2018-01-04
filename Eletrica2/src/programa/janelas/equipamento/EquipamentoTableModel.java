
package programa.janelas.equipamento;

import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import Programa.Equipamento;
import auxiliar.Numero;


public class EquipamentoTableModel extends AbstractTableModel {

	private List<Equipamento> equipamentos;
	private List<String> colunas;

	public EquipamentoTableModel(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
		colunas = Arrays.asList("Id", "Nome", "Potência", "Unid.", "Fp", "Rendimento", "Nº pólos");
	}

	@Override
	public String getColumnName(int column) {
		return colunas.get(column);
	}

	@Override
	public int getRowCount() {
		return equipamentos.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		Equipamento equipamento = equipamentos.get(rowIndex);

		switch (columnIndex) {
		case 0:
			return equipamento.getId();
		case 1:
			return equipamento.getNome();
		case 2:
			return Numero.decimal(equipamento.getPotencia(), "0.##");
		case 3:
			return equipamento.getUnidade();
		case 4:
			return Numero.decimal(equipamento.getFp(), "0.##");
		case 5:
			return Numero.decimal(equipamento.getRendimento(), "0.##");
		case 6:
			return equipamento.getnPolos();
		default:
			return null;
		}

	}

	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}
	
	public void addEquipamento(Equipamento equipamento) {
		
		this.equipamentos.add(equipamento);
		
	}

}
