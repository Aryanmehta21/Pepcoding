/*
 * Problem Statement
Given the arrival and departure times of all trains that reach a railway station, find the minimum number of platforms required for the station so that no train is kept waiting. Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure times can never be the same for a train, but we can have the arrival time of one train equal to the departure time of the other. At any given time, the same platform cannot be used for both the departure of a train and the arrival of another train. In such cases, we need different platforms.
Example
Input:
6
0900 0940 0950 1100 1500 1800
0910 1200 1120 1130 1900 2000
Output:
3
Explanation:
By observing the time intervals, we can determine the number of platforms required.
At 0900, there is one train arriving (platform count = 1).
At 0910, one train departs, but another train arrives (platform count = 1).
At 0940, one train arrives (platform count = 2).
At 0950, one train arrives (platform count = 3).
At 1100, one train arrives (platform count = 4).
At 1120, one train departs, but another train arrives (platform count = 4).
At 1130, one train departs, but another train arrives (platform count = 4).
At 1200, one train departs (platform count = 3).
At 1500, one train arrives (platform count = 4).
At 1800, one train arrives (platform count = 5).
At 1900, one train departs (platform count = 4).
At 2000, one train departs (platform count = 3).
Hence, the minimum number of platforms required to accommodate all the trains without any waiting is 3, and that's why the output is 3.
Note: Time intervals are in the 24-hour format (HHMM), where the first two characters represent an hour (between 00 and 23), and the last two characters represent minutes (between 00 and 59).
Input format :
The first line of input contains an integer n, representing the number of trains.
The second line of input contains n space-separated integers denoting the arrival times of the trains.
The third line of input contains n space-separated integers denoting the departure times of the trains.
Output format :
The output contains a single integer denoting the minimum number of platforms required at the railway station such that no train waits.
Code constraints :
1 ≤ n ≤ 50000
0000 ≤ A[i] ≤ D[i] ≤ 2359
 * 
 */

// You are using Java
import java.util.*;
public class MinimumStationsRequired {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrival = new int[n];
        int[] dept = new int[n];
        
        for(int i = 0;i<n;i++){
            arrival[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            dept[i] = sc.nextInt();
        }
        
        Arrays.sort(arrival);
        Arrays.sort(dept);
        
        int count = 1;
        int i = 1;
        int j = 0;
        int result = 1;
        
        while(i<n && j<n){
            if(arrival[i] <= dept[j]){
                count++;
                i++;
            }else if(arrival[i] > dept[j]){
                count--;
                j++;
            }
            
            if(count>result){
                result = count;
            }
        }
        
        System.out.println(result);
        sc.close();
    }
}