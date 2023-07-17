// Leetcode 72
import java.util.*;
public class LevenshteinDistance{
    public static int calculate(String s, String t){
        int[][] dp =new int[s.length() + 1][t.length() + 1];
        dp[0][0] = 0;
        for(int i = 0;i<s.length() + 1;i++){
            for(int j = 0;j<t.length() + 1;j++){
                if(i==0){
                    dp[i][j] = j; 
                }else if(j==0){
                    dp[i][j] = i;
                }else{
                    if(s.charAt(i-1) == t.charAt(j-1)){
                        dp[i][j] = dp[i-1][j-1];
                    }else{
                        dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
                    }
                }
            }
        }
        return dp[s.length()][t.length()];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(calculate(s, t));
        sc.close();
    }
}