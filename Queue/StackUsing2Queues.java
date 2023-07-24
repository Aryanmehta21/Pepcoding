import java.util.*;
public class StackUsing2Queues {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        static void push(int data){
            while(!q1.isEmpty()){
                q2.add(q1.remove());
            }
            q1.add(data);
            while(!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }

        static int pop(){
            return q1.remove();
        }

        static int peek(){
            return q1.peek();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int x = sc.nextInt();
            s.push(x);
        }
        System.out.println(s.isEmpty());
        System.out.println("Peek = " + s.peek());

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
        sc.close();
    }
}