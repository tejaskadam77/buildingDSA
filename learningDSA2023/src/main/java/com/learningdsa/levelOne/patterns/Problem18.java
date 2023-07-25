package com.learningdsa.levelOne.patterns;

import java.util.Scanner;

public class Problem18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int os = 0;
        int st = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= os; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= st; k++) {
                if(i>1&&i<=n/2 && k>1 && k<st)
                {
                    System.out.print("\t");
                }
                else
                System.out.print("*\t");
            }

            if (i <= n / 2) {
                os++;
                st = st - 2;
            } else {
                os--;
                st = st + 2;
            }

            System.out.println();
        }
    }
}
