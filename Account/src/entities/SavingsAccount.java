package entities;

public class SavingsAccount extends Account {

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String name, Double balance, Double interestRate) {
		super(number, name, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Number: ");
		sb.append(super.getNumber() + "\n");
		sb.append("Holder: ");
		sb.append(super.getName() + "\n");
		sb.append("interest Rate: $");
		sb.append(interestRate + "\n");
		sb.append("Balance: $");
		sb.append(balance + "\n");
		
		return sb.toString();
	}
}
