import java.util.*;
import java.util.LinkedList;
public class FirstNonRepeating {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
        }
    }
}
