package programa;

public class Condutor {
	
	private int id;
	private double distAlimentador;
	private String modoInstalAlimentador;
	private String matAlimentador;
	private double quedaTensao;
	private String isolAlimentador;
	private String bitolasSucessivas;
	private int nCirAgrupados;
	private int nCamadas;
	private String enterrado;
	private String espacamentoCabos;
	private String multipolar;
	private String formaAgrupamento;
	private double resistividadeTermica;
	private double tempAmbiente;



	public Condutor(double distAlimentador, String modoInstalAlimentador, String matAlimentador,
			double quedaTensao, String isolAlimentador, String bitolasSucessivas, int nCirAgrupados, int nCamadas,
			String enterrado, String espacamentoCabos, String multipolar, String formaAgrupamento,
			double resistividadeTermica, double tempAmbiente) {

		this.distAlimentador = distAlimentador;
		this.modoInstalAlimentador = modoInstalAlimentador;
		this.matAlimentador = matAlimentador;
		this.quedaTensao = quedaTensao;
		this.isolAlimentador = isolAlimentador;
		this.bitolasSucessivas = bitolasSucessivas;
		this.nCirAgrupados = nCirAgrupados;
		this.nCamadas = nCamadas;
		this.enterrado = enterrado;
		this.espacamentoCabos = espacamentoCabos;
		this.multipolar = multipolar;
		this.formaAgrupamento = formaAgrupamento;
		this.resistividadeTermica = resistividadeTermica;
		this.tempAmbiente = tempAmbiente;
	}
	
	public Condutor () {
		
	}


	public double getDistAlimentador() {
		return distAlimentador;
	}

	public void setDistAlimentador(double distAlimentador) {
		this.distAlimentador = distAlimentador;
	}

	public String getModoInstalAlimentador() {
		return modoInstalAlimentador;
	}

	public void setModoInstalAlimentador(String modoInstalAlimentador) {
		this.modoInstalAlimentador = modoInstalAlimentador;
	}

	public String getMatAlimentador() {
		return matAlimentador;
	}

	public void setMatAlimentador(String matAlimentador) {
		this.matAlimentador = matAlimentador;
	}

	public double getQuedaTensao() {
		return quedaTensao;
	}

	public void setQuedaTensao(double quedaTensao) {
		this.quedaTensao = quedaTensao;
	}

	public String getIsolAlimentador() {
		return isolAlimentador;
	}

	public void setIsolAlimentador(String isolAlimentador) {
		this.isolAlimentador = isolAlimentador;
	}

	public String getBitolasSucessivas() {
		return bitolasSucessivas;
	}

	public void setBitolasSucessivas(String bitolasSucessivas) {
		this.bitolasSucessivas = bitolasSucessivas;
	}

	public int getnCirAgrupados() {
		return nCirAgrupados;
	}

	public void setnCirAgrupados(int nCirAgrupados) {
		this.nCirAgrupados = nCirAgrupados;
	}

	public int getnCamadas() {
		return nCamadas;
	}

	public void setnCamadas(int nCamadas) {
		this.nCamadas = nCamadas;
	}

	public String getEnterrado() {
		return enterrado;
	}

	public void setEnterrado(String enterrado) {
		this.enterrado = enterrado;
	}

	public String getEspacamentoCabos() {
		return espacamentoCabos;
	}

	public void setEspacamentoCabos(String espacamentoCabos) {
		this.espacamentoCabos = espacamentoCabos;
	}

	public String getMultipolar() {
		return multipolar;
	}

	public void setMultipolar(String multipolar) {
		this.multipolar = multipolar;
	}

	public String getFormaAgrupamento() {
		return formaAgrupamento;
	}

	public void setFormaAgrupamento(String formaAgrupamento) {
		this.formaAgrupamento = formaAgrupamento;
	}

	public double getResistividadeTermica() {
		return resistividadeTermica;
	}

	public void setResistividadeTermica(double resistividadeTermica) {
		this.resistividadeTermica = resistividadeTermica;
	}

	public double getTempAmbiente() {
		return tempAmbiente;
	}

	public void setTempAmbiente(double tempAmbiente) {
		this.tempAmbiente = tempAmbiente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}