package programa.Dao;

import java.util.HashMap;
import java.util.Map;

public class QueryHashMap {

	private HashMap<Object, Object> dicionario;

	public QueryHashMap(HashMap<Object, Object> dicionario) {

		this.dicionario = dicionario;

	}

	public String select(String tabela) {

		String query = "select * from " + tabela;

		if (!(this.dicionario.containsValue(null))) {
			query += " where ";

			for (Map.Entry<Object, Object> pares : dicionario.entrySet()) {
				query += pares.getKey() + " = " + pares.getValue() + ", ";

			}
			query = query.substring(0, query.length() - 2);
		}

		return query;
	}

}
