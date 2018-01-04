package programa;


public class Equipamento {

	private String nome;
	private String descricao;
	private String usabilidade;
	private double potencia;
	private String unidade;
	private int quantidade;
	private double fp;
	private double fs;
	private double fd;
	private double fSimu;
	private String ligacao;
	private double perdasReator;
	private double rendimento;
	private int nPolos;
	private double fu;
	//----------------------------------------------
	private int id;
	private int numFases;
	private double potenciaInstalAtiva;
	private double potenciaInstalAparente;
	private boolean neutro;
	private String[][] matriz;
	private double correnteCarga;
	private double potDemAtiva;
	private double potDemAparente;
	private String[][] saida;
	private Fonte alimGeral;
	private double tensao;
	private boolean neutroDesequilibrado;

	
	public Equipamento() {
		
	}
	
	public Equipamento(String nome, String descricao, String usabilidade, double potencia, String unidade,
			int quantidade, double fp, double fs, double fd, double fSimu, String ligacao, double perdasReator,
			double rendimento, int nPolos, double fu) {

		this.nome = nome;
		this.descricao = descricao;
		this.usabilidade = usabilidade;
		this.potencia = potencia;
		this.unidade = unidade;
		this.quantidade = quantidade;
		this.fp = fp;
		this.fs = fs;
		this.fd = fd;
		this.fSimu = fSimu;
		this.ligacao = ligacao;
		this.perdasReator = perdasReator;
		this.rendimento = rendimento;
		this.nPolos = nPolos;
		this.fu = fu;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getFp() {
		return fp;
	}

	public void setFp(double fp) {
		this.fp = fp;
	}

	public double getFs() {
		return fs;
	}

	public void setFs(double fs) {
		this.fs = fs;
	}

	public double getFd() {
		return fd;
	}

	public void setFd(double fd) {
		this.fd = fd;
	}

	public String getLigacao() {
		return ligacao;
	}

	public void setLigacao(String ligacao) {
		this.ligacao = ligacao;
	}

	public double getPerdasReator() {
		return perdasReator;
	}

	public void setPerdasReator(double perdasReator) {
		this.perdasReator = perdasReator;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}

	public int getnPolos() {
		return nPolos;
	}

	public void setnPolos(int nPolos) {
		this.nPolos = nPolos;
	}

	public double getFu() {
		return fu;
	}

	public void setFu(double fu) {
		this.fu = fu;
	}

	public void setfSimu(double fSimu) {
		this.fSimu = fSimu;
	}

	public String getUsabilidade() {
		return usabilidade;
	}

	public void setUsabilidade(String usabilidade) {
		this.usabilidade = usabilidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPotenciaInstalAparente() {
		return potenciaInstalAparente;
	}

	public double getPotDemAparente() {
		return potDemAparente;
	}

	public double getfSimu() {
		return fSimu;
	}




}
