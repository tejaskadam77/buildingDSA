package com.learningdsa.recursionbasics;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        //find last index of no from array using recursion
        Scanner s = new Scanner(System.in);
        System.out.println("enter size odf array");
        int size = s.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enter no to find last index");
        int data = s.nextInt();
        System.out.println(findLastIndex(a, 0, data));
        System.out.println("===================================");
        findAllIndex(a, 0, data, 0);
    }

    private static int findFirstIndex(int[] a, int i, int data) {
        if (i == a.length)
            return -1;
        if (a[i] == data)
            return i;
        else {
            int fiisa = findFirstIndex(a, i + 1, data);

            if (a[i] == data)
                return i;
            else {
                return fiisa;
            }
        }

    }


    private static int findLastIndex(int[] a, int i, int data) {
        if (i == a.length)
            return -1;
        int liisa = findLastIndex(a, i + 1, data);
        if (liisa == -1) {
            if (a[i] == data) {
                return i;
            } else {
                return -1;
            }
        } else {
            return liisa;
        }
    }

    private static int[] findAllIndex(int[] a, int i, int data, int fsf) {
        if (i == a.length)
            return new int[fsf];
        if (a[i] == data) {

            int[] fi = findAllIndex(a, i + 1, data, fsf + 1);
            fi[fsf] = i;
            return fi;
        } else {
            int[] fi = findAllIndex(a, i + 1, data, fsf);
            return fi;
        }

    }
}
