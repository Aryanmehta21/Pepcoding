import java.util.*;
public class DFS {
    public static void addEdge(List<List<Integer>> gr, int src, int des){
        gr.get(src).add(des);
        gr.get(des).add(src);
    }
    public static void dfs(int src, List<Integer> vis, List<List<Integer>> gr){
        vis.set(src, 1);
        System.out.print(src + " ");
        for(int child: gr.get(src)){
            if(vis.get(child) == 0){
                dfs(child, vis, gr);
                // System.out.print(child + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();
        // int m = sc.nextInt();
        List<List<Integer>> gr = new ArrayList<>(vertex);
        for(int i = 0;i<=vertex;i++){
            gr.add(new ArrayList<>());
        }
        for(int i = 0;i<=vertex;i++){
            int src = sc.nextInt();
            int des = sc.nextInt();
            addEdge(gr, src, des);
        }
        List<Integer> vis = new ArrayList<>();
        for(int i = 0;i<=vertex;i++){
            vis.add(0);
        }
        System.out.println("DFS");
        dfs(1, vis, gr);
        sc.close();
    }
}
