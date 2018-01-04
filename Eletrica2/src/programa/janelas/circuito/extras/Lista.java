package programa.janelas.circuito.extras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import programa.Circuito;
import programa.janelas.circuito.CircuitoFrm;
import programa.servico.CircuitoService;

public class Lista {

	//private CircuitoListModel listModel;
	private List<Circuito> circuitos;

	public Lista() {
		this.circuitos = new ArrayList<>();
		//this.listModel = (CircuitoListModel)frm.getListCircuitos().getModel();
	
	}

	public void filtra(HashMap<Object, Object> filtro) {
		CircuitoService service = new CircuitoService();
		this.circuitos = service.getCircuitos(filtro);
		//this.listModel.setCircuitos(circuitos);

	}

	public List<Circuito> getCircuitos() {
		return circuitos;
	}

	public void setCircuitos(List<Circuito> circuitos) {
		this.circuitos = circuitos;
	}
	
/*	public int getSelectId() {
		
		int id = 0;
		HashMap<Object, Object> filtro = new HashMap<>();
		filtro.put("Nome", frm.getListCircuitos().getSelectedValue());
		this.filtra(filtro);
		id = circuitos.get(0).getId();
		
		return id;
	}
	
	public Circuito getSelectCircuito() {
		return circuitos.get(arg0)
		Circuito circuito = new Circuito();
		circuito = this.listModel.getCircuito(getSelectId());
		
		return circuito;
	}
*/
}