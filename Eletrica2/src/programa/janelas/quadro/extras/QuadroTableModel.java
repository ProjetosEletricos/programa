
package programa.janelas.quadro.extras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import programa.Quadro;

public class QuadroTableModel extends AbstractTableModel {

	private ArrayList<Quadro> quadros;
	private List<String> colunas;

	public QuadroTableModel() {
		quadros = new ArrayList<>();

		colunas = Arrays.asList("Id", "Nome", "Local");
	}

	@Override
	public String getColumnName(int column) {
		return colunas.get(column);
	}

	@Override
	public int getRowCount() {

		return quadros.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		Quadro quadro = quadros.get(rowIndex);

		switch (columnIndex) {
		case 0:
			return quadro.getId();
		case 1:
			return quadro.getNome();
		case 2:
			return quadro.getLocal();
		}
		return null;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Quadro quadro = quadros.get(rowIndex);// pega o contato da linha
		switch (columnIndex) {
		case 0:
			quadro.setId((int) aValue);
			break;
		case 1:
			quadro.setNome(aValue.toString());
			break;
		case 2:
			quadro.setLocal(aValue.toString());
			break;
		}
		fireTableRowsDeleted(0, getRowCount() - 1);
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;// todas as celulas vão ser editáveis
	}

	public void setQuadro(Quadro quadro) {
		this.quadros.add(quadro);
		fireTableDataChanged();
	}

	public void setQuadros(ArrayList<Quadro> quadros) {
		this.quadros = quadros;
		fireTableDataChanged();
	}

	public void Excluir(Quadro quadro) {
		this.quadros.remove(quadro);
		fireTableDataChanged();
		fireTableRowsDeleted(0, getRowCount() - 1);
	}

	public void Excluir(int pos) {
		this.quadros.remove(pos);
		fireTableDataChanged();
		fireTableRowsDeleted(0, getRowCount() - 1);
	}

	public Quadro getQuadro(int pos) {
		if (pos < 0 || pos >= quadros.size()) {
			return null;
		}
		return (Quadro) quadros.get(pos);
	}

}
