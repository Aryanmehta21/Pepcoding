import java.util.*;
public class MedianOfTwoSortedArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] brr = new int[m];
        for(int i =0;i<m;i++){
            brr[i] = sc.nextInt();
        }

        System.out.println(median(arr, brr));
        sc.close();
    }
}
