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
        Arrays.sort(ratio, (a,b) -> Double.compare(b[1], a[1])); 
        int capacity = W;
        int finalVal = 0;
        for(int i = 0;i<ratio.length;i++){
            int idx = (int) ratio[i][0];
            if(capacity>=weights[idx]){
                finalVal += val[idx];
                capacity -= weights[idx]; 
            }else{
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Max Value = " + finalVal);
        sc.close();
    }
}
