package entities;

public class Product {
	private String name; /* ENCAPSULAMENTO DE INST�NCIAS, ELA N�O PODER� SER CHAMADA DE OUTRA CLASSE, POR�M H� UMA FORMA, PRECISAR� SER CRIADO UM
	M�TODO COM AS REFERIDAS MODIFICA��ES, A EXEMPOS DOS getName e setName*/
	private double price;
	private int quantity;

	public Product() {
	}
	/*
	 * A SOBRECARCA DE CONSTRUTORES E DE CLASSES � FEITA PARA DAR UMA MAIOR
	 * VARIEDADES DE TIPOS DE VARI�VEIS E PAR�METROS PARA A CLASSE QUE SE DESTINA A
	 * INFORMA��O
	 */

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		/*
		 * UM DOS USOS DO "THIS" � QUE ELE FAZ A MODIFICA��O DO OBJETO, DIFERENTE DO
		 * PAR�METRO DO CONSTRUCTOR
		 */
		}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
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