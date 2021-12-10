package appMy;

public class Emprego {
	private int id;
	private String name;
	private Double salary;
	public Emprego(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Emprego() {
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void increaseSalary(Double increase) {
		salary = salary * (increase/100+1);
	}
	
	public String toString() {
		return "Name "
				+ name
				+ ", id: "
				+ id
				+ ", Salary: $ "
				+ String.format("%.2f", salary);
	}

}
