package entitites;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
private Date manufactureDate;

public UsedProduct(String name, Double price, Date manufactureDate) {
	super(name, price);
	this.manufactureDate = manufactureDate;
}

public Date getManufactureDate() {
	return manufactureDate;
}

public void setManufactureDate(Date manufactureDate) {
	
	this.manufactureDate = manufactureDate;
}


@Override
public String priceTag(String information ) {
	return super.priceTag(information);
}

@Override
public String toString() {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	return "nome: "+   super.getName() + " \n"
			+   "pre�o total: " + String.format("%.2f", super.getPrice()) + " \n"
			+ "data de fabrica��o: " + sdf.format(manufactureDate)+ " \n"
			+ "____________________";
}
}
