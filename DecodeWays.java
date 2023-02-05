import java.util.*;
public class DecodeWays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] dp= new int[str.length()];

        for(int i =1;i<dp.length;i++){
            if(str.charAt(i-1) == '0' && str.charAt(i) == '0'){
                dp[i] = 0; 
            }else if(str.charAt(i-1) == '0' && str.charAt(i) != '0'){
                dp[i] = dp[i-1];
            }else if(str.charAt(i-1) != '0' && str.charAt(i) == '0'){
                if(str.charAt(i-1) == '1' || str.charAt(i-1) == '2'){
                    dp[i] = (i>=2 ? dp[i-2] : 1);
                }else{
                    dp[i] = 0;
                }
            }else{
                if(str.charAt(i-1) == '1' || str.charAt(i-1) == '2'){
                    dp[i] = dp[i-1] + (i>=2 ? dp[i-2]:1);
                }else{
                    dp[i] = dp[i-1];
                }
            }
        }
        System.out.println(dp[str.length()-1]);
    }
}
