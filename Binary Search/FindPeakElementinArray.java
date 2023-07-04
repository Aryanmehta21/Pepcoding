import java.util.*;
public class FindPeakElementinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findPeak(arr));
        sc.close();
    }

    public static int findPeak(int[] arr){
        int low = 0;
        int high = arr.length;

        while(low<=high){
            int mid = low + (high - low)/2;

            if(arr[mid]<arr[mid+1]){
                low = mid + 1; 
            }else{
                high = mid-1;
            }
        }
        return arr[low];
    }
}
