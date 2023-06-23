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
        int mpist = 0;
        int leastsf = prices[0];
        int[] dpl = new int[prices.length];
        for(int i = 1;i<prices.length;i++){
            if(prices[i] < leastsf){
                leastsf = prices[i];
            }
            mpist = prices[i] - leastsf;
            if(mpist > dpl[i-1]){
                dpl[i] = mpist;
            }else{
                dpl[i] = dpl[i-1];
            }
        }
        int mpibt = 0;
        int maxat = prices[prices.length-1];
        int[] dpr = new int[prices.length];
        for(int i = prices.length-2;i>=0;i--){
            if(prices[i] > maxat){
                maxat = prices[i];
            }
            mpibt = maxat - prices[i];
            if(mpibt > )
        }
    }
}
