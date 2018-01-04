
package programa.janelas.projeto.extras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import auxiliar.Data;
import programa.Projeto;

public class ProjetoTableModel extends AbstractTableModel {

	private ArrayList<Projeto> projetos;
	private List<String> colunas;

	public ProjetoTableModel() {
		projetos = new ArrayList<>();

		colunas = Arrays.asList("Id", "Nome", "Data", "Autor");
	}

	@Override
	public String getColumnName(int column) {
		return colunas.get(column);
	}

	@Override
	public int getRowCount() {

		return projetos.size();
	}

	@Override
	public int getColumnCount() {
		return colunas.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Projeto projeto = null;

		projeto = projetos.get(rowIndex);

		switch (columnIndex) {
		case 0:
			return projeto.getId();
		case 1:
			return projeto.getNome();
		case 2:
			return Data.DataToString(projeto.getData());
		case 3:
			return projeto.getAutor();
		default:
			return "";
		}
	}


	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;// todas as celulas não serão editáveis
	}

	public void setProjeto(Projeto projeto) {
		this.projetos.add(projeto);
		fireTableDataChanged();
	}

	public void setProjetos(ArrayList<Projeto> projetos) {
		this.projetos = projetos;
		fireTableDataChanged();
	}

	public void Excluir(Projeto projeto) {
		this.projetos.remove(projeto);
		fireTableDataChanged();
	}

	public void Excluir(int pos) {
		this.projetos.remove(pos);
		fireTableDataChanged();
		fireTableRowsDeleted(0, getRowCount() - 1);
	}

	public Projeto getProjeto(int pos) {
		if (pos < 0 || pos >= projetos.size()) {
			return null;
		}
		return (Projeto) projetos.get(pos);
	}

}
