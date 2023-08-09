package com.learningdsa.levelOne.dynamicProgramming;

import java.util.Scanner;

public class ZeroOneKnapSack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }


        int capacity = sc.nextInt();
        int dp[][] = new int[n + 1][capacity + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (j >= weights[i - 1]) {
                    int remCap = j - weights[i - 1];
                    int currentProfit = values[i - 1] + dp[i - 1][remCap];
                    if (currentProfit > dp[i - 1][j]) {
                        dp[i][j] = currentProfit;
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
    }
}
