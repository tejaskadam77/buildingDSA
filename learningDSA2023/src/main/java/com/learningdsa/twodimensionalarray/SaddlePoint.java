package com.learningdsa.twodimensionalarray;

import java.util.Scanner;

public class SaddlePoint {
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

        for (int i = 0; i < a.length; i++) {

            int svj = 0;
            for (int j = 1; j < a[0].length; j++) {
                if (a[i][j-1] < a[i][j]) {
                    svj = j;
                }
            }
            boolean flag = true;
            for (int k = 0; k < a[0].length; k++) {
                if (a[k][svj] > a[i][svj]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i + "and" + svj);
                return;
            }

        }
    }

}
