import java.util.*;
public class TwoSum {

    public static int[] sum(int[] arr, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            int ans = target - arr[i];
            if(map.containsKey(ans)){
                result[0] = map.get(ans);
                result[1] = i;
                return result;
            }
            map.put(arr[i], i);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int[] result = sum(arr, target);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}
