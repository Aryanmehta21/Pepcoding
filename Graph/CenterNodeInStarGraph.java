// Leetcode - 1791
import java.util.*;
public class CenterNodeInStarGraph {

    public static int findCenter(int[][] edges){
        int n = edges.length + 1;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0;i<n-1;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        System.out.println(adj);

        Queue<Integer> q = new LinkedList<>();
        q.offer(edges[0][0]);
        while(!q.isEmpty()){
            int currNode = q.poll();
            int countAdj = 0;
            for(int adjNode : adj.get(currNode)){
                q.offer(adjNode);
                countAdj++;
            }
            if(countAdj == n-1){
                return currNode;
            }
        }
        return -1;
    }  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int[][] edges = new int[V][2];
        for(int i = 0 ;i<V;i++){
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }
        System.out.println(findCenter(edges));
        sc.close();
    }
}