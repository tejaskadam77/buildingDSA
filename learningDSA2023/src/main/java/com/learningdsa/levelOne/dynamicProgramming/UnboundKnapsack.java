package com.learningdsa.levelOne.dynamicProgramming;

import java.util.Scanner;

public class UnboundKnapsack {
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
        int[] dp = new int[capacity + 1];
        dp[0] = 0;
        for (int bagc = 1; bagc <= capacity; bagc++) {
            int max = 0;
            for (int i = 0; i < n; i++) {
                if (weights[i] >= bagc) {
                    int rbagc = bagc - weights[i];
                    int rembv = dp[rbagc];
                    int totalbagv = rembv + values[i];
                    if (totalbagv > max) {
                        max = totalbagv;
                    }
                }
            }
            dp[bagc] = max;
        }
    }
}
