package com.learningdsa.levelOne.arrays;

import java.util.Scanner;

public class FirstIndexLastIndex {
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
        firstIndex(a,data);
        lastIndex(a,data);


    }

    public static void firstIndex(int a[], int data) {
        int mid = 0;
        int low = 0;
        int fi = -1;
        int high = a.length - 1;
        while (low <= high && low>=0 && high<a.length) {
            mid = low + high / 2;
            if (a[mid] == data) {
                fi = mid;
                high = mid - 1;
            } else if (data < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if(fi!=-1)
        {
            System.out.println("first index is  " +fi);
        }
    }

    public static void lastIndex(int a[], int data) {
        int mid = 0;
        int low = 0;
        int li = -1;
        int high = a.length - 1;
        while (low <= high && low>0 && high<a.length) {
            mid = low + high / 2;
            if (a[mid] == data) {
                li = mid;
                low = mid + 1;
            } else if (data < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if(li!=-1)
        {
            System.out.println("last index is  " +li);
        }
    }
}
