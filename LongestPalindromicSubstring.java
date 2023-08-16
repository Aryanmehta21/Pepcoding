import java.util.*;
public class LongestPalindromicSubstring {

    public static int expandFromCenter(String s, int i, int j){
        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return j - i - 1;
    }

    public static String lps(String str){
        int start = 0;
        int end = 0;
        int n = str.length();
        for(int i = 0; i < n; i++){
            int len1 = expandFromCenter(str, i, i+1);
            int len2 = expandFromCenter(str, i, i);
            int len = Math.max(len1, len2);
            if(end - start < len){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return str.substring(start, end+1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lps(s));
        sc.close();
    }
}
