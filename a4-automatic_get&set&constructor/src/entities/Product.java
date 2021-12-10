package entities;

/* COMO GERAR AUTOMATICAMENTE OS CONSTRUTORES, OS GET E SET? BOTÃO DIREITO-> SOURCE -> GENERATE...*/

public class Product {
	private String name;
	private double price;
	private int quantity;
	/*
	 * ENCAPSULAMENTO DE INSTÂNCIAS, ELA NÃO PODERÁ SER CHAMADA DE OUTRA CLASSE,
	 * PORÉM HÁ UMA FORMA, PRECISARÁ SER CRIADO UM MÉTODO COM AS REFERIDAS
	 * MODIFICAÇÕES, A EXEMPOS DOS getName e setName
	 */

	public Product() {
	}
	/*
	 * A SOBRECARCA DE CONSTRUTORES E DE CLASSES É FEITA PARA DAR UMA MAIOR
	 * VARIEDADES DE TIPOS DE VARIÁVEIS E PARÂMETROS PARA A CLASSE QUE SE DESTINA A
	 * INFORMAÇÃO
	 */

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