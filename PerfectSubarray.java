import java.util.*;

public class PerfectSubarray {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    // System.out.print(arr[k] + " ");
                }
                if (isPerfectSquare(sum)) {
                    list.add(sum);
                }
                // System.out.println();
                sum = 0;
            }
        }
        System.out.println(Arrays.asList(list));
        System.out.println(list.size());
        sc.close();
    }

    public static boolean isPerfectSquare(int x) {
        if (x >= 0) {
            int sr = (int) Math.sqrt(x);
            return ((sr * sr) == x);
        }
        return false;
    }
}
