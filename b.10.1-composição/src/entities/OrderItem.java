package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

	private int quantity;
	private double price;
	private List<Order> items = new ArrayList<>();

	public OrderItem(int quantity, double price, List<Order> items) {

		this.quantity = quantity;
		this.price = price;
		this.items = items;
	}

	public OrderItem() {

	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}
	public List<Order> getItems() {
		return items;
	}

	/*
	 * public void setPrice(double price) { this.price = price; }
	 */

	public double subTotal() {
		return quantity * price;
	}
}
