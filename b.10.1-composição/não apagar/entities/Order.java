package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus Status;

	private Client client;
	private List<Product> products = new ArrayList<>();

	public Order(Date moment, OrderStatus status, Client client) {

		this.moment = moment;
		Status = status;
		this.client = client;
		
	}

	public Order() {

	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return Status;
	}

	public void setStatus(OrderStatus status) {
		Status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void addItem(Product item) {
		System.out.println("passou");
		products.add(item);
	}

	public void removeItem(Product item) {
		products.remove(item);
	}

	public double total() {
		double sum = 0;

		for (Product c : products) {
			//sum += c;

		}
		return sum;

	}

	@Override
	public String toString() {
		return "Order [moment=" + moment + ", Status=" + Status + ", client=" + client + ", products=" + products. + "]";
	}
}
