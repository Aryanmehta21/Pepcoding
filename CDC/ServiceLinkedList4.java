package CDC;

// public class ServiceLinkedList4 {
    
// }


// Question
// Single File Programming Question
// Write a program to find the nth node of all unique numbers in the linked list L.
// Example:
// Input:
// 5
// 12 34 89 54 67
// 3
// Output:
// 89
// Explanation:
// Print the third element in the linked list.


// You are using Java
import java.util.*;
class ServiceLinkedList4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            int x = sc.nextInt();
            list.add(x);
        }
        
        int node = sc.nextInt();
        
        System.out.println(list.get(node-1));
    }
}