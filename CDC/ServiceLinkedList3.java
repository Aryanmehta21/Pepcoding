package CDC;

// public class ServiceLinkedList3 {
    
// }


// Question
// Write a program to insert a node in the middle of a doubly linked list.
// Input format :
// The first line of the input consists of the value of n.
// The next input is the linked list of elements separated by a space.
// The third input is the number of elements to be inserted.
// The fourth input is the elements to be inserted, separated by a space.
// Output format :
// The first line of the output prints the original list.
// Next nl lines print the result of each insertion.
// Refer to the sample output for formatting specifications.


// You are using Java
import java.util.*;
class ServiceLinkedList3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            int x = sc.nextInt();
            list.add(x);
        }
        
        int m = sc.nextInt();
        List<Integer> Add = new ArrayList<>();
        for(int i =0;i<m;i++){
            int x = sc.nextInt();
            Add.add(x);
        }
        
        for(int i:list){
            System.out.print(i+" ");
        }
        System.out.println();
        
        for(int i =0;i<Add.size();i++){
            list.add((list.size()+1)/2, Add.get(i));
            for(int j: list){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}