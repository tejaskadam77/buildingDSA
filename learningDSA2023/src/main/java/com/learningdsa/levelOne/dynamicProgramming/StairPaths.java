package com.learningdsa.levelOne.dynamicProgramming;

import java.util.Scanner;

public class StairPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println(countStairPaths(n, a));
        System.out.println(countStairPathsTabular(n));
    }

    private static int countStairPaths(int n, int[] ans) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        }
        if (ans[n - 1] != 0) {
            return ans[n - 1];
        }
        int n1Paths = countStairPaths(n - 1, ans);
        int n2Paths = countStairPaths(n - 2, ans);
        int n3Paths = countStairPaths(n - 3, ans);
        int cp = n1Paths + n2Paths + n3Paths;
        ans[n - 1] = cp;
        return cp;
    }

    private static int countStairPathsTabular(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else if (i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];
    }
}
