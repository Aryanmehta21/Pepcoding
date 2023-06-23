import java.util.*;
public class BuySellStock4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(profit(arr));
        sc.close();
    }

    public static int profit(int[] prices){
        int obsp = -prices[0];
        int ossp = 0;
        int ocsp = 0;
        for(int i =1;i<prices.length;i++){
            int nbsp = 0;
            int nssp = 0;
            int ncsp = 0;
            if(ocsp - prices[i] > obsp){
                nbsp = ocsp - prices[i];
            }else{
                nbsp = obsp;
            }

            if(obsp + prices[i] > ossp){
                nssp = obsp + prices[i];
            }else{
                nssp = ossp;
            }

            if(ossp > ocsp){
                ncsp = ossp;
            }else{
                ncsp = ocsp;
            }

            obsp = nbsp;
            ossp = nssp;
            ocsp = ncsp;
        }
        return ossp;
    }
}



// obsp = old bought state price
// ossp = old sold state price
// ocsp = old cooldown state price
// nbsp = new bought state price
// nssp = new sold state price
// ncsp = new cooldown state price
