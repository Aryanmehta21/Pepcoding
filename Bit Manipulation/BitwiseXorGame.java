import java.util.*;
public class BitwiseXorGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int x = 0;
        for(int i = 0; i<arr.length;i++){
            x ^= arr[i];
        }
        if(x == 0 || arr.length%2 == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        sc.close();
    }
}