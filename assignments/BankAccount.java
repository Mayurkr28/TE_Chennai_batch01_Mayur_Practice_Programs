package com.sunday.assignments;

public class BankAccount {

	private Long balance;
	
	public BankAccount() {
		this.balance = 30000l;
	}
	
	public Long getBalance() {
		return this.balance;
	}
	
	public void withDraw(long withDrawAmount) {
		if (withDrawAmount <= balance) {
			this.balance -= withDrawAmount;
			System.out.println("After Successfull Withdraw ");
			System.out.println("Current Balance : " 
				+ getBalance());
		} else {
			System.out.println("Insufficient Amount");
		}
	}

	public void deposite(long depositeAmount) {
		if (depositeAmount >= 100) {
			this.balance += depositeAmount;
			System.out.println("After Successfull Deposit ");
			System.out.println("Current Balance : " + getBalance());
		} else {
			System.out.println("Sorry Amount Should be more than 100 -_-");
		}
	}
}

