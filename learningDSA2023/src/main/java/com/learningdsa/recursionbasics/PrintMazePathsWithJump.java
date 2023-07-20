package com.learningdsa.recursionbasics;

import java.util.Scanner;

public class PrintMazePathsWithJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dr = sc.nextInt();
        int dc = sc.nextInt();
        printMazePaths(1, 1, dr, dc, "");

    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String ans) {
        if (sr == dr && sc == dc) {
            System.out.println(ans);
            return;
        }
        for (int ms = 1; ms <= dc - sc; ms++) {
            printMazePaths(sr, sc + ms, dr, dc, ans + "h" + ms);
        }
        for (int ms = 1; ms <= dr - sr; ms++) {
            printMazePaths(sr + ms, sc, dr, dc, ans + "v" + ms);
        }
        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
            printMazePaths(sr + ms, sc + ms, dr, dc, ans + "d" + ms);
        }

    }
}
