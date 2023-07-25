package com.learningdsa.levelOne.twodimensionalarray;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows1");
        int r1 = sc.nextInt();
        System.out.println("enter no of columns1");
        int c1 = sc.nextInt();
        System.out.println("enter array elements");
        int[][] a = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter no of rows2");
        int r2 = sc.nextInt();
        System.out.println("enter no of columns2");
        int c2 = sc.nextInt();
        System.out.println("enter array elements");
        int[][] b = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        if (c2 != r1) {
            System.out.println("matrix are incompatible for multiplication");
            return;
        }
        int[][] ans = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(ans[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


