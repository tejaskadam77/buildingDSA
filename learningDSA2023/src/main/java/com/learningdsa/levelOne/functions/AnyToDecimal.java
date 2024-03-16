package com.learningdsa.levelOne.functions;

import java.util.Scanner;

public class AnyToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int base = sc.nextInt();

    }

    public static int anyToDecimal(int number, int base) {
        int newNum = 0;
        int count = 0;
        int p = 1;
        while (number > 0) {
            int rem = number % 10;
            number = number / 10;
            newNum = newNum + rem * base * p;
            p = p * base;
        }
        return newNum;
    }
}

