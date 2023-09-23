import java.util.*;
public class reverseWordsInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        for(int i = 0;i<s.length();i++){
            StringBuilder sb = new StringBuilder();
            while(i < s.length() && s.charAt(i) != ' '){
                sb.append(s.charAt(i));
                i++;
            }
            // Reverse word in String I am aryan will be made aryan am I
            if(sb.length() != 0){
                ans = " " + sb + ans;
            }
            // Reverse letters of each word in a String Hi I am Aryan will be made iH I ma nayrA.
            if(sb.length() != 0){
                ans = ans + " " + sb.reverse();
            }
        }

        System.out.println(ans.substring(1));
        sc.close();
    }
}
