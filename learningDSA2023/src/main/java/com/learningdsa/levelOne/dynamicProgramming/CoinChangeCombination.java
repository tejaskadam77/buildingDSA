package com.learningdsa.levelOne.dynamicProgramming;

import java.util.Scanner;

public class CoinChangeCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int amt= sc.nextInt();
        int []dp=new int[amt+1];
        dp[0]=1;
        for(int i=0;i<a.length;i++)
        {
            for(int j=a[i];j<dp.length;j++)
            {
                dp[j]+=dp[j-a[i]];
            }
        }
    }
}
