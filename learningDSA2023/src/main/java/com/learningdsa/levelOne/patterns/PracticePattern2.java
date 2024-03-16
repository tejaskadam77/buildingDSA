package com.learningdsa.levelOne.patterns;

import java.util.Scanner;

public class PracticePattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int os = n / 2;
        int st = 1;
        int val = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= os; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                if (i == (n / 2) + 1) {
                    System.out.print("*\t");
                } else if (j <= st / 2) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }

            }
            if (i <= n / 2) {
                os--;
                st = st + 2;
            } else {
                os++;
                st = st - 2;
            }
            System.out.println();

        }
    }
}
