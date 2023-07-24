package com.learningdsa.recursionbasics.backtracking;

import java.util.Scanner;

public class KnightsTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] chess = new int[r][c];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                chess[i][j] = sc.nextInt();
            }
        }
        printKnightsTour(chess, 0, 0, 1);
    }

    private static void printKnightsTour(int[][] chess, int r, int c, int mv) {

        if (r < 0 || c < 0 || r >= chess.length || c >= chess.length || chess[r][c] > 0) {
            return;
        } else if (mv == chess.length * chess.length) {
            chess[r][c] = mv;
            displayBoard(chess);
            chess[r][c] = 0;
            return;
        }
        chess[r][c] = mv;
        printKnightsTour(chess, r - 2, c + 1, mv + 1);
        printKnightsTour(chess, r - 1, c + 2, mv + 1);
        printKnightsTour(chess, r + 1, c + 2, mv + 1);
        printKnightsTour(chess, r + 2, c + 1, mv + 1);
        printKnightsTour(chess, r + 2, c - 1, mv + 1);
        printKnightsTour(chess, r + 1, c - 2, mv + 1);
        printKnightsTour(chess, r - 1, c - 2, mv + 1);
        printKnightsTour(chess, r - 2, c - 1, mv + 1);
        chess[r][c] = 0;
    }

    private static void displayBoard(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }

}
