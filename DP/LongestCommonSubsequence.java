import java.util.*;
public class LongestCommonSubsequence {

    public static int LCS(String text1, String text2){
        int[][] dp = new int[text1.length() + 1][text2.length()+1];
        for(int i = 0;i<dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){
                
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(LCS(str1, str2));
        sc.close();
    }
}
