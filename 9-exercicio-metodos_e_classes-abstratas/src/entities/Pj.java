package entities;

public class Pj extends Contribuintes {
	
private int nFuncionarios;

public Pj(String name, Double rendaAnual, int nFuncionarios) {
	super(name, rendaAnual);
	this.nFuncionarios = nFuncionarios;
}

public int getnFuncionarios() {
	return nFuncionarios;
}

public void setnFuncionarios(int nFuncionarios) {
	this.nFuncionarios = nFuncionarios;
}


@Override
public double taxPayment() {
	double tax =0;
	if(nFuncionarios < 10) {
		tax = getRendaAnual() * 0.16;
	}else {
		tax = getRendaAnual() * 0.14;
	}
	return tax;
}

//@Override
//public String toString() {
//	return " Name: " + getName() + " \n";
//			
//}


}
