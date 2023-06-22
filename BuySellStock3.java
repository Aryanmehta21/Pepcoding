import java.util.*;
public class BuySellStock3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int fee = sc.nextInt();

        System.out.println(profit(arr, fee));
        sc.close();
    }

    public static int profit(int[] arr, int fee){
        int obsp = -arr[0];
        int ossp = 0;
        for(int i = 1;i<arr.length;i++){
            int nbsp = 0;
            int nssp = 0;
            if(ossp - arr[i] > obsp){
                nbsp = ossp - arr[i];
            }else{
                nbsp = obsp;
            }
        }
    }
}
