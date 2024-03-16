package com.learningdsa.levelOne.patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = n; j > 0 ; j--) {

                if (j <= i) {
                    System.out.print("*\t");

                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }

}
