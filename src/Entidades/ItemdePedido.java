package Entidades;

public class ItemdePedido {

	private Integer quantidade;
	private Double valor;

	public Produto produto;

	public ItemdePedido() {
	}

	public ItemdePedido(Integer quantidade, Double valor, Produto produto) {
		this.quantidade = quantidade;
		this.valor = valor;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double subTotal() {
		return valor * quantidade;
	}

	public String toString() {
		return produto.getTitulo() + ", $" + String.format("%.2f", valor) + ", Quantidade: " + quantidade
				+ ", Sub Total: $" + String.format("%.2f", subTotal());

	}

}
