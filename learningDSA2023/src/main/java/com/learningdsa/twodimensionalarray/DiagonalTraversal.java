package com.learningdsa.twodimensionalarray;

import java.util.Scanner;

public class DiagonalTraversal {
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

        for(int gap=0;gap<a.length;gap++  )
        {
            for(int i=0,j=gap;j<a.length;i++,j++)
            {
                System.out.println(a[i][j]+"\t");
            }
        }
    }
}
