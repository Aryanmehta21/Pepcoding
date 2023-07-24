import java.util.Scanner;

public class Knapsack {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        /*if (n <= 0) {
            System.out.println("Invalid input. Number of objects must be greater than 0.");
            scanner.close();
            return;
        }*/
        
        int p[] = new int[n];
        int w[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }
        
        int W = scanner.nextInt();
        
       /* if (W < 0) {
            System.out.println("Invalid input. Knapsack capacity cannot be negative.");
            scanner.close();
            return;
        }*/

        int cur_w;
        float tot_v = 0;
        int i, maxi;
        int used[] = new int[n];
        
        for (i = 0; i < n; ++i)
            used[i] = 0;
        
        cur_w = W;
        
        while (cur_w > 0) {
            maxi = -1;
            
            for (i = 0; i < n; ++i) {
                if ((used[i] == 0) &&
                        ((maxi == -1) || ((float)w[i]/p[i] > (float)w[maxi]/p[maxi])))
                    maxi = i;
            }
            
            used[maxi] = 1;
            cur_w -= p[maxi];
            tot_v += w[maxi];
            
            if (cur_w >= 0)
                System.out.println("Added object " + (maxi + 1) + " (" + w[maxi] + "," + p[maxi] + ") completely in the bag. Space left: " + cur_w);
            else {
                System.out.println("Added " + ((int)((1 + (float)cur_w/p[maxi]) * 100)) + "% (" + w[maxi] + "," + p[maxi] + ") of object " + (maxi + 1) + " in the bag.");
                tot_v -= w[maxi];
                tot_v += (1 + (float)cur_w/p[maxi]) * w[maxi];
            }
        }
        
        System.out.println("Filled the bag with objects worth " + tot_v);
        
        scanner.close();
    }
}
