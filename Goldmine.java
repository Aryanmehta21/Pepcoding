import java.util.*;
public class Goldmine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mine = new int[row][col];
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                mine[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[row][col];

        
    }
}