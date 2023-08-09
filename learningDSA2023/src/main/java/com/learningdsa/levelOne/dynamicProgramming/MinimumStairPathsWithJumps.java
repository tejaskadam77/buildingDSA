package com.learningdsa.levelOne.dynamicProgramming;

import java.util.Scanner;

public class MinimumStairPathsWithJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Integer[] dp = new Integer[n + 1];
        dp[n] = 0;
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
                if (arr[i] > 0 && i + j < dp.length) {
                    if (dp[i + j] != null) {
                        min = Math.min(min, dp[i + j]);
                    }
                }
                if (dp[i] != Integer.MAX_VALUE) {
                    dp[i] = min + 1;

                } else {
                    dp[i] = null;
                }
            }

        }
        System.out.println(dp[0]);
    }
}
