package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String name, Double balance, Double loanLimit) {
		super(number, name, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Number: ");
		sb.append(super.getNumber() + "\n");
		sb.append("Holder: ");
		sb.append(super.getName() + "\n");
		sb.append("Loan limit: $");
		sb.append(loanLimit + "\n");
		sb.append("Balance: $");
		sb.append(balance + "\n");
		
		return sb.toString();
	}
}
