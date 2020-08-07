package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Status.enums.OrdemStatus;

public class Pedido {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date data;
	private OrdemStatus situacao;

	private Cliente cliente;
	private List<ItemdePedido> itens = new ArrayList<>();

	public Pedido(SimpleDateFormat sdf, Date data, OrdemStatus situacao, Cliente cliente) {
		this.sdf = sdf;
		this.data = data;
		this.situacao = situacao;
		this.cliente = cliente;
	}

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public OrdemStatus getSituacao() {
		return situacao;
	}

	public void setSituacao(OrdemStatus situacao) {
		this.situacao = situacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemdePedido> getItens() {
		return itens;
	}

	public void addItemPedido(ItemdePedido item) {
		itens.add(item);
	}

	public void removeItemPedido(ItemdePedido item) {
		itens.remove(item);
	}

	public double total() {
		double soma = 0.0;
		for (ItemdePedido item : itens) {
			soma += item.subTotal();
		}
		return soma;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Data e hora da encomenda: ");
		sb.append(sdf.format(data) + "\n");
		sb.append("Status do pedido: ");
		sb.append(situacao + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens pedidos:\n");
		for (ItemdePedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: $");
		sb.append(String.format("%.2f", total()));

		return sb.toString();

	}

}
