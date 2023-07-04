import java.util.*;
public class FindInMountainArray {
    public static int search(int target, int[] arr){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            
        }
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
    }
}
