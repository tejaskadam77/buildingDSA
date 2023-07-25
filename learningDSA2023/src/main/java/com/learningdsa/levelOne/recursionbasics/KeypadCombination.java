package com.learningdsa.levelOne.recursionbasics;

import java.util.ArrayList;
import java.util.Scanner;

public class KeypadCombination {
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        String s = sc.nextLine();
        ArrayList res = gkc(s);


    }

    public static ArrayList gkc(String s) {
        if (s.length() == 0) {
            ArrayList<String> al = new ArrayList<>();
            al.add("");
            return al;
        }
        char ch = s.charAt(0);
        ArrayList<String> rres = gkc(s.substring(1));
        String codeForch = codes[ch - '0'];
        ArrayList<String> mres = gkc(s.substring(1));
        for (int i = 0; i < codeForch.length(); i++) {
            char chcode = codeForch.charAt(i);
            for (String temp : rres) {
                mres.add(chcode + temp);
            }
        }
        return mres;
    }
}
