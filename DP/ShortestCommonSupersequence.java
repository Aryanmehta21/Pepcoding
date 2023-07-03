import java.util.*;
public class ShortestCommonSupersequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(shortestCommonSupersequence(str1, str2));
        sc.close();
    }
}
