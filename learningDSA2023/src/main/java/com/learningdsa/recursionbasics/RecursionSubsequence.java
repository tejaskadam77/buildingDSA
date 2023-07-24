package com.learningdsa.recursionbasics;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursionSubsequence {
    public static void main(String[] args) {
        //print subsequence of string
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input string");
        String s = sc.nextLine();
        ArrayList<String> res = gss(s);
        System.out.println(res);
    }

    private static ArrayList gss(String s) {
        if (s.length() == 0) {
            ArrayList a = new ArrayList();
            a.add("");
            return a;
        }
        char ch = s.charAt(0);
        ArrayList<String> isa = gss(s.substring(1));
        ArrayList<String> mres = new ArrayList();
        for (String str : isa) {
            mres.add(ch + str);
            mres.add("-" + str);
        }
        return mres;
    }
}




