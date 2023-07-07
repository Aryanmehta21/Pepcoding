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


        int[][] activities = new int[start.length][3];
        for(int i =0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i]; 
        }


        Arrays.sort(activities, (a,b) -> Integer.compare(a[2], b[2]));
    }
}