import java.util.*;
public class IslandPerimeter {
    
    public static int islandPerimeter(int[][] grid){
        int m = grid.length, n = grid[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 1){
                    return getPerimeter(grid, i, j);
                }
            }
        }
        return 0;
    }

    public static int getPerimeter(int[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)return 1;

        if(grid[i][j] == -1)return 0;

        int count = 0;
        grid[i][j] = -1;

        count += getPerimeter(grid, i+1, j);
        count += getPerimeter(grid, i-1, j);
        count += getPerimeter(grid, i, j+1);
        count += getPerimeter(grid, i, j-1);


        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        int[][] edges = new int[V][E];

        for(int i = 0;i<V;i++){
            for(int j = 0;j<E;j++){
                edges[i][j] = sc.nextInt();
            }
        }

        System.out.println(islandPerimeter(edges));
        sc.close();
    }
}
