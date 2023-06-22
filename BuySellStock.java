import java.util.*;
public class BuySellStock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(profit(arr));
        sc.close();
    }
    public static int profit(int[] nums){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price:nums){
            if(price < minPrice){
                minPrice = price;
            }else{
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}
