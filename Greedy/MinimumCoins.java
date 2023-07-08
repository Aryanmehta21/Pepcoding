import java.util.*;
public class MinimumCoins {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        
        Arrays.sort(coins, Comparator.reverseOrder());
        
        int countOdCoins = 0;
        int amount = sc.nextInt();

        for(int i = 0;i<coins.length;i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    
                }
            }
        }
    }
}
