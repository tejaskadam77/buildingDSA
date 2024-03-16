package com.learningdsa.levelOne.arrays;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        System.out.println("enter length");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter numbers");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (int i = max; i >= 1; i--) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] >= i) {
                    System.out.print("\t*");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
