package com.sunday.assignments;

import java.util.Scanner;

public class Recursion {

	public static int fact(int a) {
		int num = 1;
		for (int i = 1; i <= a; i++) {
			num = num * i;
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int result = fact(num);
		System.out.println(result);

	}

}
