import java.util.*;
public class Goldmine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mine = new int[row][col];
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                mine[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[row][col];

        for(int j = mine[0].length-1;j>=0;j--){
            for(int i = mine.length-1;i>=0;i--){
                if(j == mine[0].length-1){
                    dp[i][j] = mine[i][j];
                }else if(i == 0){
                    dp[i][j] = mine[i][j] + Math.max(dp[i][j+1], dp[i+1][j+1]);
                }else if(i == mine.length-1){
                    dp[i][j] = mine[i][j] + Math.max(dp[i][j+1], dp[i-1][j+1]);
                }else{
                    dp[i][j] = mine[i][j] + Math.max(dp[i][j+1], Math.max(dp[i+1][j+1], dp[i-1][j+1]));
                }
            }
        }


        int max = dp[0][0];
        for(int i =0;i<dp.length;i++){
            if(dp[i][0]>max){
                max = dp[i][0];
            }
        }

        System.out.println(max);
        sc.close();
    }
}