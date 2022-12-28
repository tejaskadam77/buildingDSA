package com.learningdsa.functions;

import java.util.Scanner;

public class DecimalToAny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int newNum = decimalToAny(n, b);
        System.out.println(newNum);

    }

    public static int decimalToAny(int number, int base) {
        int newNum = 0;
        int count = 0;
        int p = 1;
        while (number > 0) {
            int rem = number % base;
            number = number / base;
            newNum = newNum + rem * (10 * p);
            p = p * 10;
        }
        return newNum;
    }

}
