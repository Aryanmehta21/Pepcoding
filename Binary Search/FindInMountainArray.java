import java.util.*;
public class FindInMountainArray {
    public static int search(int target, int[] arr){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] < arr[mid+1]){
                low = mid + 1; 
            }else{
                high = mid - 1;
            }
        }

        int peak = low;
        high = peak-1;
        low = 0;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1; 
            }
        }


        high = arr.length-1;
        low = peak;

        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(search(target, arr));
        sc.close();
    }
}
