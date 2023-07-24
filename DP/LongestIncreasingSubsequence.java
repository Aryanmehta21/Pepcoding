/*
673. Number of Longest Increasing Subsequence
Given an integer array nums, return the number of longest increasing subsequences.

Notice that the sequence has to be strictly increasing.

 

Example 1:

Input: nums = [1,3,5,4,7]
Output: 2
Explanation: The two longest increasing subsequences are [1, 3, 4, 7] and [1, 3, 5, 7].
 * 
 */
import java.util.*;
public class LongestIncreasingSubsequence {

    public static int LIS(int[] nums){
        int n = nums.length;
        if(n==0)return 0;
        int[] dp = new int[n];
        int[] count = new int[n];

        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);
        int maxLength = 1;
        for(int i =1 ;i<n;i++){
            for(int j = 0;j<i;j++){
                if(nums[i] > nums[j]){
                    if(dp[j] + 1 > dp[i]){
                        dp[i] = dp[j] + 1;
                        count[i] = count[j];
                    }else if(dp[j] + 1 == dp[i]){
                        count[i] += count[j];
                    }
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
            
        }
        System.out.println("Max Length "  + maxLength);

        
        int result = 0;
        for(int i = 0;i<n;i++){
            if(dp[i] == maxLength){
                result += count[i];
            }
        }
        System.out.print("DP ");
        for(int i = 0;i<n;i++){
            System.out.print(dp[i] + " ");
        }
        System.out.println();
        System.out.print("Count Array");
        for(int i = 0;i<n;i++){
            System.out.print(count[i] + " ");
        }
        System.out.println();
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("result " + LIS(arr));
        sc.close();
    }
}
