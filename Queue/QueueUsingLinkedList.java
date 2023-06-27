import java.util.*;
public class QueueUsingLinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    class Queue{
        public static Node head, tail = null;
        
        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        
    }
    public static void main(String[] args){

    }
}
