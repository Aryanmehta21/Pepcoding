package CDC;

// public class ServiceLinkedList8 {
    
// }

// Question
// Single File Programming Question
// Write a program to reverse all the values in the linked list and swap the nodes
// a and b of a linked list rather than swapping the field from the nodes.
// Example:
// Input:
// 10
// 99 64 84 79 61 62 89 63 67 74
// 84 62
// Output:
// 74 67 63 89 84 61 79 62 64 99


// You are using Java
import java.util.*;
class ServiceLinkedList8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            list.add(x);
        }
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i) == a){
                list.add(i,b);
            }else if(list.get(i) == b){
                list.add(i,a);
            }
            
            System.out.print(list.get(i) + " ");
        }
    }
}