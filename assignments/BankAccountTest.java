package com.sunday.assignments;

import java.util.Scanner;

public class BankAccountTest extends BankAccount {

	public static void main(String[] args) {

		System.out.println(" Welcome to HDFC Bank");
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter amount to be deposit : ");
		long depositamt = obj.nextLong();
		System.out.println("Enter amount to be withdrawn : ");
		long withdrawamt = obj.nextLong();
		obj.close();
		BankAccountTest ref = new BankAccountTest();

		System.out.println("Previous Balance : " + ref.getBalance());
		ref.deposite(depositamt);
		ref.withDraw(withdrawamt);
	}
}
