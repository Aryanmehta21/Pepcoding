import java.util.*;
class Pair {
    int node;
    int distance;
    public Pair(int distance, int node){
        this.node = node;
        this.distance = distance;
    }
}
public class PrimsAlgo {

    public static int spanningTree(int V, int E, int[][] edges){
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for(int i = 0;i<V;i++){
            adj.add(new ArrayList<ArrayList<Integer>>()); 
        }

        for(int i= 0;i<E;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];

            ArrayList<Integer> tmp1 = new ArrayList<>();
            ArrayList<Integer> tmp2 = new ArrayList<>();
            tmp1.add(v);
            tmp1.add(w);

            tmp2.add(u);
            tmp2.add(w);
            adj.get(u).add(tmp1);
            adj.get(v).add(tmp2);
        }

        int sum = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y) -> x.distance - y.distance); //Sorted on the basis of weights b/w two nodes.

        int[] vis = new int[V];
        pq.add(new Pair(0, 0));
        while(pq.size() > 0){      //BFS
            int wt = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();
            if(vis[node] == 1)continue;
            vis[node] = 1;
            sum += wt;

            for(int i =0;i<adj.get(node).size();i++){
                int edW = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);
                if(vis[adjNode] == 0){
                    pq.add(new Pair(edW, adjNode));
                }
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        int[][] edges = new int[E][3];
        for(int i =0;i<E;i++){
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
            edges[i][2] = sc.nextInt();
        }
        int sum = spanningTree(V, E, edges);
        System.out.println("sum of MST is:" + sum);
        sc.close();
    }
}
