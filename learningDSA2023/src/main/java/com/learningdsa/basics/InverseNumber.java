package com.learningdsa.basics;

import java.util.Scanner;

public class InverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		

		int op = 1;
		int inv = 0;
		while (n != 0) {
			int od = n % 10;
			int ip = od;
			int id = op;
			inv=inv + op * (int) (Math.pow(10, od - 1));
			n=n/10;
			op++;
		}
		System.out.println(inv);
	}

	
}
