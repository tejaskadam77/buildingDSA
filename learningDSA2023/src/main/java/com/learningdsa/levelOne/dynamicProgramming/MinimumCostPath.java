package com.learningdsa.levelOne.dynamicProgramming;

import java.util.Scanner;

public class MinimumCostPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int r = sc.nextInt();
        System.out.println("enter no of columns");
        int c = sc.nextInt();
        System.out.println("enter array elements");
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[r][c];
        for (int i = r - 1; i >= 0; i--) {
            for (int j = c - 1; c >= 0; c--) {
                if (i == r && j == c) {
                    dp[i][j] = a[i][j];
                } else if (i == r - 1) {
                    dp[i][j] = a[i][j] + dp[i][j + 1];
                } else if (r == c - 1) {
                    dp[i][j] = a[i][j] + dp[i + 1][j];
                } else {
                    Math.min(a[i][j] + dp[i + 1][j], a[i][j] + dp[i][j + 1]);
                }
            }
        }
    }
}
