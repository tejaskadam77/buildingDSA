package com.learningdsa.levelOne.twodimensionalarray;

import java.util.Scanner;

public class ShellRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int r1 = sc.nextInt();
        System.out.println("enter no of columns");
        int c1 = sc.nextInt();
        System.out.println("enter array elements");
        int[][] a = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter shell number to rotate");
        int s = sc.nextInt();
        System.out.println("enter no of rotations");
        int r = sc.nextInt();
        shellRotate(a, s, r);
    }

    private static void shellRotate(int[][] a, int s, int r) {
        int[] oned = fillonedfromshell(a, s);
        rotateArray(oned, r);
        fillshellfromOned(oned, a, s);
    }

    private static void fillshellfromOned(int[] oned, int[][] a, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = a.length - s;
        int maxc = a[0].length - s;
        int count = 0;
        for (int i = minr, j = minc; i < maxr; i++) {
            a[i][j] = oned[count];
            count++;
        }
        for (int i = maxr, j = minc + 1; j < maxc; j++) {
            a[i][j] = oned[count];
            count++;
        }
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            a[i][j] = oned[count];
            count++;
        }
        for (int j = maxc - 1, i = minr; j >= minc; j--) {
            a[i][j] = oned[count];
            count++;
        }
    }

    private static int[] fillonedfromshell(int[][] a, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = a.length - s;
        int maxc = a[0].length - s;
        int sz = 2 * (maxr - minr + maxc - minc);
        int[] oned = new int[sz];
        int count = 0;
        for (int i = minr, j = minc; i <= maxr; i++) {
            oned[count] = a[i][j];
            count++;

        }
        for (int i = maxr, j = minc + 1; j <=maxc; j++) {
            oned[count] = a[i][j];
            count++;
        }
        for (int i = maxr - 1, j = maxc; i >= minr; i--) {
            oned[count] = a[i][j];
            count++;
        }
        for (int i = minr,j = maxc - 1; j >= minc; j--) {
            oned[count] = a[i][j];
            count++;
        }

        return oned;
    }

    private static void rotateArray(int[] a, int r) {
        r=r%a.length;
        if(r<0)
            r=r+a.length;

        //part 1 reverse
        reverse(a, 0, a.length - r - 1);
        //part 2 reverse
        reverse(a, a.length - r, a.length - 1);
        //reverse entire array
        reverse(a, 0, a.length - 1);


    }

    private static void reverse(int[] a, int li, int ri) {
        while (li < ri) {
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            li++;
            ri--;
        }
    }
}
