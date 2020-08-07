package App;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Cliente;
import Entidades.ItemdePedido;
import Entidades.Pedido;
import Entidades.Produto;
import Status.enums.OrdemStatus;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Insira os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("e-mail: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento: ");
		Date dataDeNascimento = sdf.parse(sc.next());

		Cliente cliente = new Cliente(nome, email, dataDeNascimento);

		System.out.println("Insira os dados do pedido: ");
		System.out.println("Situação: ");
		OrdemStatus situacao = OrdemStatus.valueOf(sc.next());

		Pedido pedido = new Pedido(sdf, new Date(), situacao, cliente);

		System.out.println("Quantos itens terá o pedido: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Item #" + i);
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço: ");
			double precoProduto = sc.nextDouble();

			Produto produto = new Produto(nomeProduto, precoProduto);

			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();

			ItemdePedido itemDePedido = new ItemdePedido(quantidade, precoProduto, produto);

			pedido.addItemPedido(itemDePedido);

		}

		System.out.println();
		System.out.println("Resumo do pedido: ");
		System.out.println(pedido);

		sc.close();

	}

}
