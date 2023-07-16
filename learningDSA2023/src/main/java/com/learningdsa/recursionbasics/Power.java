package com.learningdsa.recursionbasics;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        System.out.println("enter power");
        int p = sc.nextInt();
        System.out.println(getPower(n, p));

    }
    public static int getPower(int n, int p) {
        if (p == 0)
            return 1;
        else
            return n * getPower(n, p - 1);
    }
    public static int getPowerFast(int n, int p) {
        if (p == 0)
            return 1;
        else {
            if (p % 2 == 0) {
                return getPower(n, p / 2) * getPower(n, p / 2);
            } else {
                return n * getPower(n, p / 2) * getPower(n, p / 2);
            }
        }
    }
}
