package com.learningdsa.arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        System.out.println("enter length");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter numbers");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter no of rotations ");
        int k = sc.nextInt();
        for (int j=0;j<k;j++)
        {
            rotateby1(a);
        }


    }

    public static void rotateby1(int a[]) {
        int temp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = temp;
    }
}
