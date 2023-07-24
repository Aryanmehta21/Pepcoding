/*Example:
Input:
5
1 2 3 4 5
10
Output:
11
Explanation:
1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 11 = 10
ll has to be inserted in the given array to make an XOR sum of 10.
*/
import java.util.*;

public class InsertNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        int xor = arr[0];
        for(int i = 1;i<arr.length;i++){
            xor = xor ^ arr[i];
        }

        System.out.println(sum ^ xor);
        sc.close();
    }
}
