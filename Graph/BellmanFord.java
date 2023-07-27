import java.util.*;
public class BellmanFord {

    public static int[] bellmanFord(int V, ArrayList<ArrayList<Integer>> edges, int S){
        int[] dist = new int[V];
        Arrays.fill(dist, (int)1e8);
        dist[S] = 0;

        for(int i = 0;i<V-1;i++){
            for(ArrayList<Integer> it: edges){
                int u = it.get(0);
                int v = it.get(1);
                int w = it.get(2);
                if(dist[u] != 1e8 && dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                }
            }
        }
        for(ArrayList<Integer> it: edges){
            int u = it.get(0);
            int v = it.get(1);
            int w = it.get(2);
            if(dist[u] != 1e8 && dist[u] + w < dist[v]){
                int[] temp = {-1};
                return temp;
            }
        }
        return dist;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();

        for(int i = 0;i<E;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            ArrayList<Integer> t1 = new ArrayList<>();
            t1.add(u);
            t1.add(v);
            t1.add(w);
            edges.add(t1);
        }
        int S = sc.nextInt();

        System.out.println(edges);
        int[] ans = bellmanFord(V, edges, S);
        for(int i: ans)System.out.print(i + " ");
        sc.close();
    }
}
