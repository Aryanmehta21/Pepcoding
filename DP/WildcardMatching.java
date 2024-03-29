import java.util.*;
public class WildcardMatching {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n+1][m+1];
        dp[n][m] = true;

        for(int i = m-1;i>=0;i--){
            if(p.charAt(i) != '*'){
                break;
            }else{
                dp[n][i] = true; 
            }
        }

        for(int i = n-1;i>=0;i--){
            for(int j = m-1;j>=0;j--){
                if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?'){
                    dp[i][j] = dp[i+1][j+1];
                }else if(p.charAt(j) == '*'){
                    dp[i][j] = dp[i+1][j] || dp[i][j+1];
                }else{
                    dp[i][j] = false;
                }
            }
        }

        System.out.println(dp[0][0]);
        sc.close();
    }
}
