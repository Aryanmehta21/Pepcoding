// Topological Sort by BFS(Intutive) Mostly preferred...
import java.util.*;
public class TopologicalSort {

    public static int[] tSort(int V, ArrayList<ArrayList<Integer>> gr){
        int[] indegree = new int[V];
        for(int node = 0; node < V; node++){
            for(int ne : gr.get(node)){
                indegree[ne]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int node = 0; node < V; node++){
            if(indegree[node] == 0)q.offer(node);
        }
        int[] toSort = new int[V];
        int i = 0;
        while(!q.isEmpty()){
            int sz = q.size();
            while(sz-- > 0){
                int node = q.poll();
                toSort[i++] = node;
                for(int ne : gr.get(node)){
                    indegree[ne]--;
                    if(indegree[ne] == 0)q.offer(ne);
                }
            }
        }
        return toSort;
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
        int[] topoSort = tSort(V, list);
        System.out.print("Topological Sort of the Graph: ");
        for(int i = 0;i<topoSort.length;i++){
            System.out.print(topoSort[i] + " ");
        }
        sc.close();
    }
}
