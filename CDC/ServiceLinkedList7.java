package CDC;

// public class ServiceLinkedList7 {
    
// }


// Question
// game by creating a circle and pronuncing something in numbers that they
// would like. The main task of the game is to select one student from a given
// position and pronounce something and then the turn of the next student and
// so on till one before the selected student.
// Write a program to print the link list created from the given position.
// Example:
// Input:
// 5
// 10 20 30 40 50
// 4
// Output:
// 40 50 10 20 30

// You are using Java
import java.util.*;
class ServiceLinkedList7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            int x = sc.nextInt();
            list.add(x);
        }
        int t = sc.nextInt();
        
        List<Integer> ans = new ArrayList<>();
        for(int i =t-1;i<list.size();i++){
            ans.add(list.get(i));
        }
        
        for(int i=0;i<t-1;i++){
            ans.add(list.get(i));
        }
        
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}