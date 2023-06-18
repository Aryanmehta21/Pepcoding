import java.util.Scanner;

public class PaintHouse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for(int i =0;i<arr.length;i++){
            arr[i][j]= sc.nextInt();
        }
        long[][] dp = new long[n][3];

        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        for(int i =1;i<arr.length;i++){
            
        }
    }
}
