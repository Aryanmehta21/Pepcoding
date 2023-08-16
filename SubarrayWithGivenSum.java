
// You are using Java
import java.util.*;
public class SubarrayWithGivenSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int left = 0;
        int right = 0;
        int currSum = 0;
        while(left < n && right < n){
            if(currSum < sum){
                currSum += arr[right];
                right++;
            }else if(currSum > sum){
                currSum -= arr[left];
                left++;
            }else if(currSum == sum){
                System.out.print(left+1 + " " + right);
                return;
            }
        }
        System.out.println(-1);
    }
}
