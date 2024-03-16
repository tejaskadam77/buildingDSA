package com.learningdsa.levelOne.recursionbasics.backtracking;

import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter target sum");
        int k = sc.nextInt();
        printTargetsumOfSubset(a, 0, "", 0, k);
    }

    public static void printTargetsumOfSubset(int[] a, int idx, String set, int sos, int targetSum) {
        if (idx == a.length) {
            if (sos == targetSum) {
                System.out.println(set);
            }
            return;
        }
        printTargetsumOfSubset(a, idx + 1, set + a[idx] + ",", sos + a[idx], targetSum);
        printTargetsumOfSubset(a, idx + 1, set, sos, targetSum);
    }
}
