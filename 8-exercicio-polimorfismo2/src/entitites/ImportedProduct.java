package entitites;

public class ImportedProduct extends Product {
	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}



	@Override
	public String priceTag(String information) {
		return super.priceTag(information);
	}
	
	public Double totalPrice() {
		return super.getPrice() * (customsFee+1);
	}

	@Override
	public String toString() {
		return "nome: "+  super.getName() + " \n"
				+ "preço total: " + totalPrice() + " \n"
				+ "Imposto de Importação: " + customsFee*super.getPrice()+ " \n"
				+ "____________________";
				
	}
}
