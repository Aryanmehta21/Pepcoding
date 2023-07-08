import java.util.*;
public class MaximumLengthOfChain {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] pairs = new int[n][2];
        for(int i = 0;i<pairs.length;i++){
            for(int j = 0;j<pairs[0].length;j++){
                pairs[i][j] = sc.nextInt();
            }
        }

        Arrays.sort(pairs, (a,b) -> Integer.compare(a[1], b[1]));    //Sorting on the basis of first column. Lambda Function in java

        int chainLen = 1;
        int chainEnd = pairs[0][1];

        for(int i =1;i<pairs.length;i++){
            if(pairs[i][0] >= chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("Max Length of the chain: " + chainLen);
    } 
}
