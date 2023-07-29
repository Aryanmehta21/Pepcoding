import java.util.*;

// class Pair{
//     int distance;
//     int node;
//     public Pair(int distance, int node){
//         this.distance = distance;
//         this.node = node;
//     }
// }

public class DijkstraAlgo {

    public static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S){
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y) -> x.distance - y.distance);
        int[] dist = new int[V];
        Arrays.fill(dist, (int)1e9);
        dist[S] = 0;

        pq.add(new Pair(0,S));
        while(pq.size() != 0){
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            for(int i = 0;i<adj.get(node).size();i++){
                int edgeWeight = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);

                if(dis + edgeWeight < dist[adjNode]){
                    dist[adjNode] = dis + edgeWeight;
                    pq.add(new Pair(dist[adjNode], adjNode));
                }
            }
        }
        return dist;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for(int i =0;i<V;i++){
            adj.add(new ArrayList<ArrayList<Integer>>());
        }

        for(int i = 0; i<E;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            ArrayList<Integer> t1 = new ArrayList<>();
            ArrayList<Integer> t2 = new ArrayList<>();

            t1.add(v);
            t1.add(w);
            t2.add(u);
            t2.add(w);
            adj.get(u).add(t1);
            adj.get(v).add(t2);
        }
        int S = sc.nextInt();
        System.out.println(adj);
        int[] ans = dijkstra(V, adj, S);
        for(int i: ans){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
