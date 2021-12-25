package entities;

public class Pf extends Contribuintes {
	 
private double gastosSaude;

public Pf(String name, Double rendaAnual, double gastosSaude) {
	super(name, rendaAnual);
	this.gastosSaude = gastosSaude;
}

public double getGastosSaude() {
	return gastosSaude;
}

public void setGastosSaude(double gastosSaude) {
	this.gastosSaude = gastosSaude;
}

@Override
public double taxPayment() {
	double tax =0;
	if(super.getRendaAnual() < 20000.00) {
		tax =(getRendaAnual() - (gastosSaude/2))* 0.15;
	}else {
		tax = (getRendaAnual() - (gastosSaude/2))* 0.25;
	}
	return tax;
}

//@Override
//public String toString() {
//	return " Name: " + getName() + " \n";
//				
//}

}
