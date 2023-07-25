package com.learningdsa.levelOne.twodimensionalarray;

import java.util.Scanner;

public class WaveTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int r = sc.nextInt();
        System.out.println("enter no of columns");
        int c = sc.nextInt();
        System.out.println("enter array elements");
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < c; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < r; i++) {
                    System.out.print(a[i][j] + "\t");
                }
            } else {
                for (int i = r - 1; i >= 0; i--) {
                    System.out.print(a[i][j] + "\t");
                }
            }
            //System.out.println();
        }
    }
}

