package com.learningdsa.levelOne.recursionbasics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getFactorial(n));

    }

    public static int getFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * getFactorial(n - 1);
    }
}

