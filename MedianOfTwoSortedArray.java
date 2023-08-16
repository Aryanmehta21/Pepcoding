import java.util.*;
public class MedianOfTwoSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] brr = new int[m];
        for(int i =0;i<m;i++){
            brr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i = 0;i<brr.length;i++){
            list.add(brr[i]);
        }

        int[] ans = new int[list.size()];

        for(int i =0 ;i<ans.length;i++){
            ans[i] = list.get(i);
        }
        int mid = (0 + ans.length)/2;
        double median = 0.0;
        if(arr.length % 2 == 0){
            median  = (double)(ans[mid] + ans[mid-1])/2;
        }else{

            median = (double)mid/2; 
        }

        System.out.println(median);
    }
}
