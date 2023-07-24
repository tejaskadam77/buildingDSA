package com.learningdsa.recursionbasics.backtracking;

import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
    }

    public static void printFloodFill(int[][] a, int r, int c, boolean[][] visited, String ans) {
        if (r < 0 || c < 0 || r > a.length || c > a[0].length || a[r][c] == 1 || visited[r][c] == true) {
            return;
        }
        if (r == a.length - 1 && c == a[0].length - 1) {
            System.out.println(ans);
            return;
        }
        visited[r][c] = true;
        printFloodFill(a, r - 1, c, visited, ans + "t");
        printFloodFill(a, r, c - 1, visited, ans + "l");
        printFloodFill(a, r + 1, c, visited, ans + "d");
        printFloodFill(a, r, c + 1, visited, ans + "r");
        visited[r][c] = false;
    }
}
