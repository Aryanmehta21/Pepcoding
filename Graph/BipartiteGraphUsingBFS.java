import java.util.*;
public class BipartiteGraphUsingBFS {

    public static boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj){
        int[] color = new int[V];
        Arrays.fill(color, -1);
        for(int i = 0;i<V;i++){
            if(color[i] == -1){
                if(!check(i, V, adj, color))return false;
            }
        }
        return true;
    }

    public static boolean check(int start, int V, ArrayList<ArrayList<Integer>> adj, int[] color){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            for(int it : adj.get(node)){
                if(color[it] == -1){
                    color[it] = 1 - color[node];
                    q.add(it);
                }else if(color[it] == color[node]){
                    return false;
                }
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
