import java.util.*;
public class QueueUsingLinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue{
        public static Node head, tail = null;
        
        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue!");
                return -1;
            }
            int front = head.data;
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
            }
            return front;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        System.out.println(q.isEmpty());
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int x = sc.nextInt();
            q.add(x);
        }
        System.out.println(q.isEmpty());

        while(!q.isEmpty()){
            System.out.print(q.remove() + " ");
        }
        sc.close();
    }
}
