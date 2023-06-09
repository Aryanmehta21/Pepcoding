// Given an array Arr of length N. Determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero. 
// Formally, find an i, such that, Arr1 + Arr2 ... Arri-1 = Arri+1 + Arri+2 ... ArrN.

// Example 1:

// Input:
// N = 4
// Arr[] = {1, 2, 3, 3}
// Output: YES
// Explanation: Consider i = 3, for [1, 2] 
// sum is 3 and for [3] sum is also 3.

import java.util.*;
public class EqualSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(equilibrium(arr, n));
        sc.close();
    }
    public static String equilibrium(int arr[], int n) {
        // code here
        if(arr.length<3){
            return "NO";
        }
        int sum =0;
        int leftSum =0;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
        }
        int i =0;
        int j =n-1;
        while(i<=j){
            sum -= arr[i];
            if(leftSum == sum){
                return "YES";
            }
            leftSum += arr[i];
            i++;
        }
        return "NO";
    }
}
