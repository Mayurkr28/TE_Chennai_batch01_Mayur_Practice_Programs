package com.sunday.assignments;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
			scan.close();
		}
		String str = !flag ? "Number is Prime" : "Number is not Prime";
		System.out.println(str);

}
}
