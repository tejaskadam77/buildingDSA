package com.learningdsa.striver;

public class ShipCapacity {
    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int ans = leastWeightCapacity(weights, d);
        System.out.println("The minimum capacity should be: " + ans);

    }

    public static int leastWeightCapacity(int[] weights, int days) {
        //Find the maximum and the summation:
        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < weights.length; i++) {
            high += weights[i];
            low = Math.max(low, weights[i]);
        }

        int capacitymid = 0;
        while (low <= high) {
            capacitymid = low + high / 2;
            int numberOfDays = findNoOfDays(weights, capacitymid);
            if (numberOfDays <= days) {
                //eliminate right half
                high = capacitymid - 1;
            } else {
                //eliminate left half
                low = capacitymid + 1;
            }
        }
        return low;

    }

    private static int findNoOfDays(int[] weights, int capacitymid) {
        int days = 1; //First day.
        int load = 0;
        int n = weights.length; //size of array.
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > capacitymid) {
                days += 1; //move to next day
                load = weights[i]; //load the weight.
            } else {
                //load the weight on the same day.
                load += weights[i];
            }
        }
        return days;
    }
}
