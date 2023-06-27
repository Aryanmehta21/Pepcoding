import java.util.*;
public class StackUsing2Queues {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

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

    }
}
