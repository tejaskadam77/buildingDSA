package com.learningdsa.recursionbasics;

import java.util.Scanner;

public class PrintKPC {
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printKPC(s, "");

    }

    private static void printKPC(String que, String ans) {
        if (que.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = que.charAt(0);
        String roq = que.substring(1);
        String codeForch=codes[ch-'0'];
        for(int i=0;i<codeForch.length();i++)
        {
            printKPC(que,ans+codeForch.charAt(i));
        }

    }
}
