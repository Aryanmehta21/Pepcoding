import java.util.*;
public class MinimumCoins {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        
        Arrays.sort(coins, Comparator.reverseOrder());
        
        int countOfCoins = 0;
        int amount = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<coins.length;i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countOfCoins++;
                    list.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println(countOfCoins);
        for(int i:list){
            System.out.println(i + " ");
        }
        sc.close();
    }
}
