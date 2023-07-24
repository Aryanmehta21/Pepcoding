import java.util.*;
public class QueueUsing2Stacks {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        static boolean isEmpty(){
            return s1.isEmpty();
        }
        static void push(int data){
            s1.push(data);
        }

        static int pop(){
            while(!s1.empty()){
                s2.push(s1.pop());
            }
            int ans = s2.pop();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return ans;
        }

        static int peek(){
            while(!s1.empty()){
                s2.push(s1.pop());
            }
            int ans = s2.peek();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return ans;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        System.out.println(q.isEmpty());
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int x = sc.nextInt();
            q.push(x);
        }
        System.out.println(q.isEmpty());
        System.out.println("peek = " + q.peek());
        while(!q.isEmpty()){
            System.out.println(q.pop() + " ");
        }
        System.out.println(q.isEmpty());
        sc.close();
    }
}