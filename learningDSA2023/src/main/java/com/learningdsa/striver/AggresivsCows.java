package com.learningdsa.striver;

import java.util.Arrays;

public class AggresivsCows {
    public static void main(String[] args) {
        int stalls[] = new int[]{0, 3, 4, 7, 10, 9};
        int k = 4;
        System.out.println(aggresiveCows(stalls, k));
    }

    private static int aggresiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int max = stalls[n - 1] - stalls[0];
        int min = 1;
        for (int distance = 1; distance <=max; distance++) {
            if (canWePlace(stalls, distance, k) == false)
                return distance - 1;
        }
        return max;
    }

    private static boolean canWePlace(int[] stalls, int distance, int k) {

        int lastCow = stalls[0];
        int countCow = 1;
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastCow >= distance) {
                countCow++;
                lastCow = stalls[i];
            }
            if (countCow >= k)
                return true;
        }
        return false;
    }
}
