package com.learningdsa.basics;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();

		for (int i = low; i <= high; i++) {
			boolean isPrime = isPrime(i);
			System.out.println(isPrime);
		}
	}

	private static boolean isPrime(int n) {

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		// TODO Auto-generated method stub
		return true;
	}
}
