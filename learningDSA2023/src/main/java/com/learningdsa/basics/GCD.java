package com.learningdsa.basics;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2= sc.nextInt();
		int div;
		if(n1>n2)
			div=n2;
		else
			div=n1;
		{
			while(div>=2)
			{
				if(n2%div==0 && n1%div==0)
				{
					System.out.println(div);
					break;
				}
				div--;
			}
		}
		int on1=n1;int on2=n2;
			while(n1%n2!=0)
			{
				int rem =n1%n2;
				n1=n2;
				n2=rem;
			}
			int gcd=n2;
			System.out.println(gcd);
			int lcm= on1*on2/gcd;
			System.out.println(lcm);
			  
	
	}

}
