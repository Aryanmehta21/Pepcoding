import java.util.*;
public class JobSequencingProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] jobs = new int[n][2];
        for(int i = 0;i<jobs.length;i++){
            for(int j = 0;j<jobs[0].length;j++){
                jobs[i][j] = sc.nextInt();
            }
        }

        int[][] jobsInfo = new int[n][3];
        for(int i = 0;i<jobsInfo.length;i++){
            jobsInfo[i][0] = i;
            jobsInfo[i][1] = jobs[i][0];
            jobsInfo[i][2] = jobs[i][1];
        }

        Arrays.sort(jobsInfo, (a,b) -> Integer.compare(b[2], a[2]));
        List<Integer> list = new ArrayList<>();


        int time = 0;
        for(int i = 0;i<jobsInfo.length;i++){
            if(jobsInfo[i][1] > time){
                list.add(jobsInfo[i][0]);
                time++;
            }
        }
        System.out.println(list.size());

        for(int i : list){
            System.out.print(i + " ");
        }
    }
}
