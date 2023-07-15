package com.learningdsa.recursionbasics;

public class StringCompression2 {
    public static void main(String[] args) {
        String s = "aaabbccddeefff";
        String cs = s.charAt(0) + "";
        int i = 1;
        int count = 1;
        while (i < s.length()) {
            char cur = s.charAt(i);
            char prev = s.charAt(i - 1);
            if (cur != prev) {
                if (count > 1) {
                    cs += count;

                }

                cs += cur;
                count = 1;

            } else {
                count++;
            }

            i++;
        }
        if (count > 1) {
            cs += count;
        }
        System.out.println(cs);
    }
}
