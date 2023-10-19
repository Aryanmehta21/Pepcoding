import java.util.*;

public class fact {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        int fact = 1;
        for(int i =2 ;i<=n;i++){
            fact *= i;
        }

        System.out.println(fact);
        System.out.println(facti(n));
        sc.close();
    }

    public static int factorial(int n){
        if(n==0 || n==1)return 1;
        
        return n*factorial(n-1);
    }

    public static int facti(int n){
        return (n == 0 || n == 1)? 1 : n * facti(n-1);
    }

}