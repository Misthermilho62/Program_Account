package entities;

public class Account {

	private Integer number;
	private String name;
	protected Double balance;
	
	public Account() {
	}
	
	public Account(Integer number, String name, Double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Number: ");
		sb.append(number + "\n");
		sb.append("Holder: ");
		sb.append(name + "\n");
		sb.append("Balance: $");
		sb.append(balance + "\n");
		
		return sb.toString();
	}
}
