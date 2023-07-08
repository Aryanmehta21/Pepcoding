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

        ArrayList<Integer> list = new ArrayList<>();
        int maxAct = 1;
        list.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i = 1;i<end.length;i++){
            if(activities[i][1] >= lastEnd){
                maxAct = maxAct + 1;
                list.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Max Activities = " + maxAct);
        for(int i : list){
            System.out.print("A" + i + " ");
        }
        sc.close();
    }
}