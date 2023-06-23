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
    // Pepcoding...
    // public static int profit(int[] prices){
    //     int mpist = 0;
    //     int leastsf = prices[0];
    //     int[] dpl = new int[prices.length];                 //mpist = maxprofitifsoldtoday
    //     for(int i = 1;i<prices.length;i++){                //leastsf = leastsofar
    //         if(prices[i] < leastsf){                       //dpl = dp left
    //             leastsf = prices[i];                       //mpibt = maxprofitifboughttoday
    //         }                                              //maxat = max after today
    //         mpist = prices[i] - leastsf;                   //dpr = dp right
    //         if(mpist > dpl[i-1]){                          //op = overall profit
    //             dpl[i] = mpist;
    //         }else{
    //             dpl[i] = dpl[i-1];
    //         }
    //     }
    //     int mpibt = 0;
    //     int maxat = prices[prices.length-1];
    //     int[] dpr = new int[prices.length];
    //     for(int i = prices.length-2;i>=0;i--){
    //         if(prices[i] > maxat){
    //             maxat = prices[i];
    //         }
    //         mpibt = maxat - prices[i];
    //         if(mpibt > dpr[i+1]){
    //             dpr[i] = mpibt;
    //         }else{
    //             dpr[i] = dpr[i+1];
    //         }
    //     }

    //     int op = 0;
    //     for(int i =0;i<prices.length;i++){
    //         if(dpl[i] + dpr[i] > op){
    //             op = dpl[i] + dpr[i];
    //         }
    //     }
    //     return op;
    // }

    // Leetcode (Short)...
    public static int profit(int[] prices){
        int sell1 = 0;
        int sell2 = 0;
        int buy1 = Integer.MIN_VALUE;
        int buy2 = Integer.MIN_VALUE;
        for(int i = 0;i < prices.length; i++){
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        } 
        return sell2;
    }
}
