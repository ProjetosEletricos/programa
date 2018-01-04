package programa;

import java.util.ArrayList;

import excel.Ler;


public class Quadro {

	private int id;
	private String nome;
	private String local;
	private String drGeral;
	private double pot100PercDem;
	private double fd;
	private double fp;
	private String usabilidade;
	// -----------------------------------------------
	
	private Condutor condutor;
	private DadosCurtoCircuito dadosCurtoCircuito;
	private ArrayList<Circuito> circuito;
	private ArrayList<Quadro> quadro;
	private String sistema;
	private int numFases;
	private String[][] matrizQuadro;
	private double potDemAtiva;
	private double potDemAparente;
	private double correnteAtiva;// Corrente ativa
	private double correnteReativa;// Corrente reativa
	private double correnteAparente;// Corrente aparente
	private double bitolaCCorr;
	private double bitolaCCirc;
	private double bitolaQt;
	private double bitolaNeutro;
	private double bitolaTerra;
	private double tensao;
	private boolean neutro;
	private boolean terra;

	private ArrayList<String> nomeCir;
	private Fonte alimGeral;
	private String[][] saida;
	private String[][] saidaCircuitos;
	private double correnteIB;
	private double correnteIBC;
	private boolean neutroEquilibrado = false;



	public Quadro(String nome, String local, String drGeral, double pot100PercDem, double fd, double fp,
			String usabilidade) {
		this.nome = nome;
		this.local = local;
		this.drGeral = drGeral;
		this.pot100PercDem = pot100PercDem;
		this.fd = fd;
		this.fp = fp;
		this.usabilidade = usabilidade;
		
		circuito = new ArrayList<Circuito>();
		quadro = new ArrayList<Quadro>();
	}

	

	public Quadro() {
		// TODO Auto-generated constructor stub
	}



	public void RemoverCarga(String quadro) {

		this.setQuadro(new ArrayList<Quadro>());
		this.matrizQuadro = new Ler(("Quadros/" + nome + ".csv")).lerTabela();
		this.ordenaPorLinhaDecr(this.matrizQuadro, 14);
		this.lerDadosQuadro();
	}

	public ArrayList<Circuito> getCircuito() {
		return circuito;
	}

	public void addCircuito(Circuito circuito) {
		this.circuito.add(circuito);
	}

	public ArrayList<Quadro> getQuadro() {
		return quadro;
	}



	public void addQuadro(Quadro quadro) {
		this.quadro.add(quadro);
	}



	public double getPotDemAparente() {
		return potDemAparente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public String getDrGeral() {
		return drGeral;
	}

	public void setDrGeral(String drGeral) {
		this.drGeral = drGeral;
	}

	public double getPot100PercDem() {
		return pot100PercDem;
	}

	public void setPot100PercDem(double pot100PercDem) {
		this.pot100PercDem = pot100PercDem;
	}

	public double getFd() {
		return fd;
	}

	public void setFd(double fd) {
		this.fd = fd;
	}

	public String getUsabilidade() {
		return usabilidade;
	}

	public void setUsabilidade(String usabilidade) {
		this.usabilidade = usabilidade;
	}

	public Condutor getAlimentador() {
		return condutor;
	}

	public void setAlimentador(Condutor condutor) {
		this.condutor = condutor;
	}

	public double getFp() {
		return fp;
	}

	public void setFp(double fp) {
		this.fp = fp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DadosCurtoCircuito getDadosCurtoCircuito() {
		return dadosCurtoCircuito;
	}

	public void setDadosCurtoCircuito(DadosCurtoCircuito dadosCurtoCircuito) {
		this.dadosCurtoCircuito = dadosCurtoCircuito;
	}

	public void potDemAparente() {

		double potDemApaQuadro = 0;

		for (int i = 0; i < this.circuito.size(); i++) {
			for (int j = 0; j < this.circuito.get(i).getCarga().size(); j++) {

				potDemApaQuadro += this.circuito.get(i).getCarga().get(j).getPotDemAparente()
						* this.circuito.get(i).getCarga().get(j).getfSimu();
			}

		}

		this.potDemAparente = potDemApaQuadro;
	}





}
