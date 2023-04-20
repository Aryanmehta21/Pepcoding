package CDC;

// public class ServiceLinkedList5 {
    
// }


// Question
// Write a program that inputs a positive integer N (N › 0), input N integers
// twice, and store and print the product Ist * (N + 1)th, 2nd * (N + 2)nd ... of
// corresponding input elements of both sets in sequence using a LinkedList
// implementation of the queue for efficient storage.
// Input a positive integer N, N > 0
// Input the first set of N integers
// Input the second set of integers
// Compute the product of corresponding elements of the 2 sets in sequence,
// store in a single queue, and print.
// Input format :
// The first line of input is the number of elements in a set, N.
// The next input is the first set of N elements on a separate line.


// You are using Java
import java.util.*;
class ServiceLinkedList5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        for(int i =0;i<n;i++){
            int x = sc.nextInt();
            list1.add(x);
        }
        for(int i =0;i<n;i++){
            int x = sc.nextInt();
            list2.add(x);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(list1.get(i) * list2.get(i));
        }
        System.out.println(ans);
    }
}