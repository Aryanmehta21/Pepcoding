import java.util.*;
public class ShortestStringSubsequence {
    public static int LCS(String text1, String text2){
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for(int i = 1;i<dp.length;i++){
            for(int j = 1;j<dp[0].length;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }


    public static int lengthOfString(String text1, String text2){
        int lcs = LCS(text1, text2);
        return text1.length() + text2.length() - lcs;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();


        System.out.println(lengthOfString(str1, str2));
        sc.close();
    }
}
