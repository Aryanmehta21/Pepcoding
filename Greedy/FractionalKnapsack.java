import java.util.*;
public class FractionalKnapsack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] val = new int[n];
        int[] weights = new int[n];
        for(int i = 0;i<n;i++){
            val[i]= sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            weights[i]= sc.nextInt();
        }
        int W = sc.nextInt();

        double[][] ratio = new double[val.length][2];
        for(int i = 0;i<ratio.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double)weights[i];
        }
    }
}
