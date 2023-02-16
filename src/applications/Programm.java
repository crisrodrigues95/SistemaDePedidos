package applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.Enuns.OrderStatus;



public class Programm {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		SimpleDateFormat sdb = new SimpleDateFormat("dd/MM/yyy");
		
		Date dataAtual = new Date();
		System.out.println("Entre com os dados do cliente:");
		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.next();
		System.out.println("Data de nascimento DD/MM/YYY(): ");
		Date dataNas = sdb.parse(sc.next());
		
		Client clients = new Client(name, email, dataNas);
		
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.println("Status: ");
		sc.nextLine();
		String status = sc.nextLine();
		
		
		
		Order order = new Order(dataAtual, OrderStatus.valueOf(status), clients);
		

		System.out.println("Quantos itens para esse pedido?:  ");
		int qitens = sc.nextInt();
		
		for (int i=1; i<=qitens; i++) {
			System.out.println("Entre com os dados do item  " + i);
			System.out.println("Nome do produto");
			String nomeProduto = sc.next();
			System.out.println("Preço do produto");
			double precoProduto = sc.nextDouble();
			System.out.println("Quantidade do produto");
			int quantidadeProduto = sc.nextInt();
			
			Product products = new Product(nomeProduto, precoProduto);
			
			OrderItem itens = new OrderItem(quantidadeProduto, precoProduto, products);
			order.additem(itens);
			
			
			
			
		}
		
		System.out.println();
		System.out.println(order);
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		sc.close();

	}

}
