import java.util.*;
public class TCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int row = sc.nextInt();
        int[][] range = new int[row][2];
        for(int i=0;i<range.length;i++){
            for(int j=0;j<range[0].length;j++){
                range[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for(int i =0;i<range.length;i++){
            for(int j =0;j<arr.length;j++){
                if(arr[j]> range[i][0] && arr[j]<range[i][1]){
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
        sc.close();
    }
}
