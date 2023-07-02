import java.util.*;
public class ShortestStringSubsequence {
    public static int lengthOfString(String text1, String text2){
        int lcs = LCS(text1, text2);
        return text1.length() + text2.length() - lcs;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();


        System.out.println(lengthOfString(str1, str2));
    }
}
