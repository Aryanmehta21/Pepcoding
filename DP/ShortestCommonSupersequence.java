import java.util.*;
public class ShortestCommonSupersequence {

    public static String LCS(String text1, String text2){
        String[][] dp = new String[text1.length() + 1][text2.length() + 1];
        for(int i = 0;i<=text1.length();i++){
            for(int j = 0;j<=text2.length();j++){
                if(i==0||j==0){
                    dp[i][j] = "";
                }else if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + text1.charAt(i-1);
                }else{
                    if(dp[i-1][j].length() >= dp[i][j-1].length()){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        dp[i][j] = dp[i][j-1];
                    }
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }

    public static String shortestCommonSupersequence(String str1, String str2){
        String lcs = LCS(str1, str2);
        int p1 = 0;
        int p2 = 0;
        String ans = "";
        for(int i = 0;i<lcs.length();i++){
            char ch = lcs.charAt(i);

            while(str1.charAt(p1) != ch){
                ans += str1.charAt(p1);
                p1++;
            }

            while(str2.charAt(p2) != ch){
                ans += str2.charAt(p2);
                p2++;
            }
            ans+=ch;
            p1++;
            p2++;

        }
        ans+=str1.substring(p1) + str2.substring(p2);
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(shortestCommonSupersequence(str1, str2));
        sc.close();
    }
}
