import java.util.*;

public class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Long[] arr = new Long[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextLong();
        }

        HashMap<Long, Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        int maxCount = 0;
        int favoriteSingers = 0;

        for (int count : map.values()) {
            if (count > maxCount) {
                maxCount = count;
                favoriteSingers = 1;
            } else if (count == maxCount) {
                favoriteSingers++;
            }
        }

        System.out.println(favoriteSingers);
        sc.close();
    }
}
