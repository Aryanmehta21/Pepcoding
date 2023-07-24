// Toggle Kth bit in the given integer.
import java.util.*;
public class ToggleKthBit {
    public static int toggle(int n, int k){
        return (n ^ (1 << k));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(toggle(n, k));
        sc.close();
    }
}
