package CDC;

// public class ServiceLinkedList1 {
    
// }
// Question:
// Consider the arrangement to be in the form of a circular linked list and split it
// accordingly.
// Example:
// Input:
// 5
// 23 45
// Output:
// 5 4 3
// 21
// Explanation:
// If the list has an odd number of values then the first half can have more
// people, so the first half 5,4,3 becomes a group and 2,1 becomes group2.



// You are using Java
import java.util.*;
public class ServiceLinkedList1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            int x = sc.nextInt();
            list.add(x);
        }
        
        for(int i = list.size()-1;i>=list.size()/2;i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("");
        
        for(int i =list.size()/2-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
    }
}