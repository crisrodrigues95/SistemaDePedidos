package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Enuns.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	private static SimpleDateFormat sdb = new SimpleDateFormat("dd/MM/yyy");
	
	private Date momment;
	private OrderStatus status;
	private Client clients;
	private List<OrderItem> orderItens = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date momment, OrderStatus status, Client clients) {
		this.momment = momment;
		this.status = status;
		this.clients = clients;}
		

	public Date getMomment() {
		return momment;
	}

	public void setMomment(Date momment) {
		this.momment = momment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClients() {
		return clients;
	}

	public void setClients(Client clients) {
		this.clients = clients;
	}

	
	
	public void additem(OrderItem itens) {
		orderItens.add(itens);
	}
	
	public void removeitem(OrderItem itens) {
		orderItens.remove(itens);
	}
	
	public Double total() {
		double valortotal =0;
		for (OrderItem o : orderItens) {
			 valortotal += o.subtotal();
		}
		
		return valortotal;
		
	}
	
	
	
	
	
	
	
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order Summary: \n");
		sb.append("Order moment: ");
		sb.append(sdf.format(momment)+ "\n");
		sb.append("Order status: ");
		sb.append(status);
		sb.append(" Client: ");
		sb.append(clients.getName() + " ");
		sb.append("("+ sdb.format(clients.getBithDate())+") - ");
		sb.append(clients.getEmail()+ "\n");
		sb.append("Order itens: \n" );
		for (OrderItem oi : orderItens) {
			sb.append(oi+ "\n");
			
		}
		sb.append("Valor total: $"+total());
		
		return sb.toString();
	}
	
	
	
	
	
	

}
