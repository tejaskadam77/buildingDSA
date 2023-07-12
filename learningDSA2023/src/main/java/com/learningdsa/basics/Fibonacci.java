package com.learningdsa.basics;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int n1 = 0;
		int n2 = 1;
		for (int i = 0; i < n; i++) {
			System.out.println(n1);
			int res = n1 + n2;
			n1 = n2;
			n2 = res;

		}
	}

}
