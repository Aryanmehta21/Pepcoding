import java.util.*;
public class DetectCycleInDirectedGraphTopoSort {

    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> gr){
        int[] indegree = new int[V];
        for(int node = 0;node<V;node++){
            for(int ne : gr.get(node)){
                indegree[ne]++;
            }
        }
        Queue<Integer> q= new LinkedList<>();
        for(int node = 0;node<V;node++){
            if(indegree[node] == 0)q.offer(node);
        }
        int tSort[] = new int[V];
        int i = 0;
        while(!q.isEmpty()){
            int sz = q.size();
            while(sz-- > 0){
                int node = q.poll();
                tSort[i++] = node;
                for(int ne : gr.get(node)){
                    if(indegree[ne] == 0)q.offer(ne);
                }
            }
        }
        return (i != V);
    }

    public static void main(String[]args){
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
        if(isCyclic(V, list)){
            System.out.println("Cycle Exists in Graph");
        }else{
            System.out.println("No Cycle Exists");
        }
        sc.close();
    }
}
