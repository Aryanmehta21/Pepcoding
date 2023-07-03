import java.util.*;
public class SearchInRotatedSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(search(arr, key));
        sc.close();
    }


    public static int search(int[] arr, int target){
        
    }
}
