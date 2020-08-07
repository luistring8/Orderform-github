package Entidades;

public class Produto {

	private String titulo;
	private Double preco;

	public Produto() {
	}

	public Produto(String titulo, Double preco) {
		this.titulo = titulo;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
