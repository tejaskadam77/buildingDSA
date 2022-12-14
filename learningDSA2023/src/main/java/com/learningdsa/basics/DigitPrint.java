package com.learningdsa.basics;

import java.util.Scanner;

public class DigitPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digitCount=digintCount(n);
		int div=(int)Math.pow(10, digitCount-1);
		while(div!=0)
		{
			int q=n/div;
			System.out.println(q);
			int rem = n%div;
			div=div/10;
			n=rem;
		}
	}

	public static int digintCount(int n) {
		int count = 0;
		while (n!= 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

}
