package com.praveen.shethe.simplejava;

/**
 * Created by Praveenkumar on 5/5/2021.
 */
public class Example2 {

    public static void main(String[] args) {
        int[] a = {0, 0, 0, 0, 1, 2, 6, 12, 0, 4, 2, 3};
        System.out.println(findElement(a, a.length));
    }

    static int findElement(int arr[], int n)
    {
        // Forming prefix sum array from 0
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++)
            prefixSum[i] = prefixSum[i - 1] + arr[i];

        // Forming suffix sum array from n-1
        int[] suffixSum = new int[n];
        suffixSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            suffixSum[i] = suffixSum[i + 1] + arr[i];

        // Find the point where prefix and suffix
        // sums are same.
        for (int i = 1; i < n - 1; i++)
            if (prefixSum[i] == suffixSum[i])
                return arr[i];

        return -1;
    }
}
