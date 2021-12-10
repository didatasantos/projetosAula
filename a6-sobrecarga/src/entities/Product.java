package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	public Product() {
	}
	/* A SOBRECARCA DE CONSTRUTORES E DE CLASSES É FEITA PARA DAR UMA MAIOR VARIEDADES DE TIPOS DE VARIÁVEIS E PARÂMETROS PARA A CLASSE QUE 
	 SE DESTINA A INFORMAÇÃO */

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		/*
		 * UM DOS USOS DO "THIS" É QUE ELE FAZ A MODIFICAÇÃO DO OBJETO, DIFERENTE DO
		 * PARÂMETRO DO CONSTRUCTOR
		 */

	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
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