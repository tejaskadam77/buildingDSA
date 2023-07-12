package com.learningdsa.patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("*\t");
                }
                else if (i + j == n + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }

            }
            System.out.println();
        }

    }
}
