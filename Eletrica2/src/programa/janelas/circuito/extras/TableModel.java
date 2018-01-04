/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.janelas.circuito.extras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import programa.Equipamento;

public class TableModel extends AbstractTableModel {

	private ArrayList<Equipamento> equipamentos;
	private List<String> colunas;

	public TableModel() {
		equipamentos = new ArrayList<>();

		colunas = Arrays.asList("Id", "Nome", "Qtd", "Potência", "Uni", "Local");
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
			return equipamento.getQuantidade();
		case 3:
			return equipamento.getPotencia();
		case 4:
			return equipamento.getUnidade();
		case 5:
			return equipamento.getDescricao();
		default:
			return "";
		}
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Equipamento equipamento = equipamentos.get(rowIndex);

		switch (columnIndex) {
		case 0:
			equipamento.setId((int) aValue);
			break;
		case 1:
			equipamento.setNome(aValue.toString());
			break;
		case 2:
			equipamento.setQuantidade((int) aValue);
			break;
		case 3:
			equipamento.setPotencia((double) aValue);
			break;
		case 4:
			equipamento.setUnidade(aValue.toString());
			break;
		case 5:
			equipamento.setDescricao(aValue.toString());
			break;
		}
		fireTableRowsDeleted(0, getRowCount() - 1);
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;// todas as celulas vão ser editáveis
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamentos.add(equipamento);
		fireTableDataChanged();
	}

	public void setEquipamentos(ArrayList<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
		fireTableDataChanged();
	}

	public void Excluir(Equipamento equipamento) {
		this.equipamentos.remove(equipamento);
		fireTableDataChanged();
	}

	public void Excluir(int pos) {
		this.equipamentos.remove(pos);
		fireTableDataChanged();
		fireTableRowsDeleted(0, getRowCount() - 1);
	}

	public Equipamento getEquipamento(int pos) {
		if (pos < 0 || pos >= equipamentos.size()) {
			return null;
		}
		return (Equipamento) equipamentos.get(pos);
	}

}
