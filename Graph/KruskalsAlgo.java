import java.util.*;

class Edge implements Comparable<Edge> {
    int src, dest, weight;

    Edge(int _src, int _dest, int _wt) {
        this.src = _src;
        this.dest = _dest;
        this.weight = _wt;
    }

    // Comparator function used for
    // sorting edgesbased on their weight
    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
}

public class KruskalsAlgo {

    // If we have to calculate from edges.
    // public static int spanningTree(int V, int E, int[][] edges){
    // // If Edges matrix is given we can easily take out MST using Disjoint set.
    // DisjointSet ds = new DisjointSet(V);
    // Arrays.sort(edges, (a,b) -> Integer.compare(a[2], b[2]));
    // int mstWt = 0;
    // for(int i =0;i<edges.length;i++){
    // int wt = edges[i][2];
    // int u = edges[i][0];
    // int v = edges[i][1];
    // if(ds.findUPar(u) != ds.findUPar(v)){
    // mstWt += wt;
    // ds.unionBySize(u, v);
    // }
    // }
    // return mstWt;
    // }

    // If we have to calculate from Adjacency Matrix.

    public static int spanningTree(int V, int E, int[][] edges) {

        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<ArrayList<Integer>>());
        }

        for (int i = 0; i < E; i++) {
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
        List<Edge> edges1 = new ArrayList<Edge>();
        // O(N + E)
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                int adjNode = adj.get(i).get(j).get(0);
                int wt = adj.get(i).get(j).get(1);
                // int node = i;
                Edge temp = new Edge(i, adjNode, wt);
                edges1.add(temp);
            }
        }
        DisjointSet ds = new DisjointSet(V);
        // M log M
        Collections.sort(edges1);
        int mstWt = 0;
        // M x 4 x alpha x 2
        for (int i = 0; i < edges1.size(); i++) {
            int wt = edges1.get(i).weight;
            int u = edges1.get(i).src;
            int v = edges1.get(i).dest;

            if (ds.findUPar(u) != ds.findUPar(v)) {
                mstWt += wt;
                ds.unionBySize(u, v);
            }
        }

        return mstWt;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        int[][] edges = new int[E][3];
        for (int i = 0; i < E; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
            edges[i][2] = sc.nextInt();
        }
        int sum = spanningTree(V, E, edges);
        System.out.println("sum of MST is:" + sum);
        sc.close();
    }
}
