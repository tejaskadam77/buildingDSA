package com.learningdsa.levelOne.arrays;

import java.util.Scanner;

public class SubtractionArray {
    public static void main(String[] args) {
        System.out.println("enter length1");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        System.out.println("enter numbers1");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        System.out.println("enter length2");
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        System.out.println("enter numbers2");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
        int c = 0;
        int diff[] = new int[n2];
        int i = a1.length-1;
        int j = a2.length-1;
        int k = diff.length-1;
        while (k >= 0) {
            int a1v = i >= 0 ? a1[i] : 0;
            int d = 0;
            if (a2[j] + c >= a1v) {
                d = a2[j] + c - a1v;
                c = 0;
            } else {
                d = a2[j] + 10 + c - a1v;
                c = -1;
            }
            diff[k]=d;
            k--;
            j--;
            i--;

        }
        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;

            } else {
                break;
            }
        }
        while (idx < diff.length) {
            System.out.print(diff[idx]);
            idx++;
        }
    }
}
