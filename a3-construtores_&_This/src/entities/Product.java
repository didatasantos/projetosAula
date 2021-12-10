package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}
	public Product(String name, double price, int quantity) {
		this.name = name; 
		this.price = price;
		this.quantity = quantity;
		/* UM DOS USOS DO "THIS" � QUE ELE FAZ A MODIFICA��O DO OBJETO, DIFERENTE DO 
		 * PAR�METRO DO CONSTRUCTOR*/
		 
		}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}