package com.learningdsa.levelOne.twodimensionalarray;

import java.util.Scanner;

public class SpiralTraversal {
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

        int minr = 0;
        int minc = 0;
        int maxr = r - 1;
        int maxc = c - 1;
        int tne = r * c;
        int count = 0;
        while (count < tne) {
            for (int i = minr, j = minc; i <= maxr && count < tne; i++) {
                System.out.print(a[i][j] + "\t");
                count++;
            }
            minc++;
            for (int i = maxr, j = minc; j <= maxc && count < tne; j++) {
                System.out.print(a[i][j] + "\t");
                count++;
            }
            maxr--;
            for (int i = maxr, j = maxc; i >= minr && count < tne; i--) {
                System.out.print(a[i][j] + "\t");
                count++;
            }
            maxc--;
            for (int i = minr, j = maxc; j >= minc && count < tne; j--) {
                System.out.print(a[i][j] + "\t");
                count++;
            }
            minr++;


        }
    }
}
