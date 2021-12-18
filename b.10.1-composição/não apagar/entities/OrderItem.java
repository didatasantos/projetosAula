package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

	private int quantity;
	private double price;
	//private List<Product> items = new ArrayList<>();

	public OrderItem(int quantity, double price) {

		this.quantity = quantity;
		this.price = price;

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

	public List<Product> getItems() {
		return items;
	}

	public void addItem(Product item) {
		items.add(item);
	
		;
	}

	public void removeItem(Product item) {
		items.remove(item);
	}

	/*
	 * public void setPrice(double price) { this.price = price; }
	 */

	public double subTotal() {
		return quantity * price;
	}

	public String toString() {
		return "OrderItem [quantity=" + quantity + ", price=" + price + ", items=" + items + " " + quantity * price
				+ " ]";
	}

}
