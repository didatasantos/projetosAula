package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		System.out.print("- " + balance + " <-4 "  + " - ");
		return balance;

	}

	public void deposit(double amount) {
		System.out.println(amount + "1.1");
		System.out.println(balance + " <-5.1");
		balance += amount;
		System.out.println(amount);
		System.out.println(balance + " <-5");
	}
	
	
	public void withdraw(double amount) {
		System.out.print("- " + balance + " <- 6 "  + " - ");
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}