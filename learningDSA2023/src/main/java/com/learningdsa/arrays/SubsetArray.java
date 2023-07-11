package com.learningdsa.arrays;

import java.util.Scanner;

public class SubsetArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array and elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int totalSubsets = (int) Math.pow(2, a.length);
        for (int i = 0; i < totalSubsets; i++) {
            String set = "";
            int bn = i;

            for (int j = a.length - 1; j >= 0; j--) {
                int r = bn % 2;
                bn = bn / 2;
                if (r == 0) {
                    set = '_' + set;
                } else {
                    set = a[j] + set;
                }

            }
            System.out.println(set);
        }
    }
}
