import java.util.*;
public class FloydWarshall {

    public static void shortestDistance(int[][] matrix){
        int n = matrix.length;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = (int)1e9;
                }
                if(i == j)matrix[i][j] = 0;
            }
        }

        for(int k = 0;k<n;k++){
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                }
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j] == 1e9){
                    matrix[i][j] = -1;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        shortestDistance(matrix);
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
