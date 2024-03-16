package com.learningdsa.levelOne.dynamicProgramming;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input");
        int n = sc.nextInt();
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibresult = fibonacci(n - 1) + fibonacci(n - 2);
        return fibresult;
    }

    public static int fibonacciMemorized(int n, int[] qa) {
        if (n == 0 || n == 1) {
            return n;
        } else if (qa[n] != 0) {
            return qa[n];
        }
        int fibresult = fibonacci(n - 1) + fibonacci(n - 2);
        qa[n] = fibresult;
        return fibresult;
    }
}
