import java.util.*;
public class SearchInInfiniteSortedArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        int low = 0;
        int high = 1;

        while(arr[high] < key){
            low = high;
            high = 2*high;
        }

        System.out.println(binarySearch(arr, key, low, high));

    }
    public static int binarySearch(int[] arr, int key, int low, int high){

        while(low<=high){
            int mid = low + (high - low)/2;

            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }

        return -1;
    }
}