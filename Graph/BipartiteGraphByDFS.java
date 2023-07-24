import java.util.*;
public class BipartiteGraphByDFS {

    public static boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj){
        int[] color = new int[V];
        Arrays.fill(color, -1);
        for(int i = 0;i<V;i++){
          if(color[i] == -1){
            if(!dfs(i, 0, color, adj))return false;
          }  
        }
        return true;
    }

    public static boolean dfs(int node, int col, int[] color, ArrayList<ArrayList<Integer>> adj){
        color[node] = col;
        for(int it: adj.get(node)){
            if(color[it] == -1){
                if(!dfs(it, 1 - col, color, adj))return false;
            }else if(color[it] == col){
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        ArrayList<ArrayList<Integer>> gr = new ArrayList<>();
        for(int i = 0;i<V;i++){
            gr.add(new ArrayList<>());
        }

        for(int i = 0;i<E;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            gr.get(u).add(v);
            gr.get(v).add(u);
        }
        System.out.println(gr);
        if(isBipartite(V, gr)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        sc.close();
    }
}
