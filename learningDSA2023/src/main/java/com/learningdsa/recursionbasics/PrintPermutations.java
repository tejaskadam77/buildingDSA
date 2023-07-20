package com.learningdsa.recursionbasics;

import java.util.Scanner;

public class PrintPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printPermutations(s, "");

    }

    private static void printPermutations(String que, String ans) {
        if (que.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < que.length(); i++) {
            char ch = que.charAt(i);
            String lpart = que.substring(0, i);
            String rpart = que.substring(i + 1);
            String roq = lpart + rpart;
            printPermutations(roq, ch + ans);
        }

    }

}
