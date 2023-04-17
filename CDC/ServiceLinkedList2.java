package CDC;

// public class ServiceLinkedList2 {
    
// }


// Question
// linked list and deletes those nodes which have a greater value on their right
// side.
// Note: The final linked list should be formed in the reverse order of the given
// input integers. For a better understanding refer to the sample input and
// output.
// Example:
// Input:
// 5
// 32 6 5 11
// Output:
// 11 5 6 2 3
// 11 6 3


// You are using Java
import java.util.*;
class ServiceLinkedList2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            int x = sc.nextInt();
            list.add(x);
        }
        Collections.reverse(list);
        // for(int i =list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println("");
        
        // for(int i =0;i<list.size()-1;i++){
        //     if(list.get(i)<list.get(i+1)){
        //         list.remove(i);
        //     }
        // }
        
        // for(int i:list){
        //     System.out.print(i + " ");
        // }
        // for(int i =list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i)+" ");
        // }
        for(int i:list){
            System.out.print(i+" ");
        }
        
        System.out.println();
        
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i+1)>list.get(i)){
                list.remove(list.get(i));
            }
        }
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}