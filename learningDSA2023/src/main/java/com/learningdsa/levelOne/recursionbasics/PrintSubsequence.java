package com.learningdsa.levelOne.recursionbasics;

import java.util.Scanner;

public class PrintSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSS(s, "");

    }

    private static void printSS(String que, String ans) {
        if (que.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = que.charAt(0);
        String roq = que.substring(1);

        printSS(roq, ans + "");
        printSS(roq, ans + ch);
    }
}
