package com.learningdsa.levelOne.arrays;

import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {

        System.out.println("enter length");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter numbers");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(spanOfArray(a));

    }

    public static int spanOfArray(int a[]) {
        int max = 0;
        int min = 0;
        max = min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        return max - min;
    }
}
