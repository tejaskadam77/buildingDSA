package com.learningdsa.striver;

public class MaxDepth {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                depth++;
                maxDepth = Math.max(depth, maxDepth);
            } else if (ch == ')') {
                depth--;
            }
        }
        return maxDepth;

    }
}
