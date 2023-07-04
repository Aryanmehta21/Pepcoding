/*
 * 4. Median of Two Sorted Arrays
Hard
24.2K
2.7K
Companies
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
 */


//  O(log(m+n)) --> Binary Search

import java.util.*;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] brr = new int[m];
        for (int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
        }

        System.out.println(median(arr, brr));
        sc.close();
    }

    public static double median(int[] a, int[] b) {
        if (a.length > b.length) {
            int[] temp = a;
            a = b;
            b = temp;
        }

        int begin1 = 0;
        int end1 = a.length;

        while (begin1 <= end1) {
            int i1 = (begin1 + end1) / 2;
            int i2 = (a.length + b.length + 1) / 2 - i1;

            int min1 = (i1 == a.length) ? Integer.MAX_VALUE : a[i1];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : a[i1 - 1];

            int min2 = (i2 == b.length) ? Integer.MAX_VALUE : b[i2];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : b[i2 - 1];

            if ((max1 <= min2) && (max2 <= min1)) {
                if ((a.length + b.length) % 2 == 0) {
                    return ((double) (Math.max(max1, max2) + Math.min(min1, min2)) / 2);
                } else {
                    return ((double) (Math.max(max1, max2)));
                }
            } else if (max1 > max2) {
                end1 = i1 - 1;
            } else {
                begin1 = i1 + 1;
            }
        }
        return 0;
    }
}
