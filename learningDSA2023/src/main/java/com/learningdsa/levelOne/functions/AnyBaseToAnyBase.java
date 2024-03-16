package com.learningdsa.levelOne.functions;

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        int dec=anyToDecimal(number,b1);
        System.out.println(dec);
      int con=decimalToAny(dec,b2);
       System.out.println(con);
    }
    public static int anyToDecimal(int number, int base) {
        int newNum = 0;
        int count = 0;
        int p = 1;
        while (number > 0) {
            int rem = number % 10;
            number = number / 10;
            newNum = newNum + rem * p;
            p = p * base;
        }
        return newNum;
    }
    public static int decimalToAny(int number, int base) {
        int newNum = 0;
        int count = 0;
        int p = 1;
        while (number > 0) {
            int rem = number % base;
            number = number / base;
            newNum = newNum + rem * p;
            p = p * 10;
        }
        return newNum;
    }
}
