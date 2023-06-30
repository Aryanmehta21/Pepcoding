// You are using Java
import java.util.*;
public class selectionSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for(int i = 0;i<heights.length;i++){
            heights[i] = sc.nextInt();
        }
        
        System.out.print("Student's height order before sorting: ");
        for(int i: heights){
            System.out.print(i + " ");
        }
        
        for(int i = 0;i<heights.length-1;i++){
            int min_idx = i;
            for(int k = i+1;k<heights.length;k++){
                if(heights[k] < heights[min_idx]) min_idx = k;
            }
            
            int temp = heights[min_idx];
            heights[min_idx] = heights[i];
            heights[i] = temp;
            System.out.print( " \n" + "Height order of students after iteration " + (i+1) + ": ");
            for(int j:heights){
                System.out.print(j + " ");
            }
        }
        
        System.out.print("\n" + "After final comparison of all students, the height order becomes: ");
        for(int i : heights){
            System.out.print(i + " ");
        }
        sc.close();
    }
}