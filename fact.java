import java.util.*;

public class fact {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }

    public static int factorial(int n){
        if(n==0 || n==1)return 1;
        
        return n*factorial(n-1);
    }

}