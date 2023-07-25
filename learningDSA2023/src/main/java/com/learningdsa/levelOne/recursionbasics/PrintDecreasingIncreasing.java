package com.learningdsa.levelOne.recursionbasics;

import java.util.Scanner;

public class PrintDecreasingIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pDI(n);
    }

    public static void pDI(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        pDI(n - 1);
        System.out.println(n);
    }
}
