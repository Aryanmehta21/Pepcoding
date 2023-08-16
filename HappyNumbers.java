import java.util.*;
public class HappyNumbers {

    public static int findSquare(int n){
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans += rem * rem;
            n = n/10;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        while(true){
            int sq = findSquare(n);
            n = sq;
            if(set.contains(sq)){
                System.out.println("false");
                return;
            }else{
                set.add(sq);
            }
            if(set.contains(1)){
                System.out.println("true");
                return;
            }
        }
    }
}
