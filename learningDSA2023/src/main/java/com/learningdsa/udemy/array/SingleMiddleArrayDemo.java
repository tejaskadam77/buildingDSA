package com.learningdsa.udemy.array;

import java.util.Arrays;
import java.util.Scanner;

public class SingleMiddleArrayDemo {
    static int findMissingNumberInArray(int[] arr) {

        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int number : arr) {
            actualSum += number;
        }
        return expectedSum - actualSum;

    }

    static int[] findSecondHighest(int[] arr) {

        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int score : a) {
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;

            }
            return new int[]{firstHighest, secondHighest};
        }
        return a;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        removeDuplicates(a);


    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = array[i];
            }
        }
        return Arrays.copyOf(uniqueArray, index);
    }

    public static int[] middle(int[] array) {
        // TODO
        int res[] = new int[array.length - 2];
        for (int i = 0; i < res.length; i++) {
            res[i] = array[i + 1];
        }
        return res;
    }


}
