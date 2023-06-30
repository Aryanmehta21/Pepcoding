// Question: Connect N ropes with minimum cost given array of length of ropes and the cost can be calculated by adding two ropes of length;
// I/p : [2,5,4,8,6,9]
// o/p : 85
// Add two smallest ropes one by one.

import java.util.*;
public class ConnectNropes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(minCost(arr));
    }

    public static int minCost(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int ans = 0;
        while(pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            int sum = first + second;
            
        }
    }
}
