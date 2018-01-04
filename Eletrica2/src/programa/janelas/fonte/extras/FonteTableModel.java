
package programa.janelas.fonte.extras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import programa.Fonte;

public class FonteTableModel extends AbstractTableModel {

	private ArrayList<Fonte> fontes;
	private List<String> colunas;

	public FonteTableModel() {
		fontes = new ArrayList<>();

		colunas = Arrays.asList("Id", "Tensão F-N", "Concessionária");
	}

	@Override
	public String getColumnName(int column) {
		return colunas.get(column);
	}

	@Override
	public int getRowCount() {

		return fontes.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		Fonte fonte = fontes.get(rowIndex);

		switch (columnIndex) {
		case 0:
			return fonte.getId();
		case 1:
			return fonte.getTensaoFN();
		case 2:
			return fonte.getConcessionaria();
		default:
			return "";
		}
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Fonte fonte = fontes.get(rowIndex);// pega o contato da linha
		switch (columnIndex) {
		case 0:
			fonte.setId((int) aValue);
			break;
		case 1:
			fonte.setTensaoFN((double) aValue);
			break;
		case 2:
			fonte.setConcessionaria(aValue.toString());
			break;
		}
		fireTableRowsDeleted(0, getRowCount() - 1);
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;// todas as celulas vão ser editáveis
	}

	public void setFonte(Fonte fonte) {
		this.fontes.add(fonte);
		fireTableDataChanged();
	}

	public void setFontes(ArrayList<Fonte> fontes) {
		this.fontes = fontes;
		fireTableDataChanged();
	}

	public void Excluir(Fonte fonte) {
		this.fontes.remove(fonte);
		fireTableDataChanged();
	}

	public void Excluir(int pos) {
		this.fontes.remove(pos);
		fireTableDataChanged();
		fireTableRowsDeleted(0, getRowCount() - 1);
	}

	public Fonte getFonte(int pos) {
		if (pos < 0 || pos >= fontes.size()) {
			return null;
		}
		return (Fonte) fontes.get(pos);
	}

}
