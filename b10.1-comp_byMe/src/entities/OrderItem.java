package entities;

public class OrderItem {

	private int quantity;
	private double price;
	private Product product;


	public OrderItem(int quantity, double price, Product product) {

		this.quantity = quantity;
		this.price = price;
		this.product = product;
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


	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	/*
	 * public void setPrice(double price) { this.price = price; }
	 */

	public double subTotal() {
		return quantity * price;
	}

	public String toString() {
	
		
		return product.getName() + " : "
		+ "Quantity:" + quantity + "\n"
		+ "Price: "+ price + "\n"
		+ "Subtotal :"+ price*quantity;
	}

}
