package programa;

import java.util.Calendar;

public class Projeto {

	private int id;
	private String nome;
	private Calendar data;
	private String autor;
	private String descricao;

	public Projeto(String nome, Calendar data, String autor, String descricao) {

		this.nome = nome;
		this.data = data;
		this.autor = autor;
		this.descricao = descricao;
	}

	public Projeto() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
