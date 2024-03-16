package com.learningdsa.levelOne.recursionbasics;

import java.util.Scanner;

public class PrintEncodings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str, "");
    }

    private static void printEncodings(String que, String ans) {
        if (que.length() == 0) {
            return;
        } else if (que.length() == 1) {
            char ch = que.charAt(0);
            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                ans = ans + code;
                System.out.println(ans);
                return;
            }

        } else {
            char ch = que.charAt(0);
            String ros = que.substring(1);
            if (ch == '0') {
                return;
            } else {
                int chv = ch - '0';
                char code = (char) ('a' + chv - 1);
                ans = ans + code;
                printEncodings(ros, ans);
            }
            String c12 = que.substring(0, 2);
            ros = que.substring(2);
            int chv = Integer.parseInt(c12);
            if (chv <= 26) {
                char code = (char) ('a' + chv - 1);
                ans = ans + code;
                printEncodings(ros, ans);
            }

        }
    }
}
