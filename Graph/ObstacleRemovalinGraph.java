import java.util.*;
public class ObstacleRemovalinGraph {
    private static int[] d = {-1, 0, 1, 0, -1};
    public static int minimumObstacle(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        grid[0][0] = -1;
        int step = 0;
        while(!q.isEmpty()){
            Queue<int[]> q2 = new LinkedList<>();
            while(!q.isEmpty()){
                int[] node = q.poll();
                if(node[0] == m-1 && node[1] == n-1)return step;
                for(int k = 0;k<4;++k){
                    int x = node[0] + d[k];
                    int y = node[1] + d[k+1];
                    if(x >= 0 && x < m && y >= 0 && y < n && grid[x][y] != -1){
                        if(grid[x][y] == 0){
                            q.offer(new int[]{x, y});
                        }else{
                            q2.offer(new int[]{x, y});
                        }
                        grid[x][y] = -1;
                    }
                }
            }
            q = q2;
            step++;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        int[][] grid = new int[V][E];
        for(int i = 0; i < V; i++){
            for(int j = 0; j < E; j++){
                grid[i][j]=sc.nextInt();
            }
        }
        System.out.println(minimumObstacle(grid));
        sc.close();
    }
}
