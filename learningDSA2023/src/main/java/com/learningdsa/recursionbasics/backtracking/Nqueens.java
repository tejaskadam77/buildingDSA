package com.learningdsa.recursionbasics.backtracking;

import java.util.Scanner;

public class Nqueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
          int m = sc.nextInt();
        int[][] a = new int[n][n];
        printNqueens(a,"",0);
    }

    public static void printNqueens(int[][]a,String qsf,int row)
    {
        for(int col=0;col<a.length;col++)
        {
            if(isItSafePlaceForQueen(a,row,col)) {
                a[row][col] = 1;
                printNqueens(a, qsf + row + "-" + col + ",", row + 1);
                a[row][col] = 0;
            }
        }
    }

    private static boolean isItSafePlaceForQueen(int[][] a, int row, int col) {
        for(int i=row-1, j=col-1;col>=0 && row>=0;i--,j--)
        {
            if(a[i][j]==1)
                return false;
        }
        for(int i=row-1,j=col;col>=0 && row>=0;i--)
        {
            if(a[i][j]==1)
                return false;
        }
        for(int i=row-1,j=col+1;col<a.length && row>=0;i--,j++)
        {
            if(a[i][j]==1)
                return false;
        }
        return true;
    }
}
