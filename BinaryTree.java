// You are using Java
import java.util.*;
class Node{
    int value;
    Node left;
    Node right;
    
    Node(int value){
        this.value = value;
        right = null;
        left = null;
    }
}
public class BinaryTree{
    static Node root;
    static Node addRecursive(Node current, int value){
        if(current == null){
            return new Node(value);
        }
        
        if(value<current.value){
            current.left = addRecursive(current.left, value);
        }else if(value>current.value){
            current.right = addRecursive(current.right, value);
        }else{
            return current;
        }
        
        return current;
    }
    
    public static void add(int value){
        root = addRecursive(root,value);
    }
    public static void traversePostOrder(Node node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            Node root = new Node(n);
            if(n>0){
                add(n);
            }else{
                break;
            }
        }
        traversePostOrder(root);
        sc.close();
    }
}
