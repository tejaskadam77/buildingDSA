package com.learningdsa.arrays;

import java.util.Scanner;

public class findElement {
    public static void main(String[] args) {
        System.out.println("enter length");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter numbers");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter no to find");
        int nf = sc.nextInt();

        System.out.println(findIndex(a, nf));
    }

    public static int findIndex(int a[], int nf) {
        int idx = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == nf) {
                idx = i;
                break;
            }
        }
        return idx;
    }
}
