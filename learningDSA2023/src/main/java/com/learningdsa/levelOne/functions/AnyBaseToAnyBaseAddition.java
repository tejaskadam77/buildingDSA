package com.learningdsa.levelOne.functions;

import java.util.Scanner;

public class AnyBaseToAnyBaseAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getSum(b, n1, n2));

    }

    public static int getSum(int b, int n1, int n2) {

        int c = 0;
        int p = 1;
        int d = 0;
        int num = 0;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d2 = n2 % 10;
            n2 = n2 / 10;
            d = d1 + d2 + c;
            c = d / b;
            d = d % b;
            num = num + d * p;

            p = p * 10;

        }
        return num;
    }
}
