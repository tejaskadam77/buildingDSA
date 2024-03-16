package com.learningdsa.levelOne.arrays;

import java.util.Scanner;

public class BinarySearch {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array and elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter number to search ");
        int data = sc.nextInt();
        int mid = 0;
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            mid = low + high / 2;
            if (a[mid] == data) {
                System.out.println("index is --> " + mid);
                return;
            } else if (data < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(-1);

    }
}
