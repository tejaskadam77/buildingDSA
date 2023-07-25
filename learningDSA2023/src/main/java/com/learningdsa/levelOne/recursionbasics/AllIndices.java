package com.learningdsa.levelOne.recursionbasics;

import java.util.Scanner;

public class AllIndices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter size odf array");
        int size = s.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enter no to find last index");
        int data = s.nextInt();
       // findAllIndices(a, data,0, );
    }

}
