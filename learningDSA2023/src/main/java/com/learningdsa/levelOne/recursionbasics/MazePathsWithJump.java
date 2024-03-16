package com.learningdsa.levelOne.recursionbasics;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathsWithJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> res = getMazePathsWithJump(1, 1, n, m);
        System.out.println(res);
    }

    private static ArrayList<String> getMazePathsWithJump(int sr, int sc, int dr, int dc) {

        if (sr == dr & sc == dc) {
            ArrayList<String> bs = new ArrayList<>();
            bs.add("");
            return bs;
        }
        ArrayList<String> paths = new ArrayList<>();
        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpaths = getMazePathsWithJump(sr, sc + ms, dr, dc);
            for (String hpath : hpaths) {
                paths.add("h" + ms + hpath);
            }
        }

        for (int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> vpaths = getMazePathsWithJump(sr, sc + ms, dr, dc);
            for (String vpath : vpaths) {
                paths.add("v" + ms + vpath);
            }

        }
        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
            ArrayList<String> dpaths = getMazePathsWithJump(sr + ms, sc + ms, dr, dc);
            for (String dpath : dpaths) {
                paths.add("d" + ms + dpath);
            }

        }
        return paths;

    }
}
