import java.util.*;
public class PaintHouse2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr = new int[n][c];
        for(int i =0;i<arr.length;i++){
            for(int j =0;i<arr[0].length;i++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[arr.length][arr[0].length];
        for(int j = 0; j<arr[0].length;j++){
            dp[0][j] = arr[0][j];
        }
        // n^3 Solution.
    }
}
