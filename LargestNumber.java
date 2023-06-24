// Question : https://www.hackerearth.com/problem/algorithm/largest-number-10-ca319b09/?source=list_view
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        long no = sc.nextLong();
        long k = sc.nextLong();
        String str = Long.toString(no);
        String ans = buildLargestNumber(str, k);
        long a = Long.parseLong(ans);
        System.out.println(a);
    }
    public static String buildLargestNumber(String number, long k) {
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
