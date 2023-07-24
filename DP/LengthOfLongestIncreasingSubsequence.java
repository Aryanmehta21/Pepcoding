/*
 * 300. Longest Increasing Subsequence
Given an integer array nums, return the length of the longest strictly increasing 
subsequence
Example 1:
Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 */

import java.util.*;
public class LengthOfLongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];

        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            for(int j = 0;j<i;j++){
                if(nums[j]< nums[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int max = 0;
        for(int i = 0;i<n;i++){
            max = Math.max(dp[i], max);
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(lengthOfLIS(arr));
        sc.close();
    }
}
