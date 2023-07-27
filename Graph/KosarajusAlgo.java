import java.util.*;
public class KosarajusAlgo {

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, Stack<Integer> st){
        vis[node] = 1;
        for(int it : adj.get(node)){
            if(vis[it]==0)dfs(it, adj, vis, st);
        }
        st.push(node);
    }

    private static void dfs3(int node, ArrayList<ArrayList<Integer>> adjT, int[] vis){
        vis[node] = 1;
        for(int it: adjT.get(node)){
            if(vis[it] == 0)dfs3(it, adjT, vis);
        }
    }

    public static int kosaraju(int V, ArrayList<ArrayList<Integer>> adj){
        int[] vis = new int[V];
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<V;i++){
            if(vis[i] == 0) dfs(i, adj, vis, st);
        }

        ArrayList<ArrayList<Integer>> adjT = new ArrayList<>();
        for(int i = 0;i<V;i++){
            adjT.add(new ArrayList<>());
        }

        for(int i=0;i<V;i++){
            vis[i] = 0;
            for(int it: adj.get(i)){
                adjT.get(it).add(i);
            }
        }

        int scc = 0;
        while(!st.isEmpty()){
            int node = st.peek();
            st.pop();
            if(vis[node] == 0){
                scc++;
                dfs3(node, adjT, vis);
            }
        }
        return scc;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<V;i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int i =0;i<E;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
        }
        System.out.println(adj);
        System.out.println(kosaraju(V, adj));
        sc.close();
    }
}
