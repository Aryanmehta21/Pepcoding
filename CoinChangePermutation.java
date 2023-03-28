import java.util.*;
public class CoinChangePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i =1;i<=target; i++){
            for(int coin : arr){
                if(coin<=i){
                    int remAmt = i - coin;
                    dp[i] += dp[remAmt]; 
                }
            }
        }
        System.out.println(dp[target]);
    }
}
