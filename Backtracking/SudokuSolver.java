// You are using Java
import java.util.*;
public class SudokuSolver {
    static int N = 9;
    public static boolean solve(int[][] grid, int row, int col){
        if(row == N -1 && col == N)return true;
        if(col == N){
            row++;
            col = 0;
        }
        if(grid[row][col] != 0)return solve(grid, row, col + 1);
        for(int num = 1;num<10;num++){
            if(isSafe(grid, row, col, num)){
                grid[row][col] = num;
                if(solve(grid, row, col + 1))return true;
            }
            grid[row][col] = 0;
        }
        return false;
    }
    public static boolean isSafe(int[][] grid, int row, int col, int num){
        for(int x =0 ;x<=8;x++){
            if(grid[row][x] == num)return false;
        }
        for(int x = 0;x<=8;x++){
            if(grid[x][col] == num)return false;
        }
        int startRow = row - row % 3, startCol = col - col %3;
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                if(grid[i + startRow][j + startCol] == num)return false;
            }
        }
        return true;
    }
    
    public static boolean isPossible(char[][] board, int row, int col, char c){
        for(int i =0;i<9;i++){
            if(board[i][col]==c)return false;
            if(board[row][i]==c)return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c)return false;
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        if(solve(arr,0,0)){
            for(int i = 0;i<arr.length;i++){
                for(int j = 0;j<arr[0].length;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }else{
            System.out.println("No Solution exists");
        }

        sc.close();
    }
}
