package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus Status;

	private Client client;
	private List<OrderItem> products = new ArrayList<>();

	public Order(Date moment, OrderStatus status, Client client, List<OrderItem> products) {

		this.moment = moment;
		Status = status;
		this.client = client;
		this.products = products;
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

	public List<OrderItem> getProducts() {
		return products;
	}

	public void addItem(OrderItem item) {
		products.add(item);
	}

	public void removeItem(OrderItem item) {
		products.remove(item);
	}

	public double total() {
		double sum = 0;

		for (OrderItem c : products) {
			sum += c.subTotal();

		}
		return sum;

	}
}
