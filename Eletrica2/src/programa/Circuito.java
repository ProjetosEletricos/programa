package programa;
import java.util.ArrayList;

public class Circuito {

	private String nome;

	// --------------------------------------------
	private int id;
	private Condutor condutor;
	private DadosCurtoCircuito dadosCurtoCircuito;
	private ArrayList<Equipamento> equipamento;
	private double tensao;
	private int numFases;
	private boolean neutro;
	private String refInstal;
	private double bitolaQt;
	private double bitolaCCorr;
	private double bitolaCCirc;
	private double bitolaNeutro;
	private double bitolaTerra;
	private Quadro quadro;
	private Fonte alimGeral;
	private String[][] matriz2;
	private double correnteIB;
	private double correnteIBC;
	private String[][] saida;
	private boolean neutroEquilibrado = false;

	public Circuito() {
		equipamento = new ArrayList<Equipamento>();
		condutor = new Condutor();
		dadosCurtoCircuito = new DadosCurtoCircuito();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Condutor getCondutor() {
		return condutor;
	}

	public void setCondutor(Condutor condutor) {
		this.condutor = condutor;
	}

	public ArrayList<Equipamento> getEquipamento() {
		return equipamento;
	}

	public void addEquipamento(Equipamento equipamento) {
		this.equipamento.add(equipamento);
	}

	public void setEquipamentos(ArrayList<Equipamento> equipamentosLista) {
		this.equipamento = equipamentosLista;
	}
	
	@Override
	public String toString() {
		return nome;
	}

}
