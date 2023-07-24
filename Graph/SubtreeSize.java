import java.util.*;
public class SubtreeSize {
    public static void addEdge(List<List<Integer>> gr, int src, int des){
        gr.get(src).add(des);
        gr.get(des).add(src);
    }
    public static int dfs(int src, List<Integer> vis, List<List<Integer>> gr, List<Integer> subSize){
        vis.set(src, 1);
        int curSize = 1;
        for(int child : gr.get(src)){
            if(vis.get(child) == 0){
                curSize += dfs(child, vis, gr, subSize);
            }
        }
        subSize.set(src, curSize);
        return curSize;
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
        List<Integer> subSize = new ArrayList<>();
        for(int i = 0;i<=vertex;i++){
            subSize.add(0);
        }
        System.out.println(gr);
        System.out.print("Subtree Size: " + dfs(1, vis, gr, subSize));
        sc.close();
    }
}
