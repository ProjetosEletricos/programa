package programa;

import java.util.ArrayList;

public class Fonte {

	private int id;
	private ArrayList<Quadro> quadroGeral;
	private String concessionaria;
	private double tensaoFN;
	

	public Fonte() {

		quadroGeral = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Quadro> getQuadroGeral() {
		return quadroGeral;
	}

	public void setQuadroGeral(ArrayList<Quadro> quadroGeral) {
		this.quadroGeral = quadroGeral;
	}

	public String getConcessionaria() {
		return concessionaria;
	}

	public void setConcessionaria(String concessionaria) {
		this.concessionaria = concessionaria;
	}

	public double getTensaoFN() {
		return tensaoFN;
	}

	public void setTensaoFN(double tensaoFN) {
		this.tensaoFN = tensaoFN;
	}

	public void addQGeral(Quadro quadro) {

		this.quadroGeral.add(quadro);

	}
	

	public Double potInstalAparenteVA() {

		double potInstalTotal = 0;

		for (int i = 0; i < this.quadroGeral.size(); i++) {
			for (int y = 0; y < this.quadroGeral.get(i).getCircuito().size(); y++) {
				for (int g = 0; g < this.quadroGeral.get(i).getCircuito().get(y).getCarga().size(); g++) {

					potInstalTotal += this.quadroGeral.get(i).getCircuito().get(y).getCarga().get(g)
							.getPotenciaInstalAparente();

				}
			}

		}
		return potInstalTotal;
	}

	public Double potDemaquadrosVA() {

		double potDemaquadrosTotal = 0;

		for (int u = 0; u < this.quadroGeral.size(); u++) {

			potDemaquadrosTotal += this.quadroGeral.get(u).getPotDemAparente();
		}
		return potDemaquadrosTotal;
	}

	public Double fatorDemanda() {

		Double fator;

		fator = potDemaquadrosVA() / potInstalAparenteVA();
		return fator;
	}

}
