import java.util.*;

public class print_inc {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
        sc.close();
    }

    public static void printIncreasing(int n){
        if(n == 0){
            return;
        }
        
        printIncreasing(n-1);
        System.out.println(n);
    }

}