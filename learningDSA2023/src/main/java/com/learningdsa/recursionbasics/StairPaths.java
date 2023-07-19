package com.learningdsa.recursionbasics;

import java.util.ArrayList;
import java.util.Scanner;

public class StairPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input string");
        int n = sc.nextInt();
        ArrayList<String> res = gsp(n);
        System.out.println(res);
    }

    private static ArrayList<String> gsp(int n) {
        if (n == 0) {
            ArrayList<String> bs = new ArrayList<>();
            bs.add("");
            return bs;
        } else if (n < 0) {
            ArrayList<String> bs = new ArrayList<>();
            return bs;
        }
        ArrayList<String> paths1 = gsp(n - 1);
        ArrayList<String> paths2 = gsp(n - 2);
        ArrayList<String> paths3 = gsp(n - 3);
        ArrayList<String> paths = new ArrayList<>();
        for (String s : paths1) {
            paths.add("1" + s);
        }
        for (String s : paths2) {
            paths.add("2" + s);
        }
        for (String s : paths3) {
            paths.add("3" + s);
        }
        return paths;
    }
}
