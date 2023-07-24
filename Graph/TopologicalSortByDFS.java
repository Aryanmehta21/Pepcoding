import java.util.*;
public class TopologicalSortByDFS {

    public static void dfs(int node, List<Integer> tSort, boolean[] vis, ArrayList<ArrayList<Integer>> gr){
        vis[node] = true;
        for(int ne: gr.get(node)){
            if(!vis[ne]) dfs(ne, tSort, vis, gr);
        }
        tSort.add(node);
    }

    public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> gr){
        boolean[] vis = new boolean[V];
        List<Integer> tSort = new ArrayList<>();
        for(int node = 0;node<V;node++){
            if(!vis[node])dfs(node, tSort, vis, gr);
        }
        Collections.reverse(tSort);
        int[] result = new int[V];
        for(int i =0;i<V;i++){
            result[i] = tSort.get(i);
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int V = sc.nextInt();
        int E = sc.nextInt();
        
        for(int i = 0;i<V;i++){
            list.add(i,new ArrayList<>());
        }
        for(int i = 0;i<E;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            list.get(u).add(v);
        }
        System.out.println(list);
        int[] tSort = topoSort(V, list);
        System.out.print("Topological Sort of the Graph: ");
        for(int i = 0;i<tSort.length;i++){
            System.out.print(tSort[i] + " ");
        }
        sc.close();
    }
}
