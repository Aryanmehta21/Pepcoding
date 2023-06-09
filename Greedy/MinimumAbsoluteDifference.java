import java.util.*;
public class MinimumAbsoluteDifference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for(int i = 0;i<n;i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0;i<n;i++){
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff =0;
        for(int i = 0;i<n;i++){
            minDiff += Math.abs(A[i]-B[i]);
        }
        System.out.println("Min Difference = " + minDiff);

        sc.close();
    }
}
