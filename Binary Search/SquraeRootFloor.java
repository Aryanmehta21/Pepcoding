import java.util.*;
public class SquraeRootFloor {
    public static int sqrt(int x){
        int min = 1;
        int max = x;
        int ans = -1;
        while(min <= max){
            int mid = min + (max - min)/2;
            int msqrt = mid * mid;
            if(msqrt == x){
                return mid;
            }else if(msqrt > x){
                max = mid - 1;
            }else{
                min = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sqrt(n));
        sc.close();
    }
}
