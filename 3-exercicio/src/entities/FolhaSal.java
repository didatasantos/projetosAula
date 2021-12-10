package entities;

public class FolhaSal {

	public String name;
	public double grossSalary;
	public double tax;
	public double aumento;

	public String nameOk() {
		return name;
	}

	public double netSalary() {
		return (grossSalary - tax);
	}

	public double increaseSalary() {
		return (grossSalary * (aumento / 100)) + netSalary();
	}

	public String toString() {
		
		
		if (aumento == 0) {return nameOk() + " " + String.format("%.2f", netSalary());
			
		
		}else {
			return nameOk() + " Novo Salário com aumento: "+ String.format("%.2f", increaseSalary()) ;
		}
	}
}
