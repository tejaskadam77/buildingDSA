package com.learningdsa.levelOne.recursionbasics;

import java.util.Scanner;

public class PrintStairPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStairPaths(n, "");

    }

    public static void printStairPaths(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        } else if (n < 0) {
            return;
        }
        printStairPaths(n - 1, ans + "1");
        printStairPaths(n - 2, ans + "2");
        printStairPaths(n - 3, ans + "3");
    }
}
