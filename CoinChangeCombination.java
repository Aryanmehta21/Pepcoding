import java.util.*;
public class CoinChangeCombination {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int i =0;i<arr.length;i++){
            for(int j =arr[i];j<dp.length;j++){
                dp[j] += dp[j-arr[i]];
            }
        }
        System.out.println(dp[target]);
        sc.close();
    }
}






