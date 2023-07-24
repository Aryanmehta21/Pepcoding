import java.util.*;
public class Multiply{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        while(b>0){
            if((b & 1) != 0){
                result += a; 
            }

            a = a << 1; // a = a*2;
            b = b >> 1; // b = b/2;
        }
        System.out.println(result);
        sc.close();
    }
}