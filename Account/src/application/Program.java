package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account();
		BusinessAccount bacc = new BusinessAccount();
		SavingsAccount sacc = new SavingsAccount();
		
		System.out.println("Enter account data");
		System.out.print("Account number: ");
		int numberAccount = sc.nextInt();
		System.out.print("Account holder: ");
		sc.nextLine();
		String holderAccount = sc.nextLine();
		System.out.print("Enter a deposit initial value: ");
		double depositValue = sc.nextDouble();
		
		acc = new Account(numberAccount, holderAccount, depositValue);
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(acc);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		depositValue = sc.nextDouble();
		acc.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		acc.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		System.out.println("--------------------------------------");
		System.out.println("Enter Business account data");
		System.out.print("Account number: ");
		int numberBusinessAccount = sc.nextInt();
		System.out.print("Account holder: ");
		sc.nextLine();
		String holderBusinessAccountt = sc.nextLine();
		System.out.print("Enter a deposit initial value: ");
		double depositValueBusinessAccount = sc.nextDouble();
		System.out.print("Account loan limit value: ");
		double loanLimitValue = sc.nextDouble();
		
		bacc = new BusinessAccount(numberBusinessAccount, holderBusinessAccountt, depositValueBusinessAccount, loanLimitValue);
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bacc);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		depositValueBusinessAccount = sc.nextDouble();
		bacc.deposit(depositValueBusinessAccount);
		System.out.println("Updated account data: ");
		System.out.println(bacc);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValueBusinessAccount = sc.nextDouble();
		bacc.withdraw(withdrawValueBusinessAccount);
		System.out.println("Updated account data: ");
		System.out.println(bacc);
		
		System.out.print("Enter a loan value: ");
		double loanValue = sc.nextDouble();
		bacc.loan(loanValue);
		System.out.println("Updated account data: ");
		System.out.println(bacc);
		
		System.out.println("--------------------------------------");
		System.out.println("Enter Savings account data");
		System.out.print("Account number: ");
		int numberSavingsAccount = sc.nextInt();
		System.out.print("Account holder: ");
		sc.nextLine();
		String holderSavingsAccountt = sc.nextLine();
		System.out.print("Enter a deposit initial value: ");
		double depositValueSavingsAccount = sc.nextDouble();
		System.out.print("Enter a interest rate value: ");
		double interestRateSavingsAccount = sc.nextDouble();
		
		sacc = new SavingsAccount(numberSavingsAccount, holderSavingsAccountt, depositValueSavingsAccount, interestRateSavingsAccount);
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(sacc);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		depositValueSavingsAccount = sc.nextDouble();
		sacc.deposit(depositValueSavingsAccount);
		System.out.println("Updated account data: ");
		sacc.updateBalance();
		System.out.println(sacc);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValueSavingsAccount = sc.nextDouble();
		sacc.withdraw(withdrawValueSavingsAccount);
		System.out.println("Updated account data: ");
		System.out.println(sacc);
		
		sc.close();

	}

}
