import java.util.*;
public class ArticulationPoint {

    private static int timer = 1;
    private static void dfs(int node, int parent, int[] vis, int[]tin, int[] low, int[] mark, ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        low[node] = tin[node] = timer;
        timer++;
        int child = 0;
        for(int it: adj.get(node)){
            if(it == parent) continue;
            if(vis[it] == 0){
                dfs(it, node, vis, tin, low, mark, adj);
                low[node] = Math.min(low[it], low[node]);
                if(low[it] >= tin[node] && parent != -1){
                    mark[node] = 1;
                }
                child++;
            }else{
                low[node] = Math.min(low[node], tin[it]);
            }

        }
        if(child > 1 && parent == -1){
            mark[node] = 1;
        }
    }
    public static ArrayList<Integer> articulationPoints(int n, ArrayList<ArrayList<Integer>> adj){
        int[] vis = new int[n];
        int[] tin = new int[n];
        int[] low = new int[n];
        int[] mark = new int[n];

        for(int i =0;i<n;i++){
            if(vis[i] == 0){
                dfs(i, -1, vis, tin, low, mark, adj);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(mark[i] == 1){
                ans.add(i);
            }
        }
        if(ans.size() == 0)ans.add(-1);
        
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] edges = new int[n][2];
        for(int i =0;i<edges.length;i++){
            for(int j = 0;j<edges[0].length;j++){
                edges[i][j] = sc.nextInt();
            }
        }

        ArrayList<ArrayList<Integer>> connections = new ArrayList<>();
        for(int i = 0;i<n;i++){
            connections.add(new ArrayList<Integer>());
        }

        for(int i =0;i<n;i++){
            connections.get(i).add(edges[i][0]);
            connections.get(i).add(edges[i][1]);
        }
        System.out.println(connections);
        System.out.println(articulationPoints(n, connections));
        sc.close();
    }
}
