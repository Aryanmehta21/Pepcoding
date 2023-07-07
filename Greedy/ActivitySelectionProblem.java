import java.util.*;
public class ActivitySelectionProblem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end= new int[n];
        for(int i = 0;i<start.length;i++){
            start[i] = sc.nextInt();
        }
        for(int i = 0;i<end.length;i++){
            end[i] = sc.nextInt();
        }
    }
}