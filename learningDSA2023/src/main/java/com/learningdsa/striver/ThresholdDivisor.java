package com.learningdsa.striver;

import java.time.Clock;

public class ThresholdDivisor {
    public static void main(String[] args) {
        int arr[] = new int[]{8,4,2,3};
        int threshold = 10;
        //System.out.println(Math.ceil(5.0d/3.0d));
       System.out.println(findSmallestDivisor(arr,threshold));

    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    public static int findSmallestDivisor(int[] arr, int threshold) {
        int low=1;
        int high=findMax(arr);
        int mid=-1;
        int ans =-1;
        while(low<=high)
        {
            mid=low+high/2;
            int divisorsSum=getDivisorsSum(arr,mid);
            if(divisorsSum<=threshold)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;

    }

    private static int getDivisorsSum(int[] arr, int mid) {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+(int)Math.ceil((double)arr[i]/(double)mid);
        }
        return sum;
    }
}
