// Question : https://www.hackerearth.com/problem/algorithm/largest-number-10-ca319b09/?source=list_view
import java.util.*;
public class LargestNumber {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int k = sc.nextInt();
        String str = Integer.toString(no);
        String ans = buildLargestNumber(str, k);
        int a = Integer.parseInt(ans);
        System.out.println(a);
        sc.close();
    }
    public static String buildLargestNumber(String number, int k) {
        int n = number.length();
        if (k >= n) {
            return "0";
        }

        StringBuilder result = new StringBuilder(number);
        int i = 0;
        while (k > 0 && i < result.length() - 1) {
            if (result.charAt(i) < result.charAt(i + 1)) {
                result.deleteCharAt(i);
                k--;
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        while (k > 0) {
            result.deleteCharAt(result.length() - 1);
            k--;
        }
        int leadingZeros = 0;
        while (leadingZeros < result.length() - 1 && result.charAt(leadingZeros) == '0') {
            leadingZeros++;
        }
        result.delete(0, leadingZeros);

        return result.toString();
    }
}
