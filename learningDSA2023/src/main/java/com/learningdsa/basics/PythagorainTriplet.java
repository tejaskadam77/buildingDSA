package com.learningdsa.basics;

import java.util.Scanner;

public class PythagorainTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean flag = false;
        int max = a;
        if (b >= max) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }
        if (max == a) {
            flag = ((b * b) + (c * c) == (a * a));
        }
        if (max == b)
            flag = ((a * a) + (c * c) == (b * b));
        else {
            flag = ((b * b) + (a * a) == (c * c));
        }
        System.out.println(flag);
    }
}
