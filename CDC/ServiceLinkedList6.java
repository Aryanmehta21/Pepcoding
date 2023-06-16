// package CDC;

// public class ServiceLinkedList6 {
    
// }

// Question
// Write a program to print the middle element of the Doubly linked list.
// Input format :
// The first line of the input consists of the number of elements in the list.
// The next input is the list of elements.
// Refer to the sample input for formatting specifications.
// Output format :
// The first line of the output prints the given list.
// The next line prints the middle element.
// Refer to the sample output for formatting specifications


// You are using Java
import java.util.*;
class ServiceLinkedList6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            list.add(x);
        }
        
        for(int i:list){
            System.out.print(i+" ");
        }
        System.out.println();
        
        if(list.size() % 2==0){
            System.out.print(list.get(list.size()/2-1) + " " + list.get(list.size()/2));
        }else{
            System.out.print(list.get(list.size()/2));
        }
    }
}