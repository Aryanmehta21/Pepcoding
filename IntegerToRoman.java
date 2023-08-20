import java.util.*;
public class IntegerToRoman {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] IntegerValue = {5000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] Roman = {"H", "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String ans = "";
        for(int i = 0;i<IntegerValue.length;i++){
            while(n >= IntegerValue[i]){
                ans += Roman[i];
                n -= IntegerValue[i];
            }
        }

        System.out.println(ans);
    }
}
