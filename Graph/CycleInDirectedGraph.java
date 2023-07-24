import java.util.*;
public class CycleInDirectedGraph {

    public static boolean cycleInDirectedGraph(int node, ArrayList<ArrayList<Integer>> gr, boolean[]visited, boolean[] pathVisited){
        visited[node] = true;
        pathVisited[node] = true;
        for(int child: gr.get(node)){
            if(!visited[child]){
                if(cycleInDirectedGraph(child, gr, visited, pathVisited))return true;
            }else if(pathVisited[child]){
                return true;
            }
        }
        pathVisited[node] = false;
        return false;
    }

    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> gr){
        boolean[] visited = new boolean[V];
        boolean[] pathVisited = new boolean[V];
        for(int i = 0;i<V;i++){
            if(!visited[i]){
               if(cycleInDirectedGraph(i, gr, visited, pathVisited))return true; 
            }
        }
        return false;
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
        if(isCycle(V, list)){
            System.out.println("Cycle Exists in Graph");
        }else{
            System.out.println("No Cycle Exists");
        }
        sc.close();
    }
}