package com.learningdsa.levelOne.twodimensionalarray;

import java.util.Scanner;

public class SearchSorted2DArray {
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
        System.out.println("enter element to find");
        int x = sc.nextInt();
        int i = 0;
        int j = a[0].length - 1;
        while (i < a.length && j > 0) {
            if (a[i][j] == x) {
                System.out.println(i);
                System.out.println(j);
                return;
            } else if (x < a[i][j]) {
                j--;
            } else {
                i++;
            }

        }
        System.out.println("Not found");
    }
}
