// John is a geologist, and he needs to count rock samples in order to send it to a chemical laboratory. He has a problem. The laboratory only accepts rock samples by a range of sizes in ppm (parts per million). John needs your help. Your task is to develop a program to get the number of rocks in each range accepted by the laboratory.
// Problem Statement: Given an array samples[] denoting sizes of rock samples and a 2D array ranges[], the task is to count the rock samples that are in the range ranges[i][0] to ranges[i][1], for every possible 1 <= i <= N.
import java.util.*;
public class TCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int row = sc.nextInt();
        int[][] range = new int[row][2];
        for(int i=0;i<range.length;i++){
            for(int j=0;j<range[0].length;j++){
                range[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for(int i =0;i<range.length;i++){
            for(int j =0;j<arr.length;j++){
                if(arr[j]> range[i][0] && arr[j]<range[i][1]){
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
        sc.close();
    }
}