import java.util.*;

public class SkipPalindrome {
    public static boolean isPalindrome(int original) {
        String s = Integer.toString(original);
        StringBuilder sb = new StringBuilder(s);
        String temp = sb.reverse().toString();
        int n = Integer.parseInt(temp);
        if (n == original)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();
        while (l <= h) {
            if (isPalindrome(l)) {
                l++;
                continue;
            } else {
                System.out.print(l + " ");
            }
            l++;
        }
        sc.close();
    }
}
