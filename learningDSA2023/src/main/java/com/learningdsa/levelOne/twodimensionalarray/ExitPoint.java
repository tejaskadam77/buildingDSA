package com.learningdsa.levelOne.twodimensionalarray;

import java.util.Scanner;

public class ExitPoint {
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
        int d = 0;
        int i = 0;
        int j = 0;

        while (true) {
            //0 e
            //1 s
            //2 w
            //3 n
            d = (d + a[i][j]) % 4;
            if (d == 0) {
                j++;
            } else if (d == 1) {
                i++;
            } else if (d == 2) {
                j--;
            } else if (d == 3) {
                i--;
            }
            if (i < 0) {
                i++;
                break;

            } else if (i == a.length) {
                i--;
                break;

            } else if (j < 0) {
                j++;
                break;

            } else if (j == a[0].length) {
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }

}
