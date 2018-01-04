package programa.janelas.circuito.extras;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import programa.Circuito;

public class CircuitoListModel extends AbstractListModel<String>{

	private ArrayList<Circuito> circuitos;

	public CircuitoListModel() {
		this.circuitos = new ArrayList<>();

	}

	@Override
	public int getSize() {

		return circuitos.size();
	}

	@Override
	public String getElementAt(int index) {

		Circuito circuito = circuitos.get(index);

		return circuito.getNome();

	}
	
    public void addCircuito(Circuito circuito){
        circuitos.add(circuito);

    }
    public void eliminarCircuito(int index){
        circuitos.remove(index);

    }

	public ArrayList<Circuito> getCircuito() {
		return circuitos;
	}
	
	public Circuito getCircuito (int id) {
		
		Circuito circuito = new Circuito();;
		
		for(int i = 0; i<circuitos.size();i++) {
		if(circuitos.get(i).getId() == id) {
			circuito = circuitos.get(i);
		}
		}
		return circuito;
	}

	public void setCircuitos(ArrayList<Circuito> circuitos) {
		this.circuitos = circuitos;
	}


}
