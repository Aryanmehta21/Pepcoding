import java.util.*;
import java.util.LinkedList;
public class InterleaveHalfQueue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<n;i++){
            int x = sc.nextInt();
            q.add(x);
        }
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size()/2;
        for(int i=0;i<size;i++){
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        sc.close();
    }
}
