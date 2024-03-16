package com.learningdsa.levelOne.dynamicProgramming;

import java.util.Scanner;

public class CoinChangePermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCoins = sc.nextInt();
        int[] coins = new int[totalCoins];
        for (int i = 0; i < totalCoins; i++) {
            coins[i] = sc.nextInt();
        }
        int amt = sc.nextInt();
        int[] dp = new int[amt + 1];
        dp[0] = 1;
        for (int amount = 1; amount < dp.length; amount++) {
            for (int coin = 0; coin < coins.length; coin++) {
                if (coins[coin] <= amount) {
                    dp[amount] += dp[amount - coins[coin]];
                }
            }
        }
        System.out.println(dp[amt]);
    }
}
