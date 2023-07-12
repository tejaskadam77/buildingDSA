package com.learningdsa.basics;

import java.util.Scanner;

public class RotateNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int noOfRotations=sc.nextInt();
	
	int noOfDigits=countDigits(n);
	
	noOfRotations=noOfRotations%noOfDigits;
	if(noOfRotations<0)
	{
		noOfRotations=noOfRotations+noOfDigits;	
	}
	
	
	int div=(int)Math.pow(10,noOfRotations);
	int fp=n/div;
	int  sp=n%div;
	int rotatedNumber=sp*(int)Math.pow(10, noOfDigits-noOfRotations)+fp;
	
	System.out.println("og =  "+ n + "\nrotated no = "+ rotatedNumber);
}

public  static int countDigits(int n)
{
	
	int count = 0;
	while (n != 0) {
		n = n / 10;
		count++;
	}
	return count;
}
}
