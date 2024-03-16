package com.learningdsa.levelOne.recursionbasics;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> res = getMazePaths(1, 1, n, m);
        System.out.println(res);
    }

    private static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if (sr == dr & sc == dc) {
            ArrayList<String> ip = new ArrayList<>();
            ip.add("");
            return ip;
        }

        ArrayList<String> hpaths = new ArrayList<>();

        ArrayList<String> vpaths = new ArrayList<>();
        if (sc < dc) {
            hpaths = getMazePaths(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            vpaths = getMazePaths(sr + 1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();


        for (String hpath : hpaths) {
            paths.add("h" + hpath);
        }
        for (String vpath : vpaths) {
            paths.add("v" + vpath);
        }
        return paths;
    }

}
