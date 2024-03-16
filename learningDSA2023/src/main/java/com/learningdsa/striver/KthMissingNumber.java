package com.learningdsa.striver;

public class KthMissingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int n = 4, k = 4;
        int ans = optimisedKThMissing(arr, n, k);
        System.out.println("The missing number is: " + ans);
    }

    public static int bruteforceKThMissing(int arr[], int n, int k) {
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                k++;
            } else
                break;
        }
        return k;
    }

    public static int optimisedKThMissing(int arr[], int n, int k) {

        int low = 0;
        int high = n - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            int missing = findMissingAtGivenPlace(arr, mid);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k+high+1;

    }


    private static int findMissingAtGivenPlace(int[] arr, int mid) {
        return arr[mid] - (mid + 1);
    }

}
