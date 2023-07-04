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

    public static double median(int[] a, int[] b){
        if(a.length>b.length){
            int[] temp = a;
            a=b;
            b=temp;
        }

        int begin1 = 0;
        int end1 = a.length;

        while(begin1<=end1){
            int i1 = (begin1 + end1) / 2;
            int i2 = (a.length + b.length + 1)/2 - i1;


            int min1 = (i1 == n) ? Integer.MAX_VALUE : a[i1];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : a[i1 -1];

            int min2 = (i2 == m) ? Integer.MAX_VALUE : b[i2];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : b[i2 - 1];


            
        }
    }
}
