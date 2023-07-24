import java.util.*;
public class CycleInGraph {

    public static boolean cycleInUndirectedGraph(int node, List<List<Integer>> gr, boolean[] vis, int par){
        vis[node] = true;
        for(int child : gr.get(node)){
            if(!vis[child]){
                if(cycleInUndirectedGraph(child, gr, vis, node))return true;
            }else if(gr.get(node).get(child) != par){
                return true;
            }
        }
        return false;
    }

    public static void dfs(int src, List<Integer> vis, List<List<Integer>> gr){
        vis.set(src, 1);
        System.out.print(src + " ");
        for(int child: gr.get(src)){
            if(vis.get(child) == 0){
                dfs(child, vis, gr);
                // System.out.print(child + " ");
            }
        }
    }
 
    public static boolean isCycle(int V, List<List<Integer>> gr){
        boolean[] vis = new boolean[V];
        for(int node = 0;node<V;node++){
            if(!vis[node]){
                if(cycleInUndirectedGraph(node, gr, vis, -1))return true;
            }
        }
        return false;
    }

    public static void addEdge(List<List<Integer>> gr, int src, int des){
        gr.get(src).add(des);
        gr.get(des).add(src);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();
        // int m = sc.nextInt();
        List<List<Integer>> gr = new ArrayList<>(vertex);
        for(int i = 0;i<=vertex;i++){
            gr.add(new ArrayList<>());
        }
        for(int i = 1;i<=vertex;i++){
            int src = sc.nextInt();
            int des = sc.nextInt();
            addEdge(gr, src, des);
        }
        List<Integer> vis = new ArrayList<>();
        for(int i = 0;i<=vertex;i++){
            vis.add(0);
        }
        dfs(1, vis, gr);
        System.out.println("\n" + gr);
        if(isCycle(vertex, gr)){
            System.out.println("Cycle Exists in graph");
        }else{
            System.out.println("No cycle exists in graph");
        }
        sc.close();
    }
}
