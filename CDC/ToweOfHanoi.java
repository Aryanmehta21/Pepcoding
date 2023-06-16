// You are using Java
import java.util.*;
class ToweOfHanoi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String n1 = "Red";
        String n2 = "Blue";
        String n3 = "Pink";
        
        toh(n, n1, n2, n3);
    }
    
    
    public static void toh(int n, String n1, String n2, String n3){
        if(n==0){
            return;
        }
        
        toh(n-1, n1, n3, n2);
        System.out.println("Shift " + n + " from " + n1 + " to " + n2);
        toh(n-1, n3, n2, n1);
    }
}