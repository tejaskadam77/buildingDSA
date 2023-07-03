package com.learningdsa.basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int i = low; i <= high; i++) {

            //check if number is prime or not and yes then print
            int count = 0;
            for (int div = 2; div * div <= i; div++) {

                if (i % div == 0) {
                    count++;
                	break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }


        }

    }
}
