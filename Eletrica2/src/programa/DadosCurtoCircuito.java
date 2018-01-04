package programa;

public class DadosCurtoCircuito {
	
	private long id;
	private double tempAdmissRegime;
	private double tempMaxCurto;
	private double tempoElimDef;
	private double correnteCurto;

	public DadosCurtoCircuito() {
	}

	public double getTempAdmissRegime() {
		return tempAdmissRegime;
	}

	public void setTempAdmissRegime(double tempAdmissRegime) {
		this.tempAdmissRegime = tempAdmissRegime;
	}

	public double getTempMaxCurto() {
		return tempMaxCurto;
	}

	public void setTempMaxCurto(double tempMaxCurto) {
		this.tempMaxCurto = tempMaxCurto;
	}

	public double getTempoElimDef() {
		return tempoElimDef;
	}

	public void setTempoElimDef(double tempoElimDef) {
		this.tempoElimDef = tempoElimDef;
	}

	public double getCorrenteCurto() {
		return correnteCurto;
	}

	public void setCorrenteCurto(double correnteCurto) {
		this.correnteCurto = correnteCurto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}