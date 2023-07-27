import java.util.*;
public class BridgesInGraph {
    private static int timer = 1;
    private static void dfs(int node, int parent, int[] vis, ArrayList<ArrayList<Integer>> adj, int[] tin, int[] low, List<List<Integer>> bridges){
        vis[node] = 1;
        tin[node] = low[node] = timer;
        timer++;

        for(int it: adj.get(node)){
            if(it == parent)continue;
            if(vis[it] == 0){
                dfs(it, node, vis, adj, tin, low, bridges);
                low[node] = Math.min(low[node], low[it]);
                if(low[it] > tin[node]){
                    bridges.add(Arrays.asList(it, node));
                }
            }
            else{
                low[node] = Math.min(low[node], low[it]);
            }
        }
    }
    public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(List<Integer> it : connections){
            int u = it.get(0); 
            int v = it.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        // System.out.println(adj);

        int[] vis = new int[n];
        int[] tin = new int[n];
        int[] low = new int[n];
        List<List<Integer>> bridges = new ArrayList<>();
        dfs(0, -1, vis, adj, tin, low, bridges);
        return bridges;
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

        List<List<Integer>> connections = new ArrayList<>();
        for(int i = 0;i<n;i++){
            connections.add(new ArrayList<Integer>());
        }

        for(int i =0;i<n;i++){
            connections.get(i).add(edges[i][0]);
            connections.get(i).add(edges[i][1]);
        }
        System.out.println(connections);
        System.out.println(criticalConnections(n, connections));
        sc.close();
    }
}
