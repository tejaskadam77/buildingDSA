package com.learningdsa.recursionbasics;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aaabbccddeefff";
        String cs = s.charAt(0) + "";
        int i = 1;
        while (i < s.length()) {
            char cur = s.charAt(i);
            char prev = s.charAt(i - 1);
            if (cur != prev) {
                cs += cur;

            }

            i++;
        }
        System.out.println(cs);
    }
}
