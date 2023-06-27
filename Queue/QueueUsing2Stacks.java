import java.util.*;
public class QueueUsing2Stacks {
    class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();


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

        }
    }
    public static void main(String[] args){
        
    }
}
