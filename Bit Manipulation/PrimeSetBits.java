// if the number of set bits is prime print yes else print no.
import java.util.*;
public class PrimeSetBits {
    public static boolean isPrime(int n){
        if(n==1 || n==0) return false;
        for(int i = 2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n != 0){
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }

        if(isPrime(count)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
