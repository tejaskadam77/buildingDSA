package com.learningdsa.levelOne.dynamicProgramming;

import java.util.Scanner;

public class CountBinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oldcountZeros = 1;
        int oldcountOnes = 1;
        for (int i = 2; i < n + 1; i++) {
            int newCountZeroes = oldcountOnes;
            int newCountOnes = oldcountZeros + oldcountOnes;
            oldcountOnes = newCountOnes;
            oldcountZeros = oldcountZeros;
        }

        System.out.println(oldcountOnes + oldcountZeros);


    }
}
