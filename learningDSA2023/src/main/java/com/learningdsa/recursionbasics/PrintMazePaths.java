package com.learningdsa.recursionbasics;

import java.util.Scanner;

public class PrintMazePaths {
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
        if (sc < dc) {
            printMazePaths(sr, sc + 1, dr, dc, ans + "h");
        }
        if (sr < dr) {
            printMazePaths(sr + 1, sc, dr, dc, ans + "v");
        }

    }
}
