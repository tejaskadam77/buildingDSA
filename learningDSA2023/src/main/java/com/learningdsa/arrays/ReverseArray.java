package com.learningdsa.arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("enter length");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter numbers");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0, j = a.length - 1; i < n / 2; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

        }
        for (int var : a) {
            System.out.println(var);
        }
    }
}
