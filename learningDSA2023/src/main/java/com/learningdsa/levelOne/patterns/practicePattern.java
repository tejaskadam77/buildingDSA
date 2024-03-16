package com.learningdsa.levelOne.patterns;

import java.util.Scanner;

public class practicePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int os = n / 2;
        int st = 1;
        int val = 1;
        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= os; k++) {
                System.out.print("\t");
            }
            int dis = val;
            for (int k = 1; k <= st; k++) {
                System.out.print(dis + "\t");
                if (k <= st / 2) {
                    dis++;
                } else {
                    dis--;
                }
            }
            if (i <= n / 2) {
                os--;
                st = st + 2;
                val++;
            } else {
                os++;
                st = st - 2;
                val--;
            }
            System.out.println();
        }

    }
}
