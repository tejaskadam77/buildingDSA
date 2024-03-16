package com.learningdsa.levelOne.dynamicProgramming;

import java.util.Scanner;

public class GoldMine {
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

        for (int j = c - 1; j >= 0; j--) {
            for (int i = 0; i < r; i++) {
                if (j == c - 1) {
                    dp[i][j] = a[i][j];
                } else if (i == 0) {
                    dp[i][j] = Math.max(a[i][j + 1], a[i + 1][j + 1]) + a[i][j];
                } else if (i == r - 1) {
                    dp[i][j] = Math.max(a[i][j + 1], a[i - 1][j + 1]) + a[i][j];
                } else {
                    dp[i][j] = Math.max(Math.max(a[i][j + 1], a[i - 1][j + 1]), a[i + 1][j + 1]) + a[i][j];
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}
