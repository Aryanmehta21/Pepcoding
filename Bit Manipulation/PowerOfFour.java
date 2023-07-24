import java.util.*;
public class PowerOfFour {
    public static boolean isPower(int n){
        return n>0 && (n&(n-1)) == 0 && (n%3) == 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPower(n));
        sc.close();
    }
}
