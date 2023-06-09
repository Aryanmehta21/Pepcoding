import java.util.*;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n / 2, st = 1; // sp = spaces ; st = stars
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) // printing spacing
            {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) // printing stars
            {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                sp--; // decrementing spacing in succeeding lines by 1
                st += 2; // incrementing stars in succeeding lines by 2
            } else {
                sp++; // increasing spacing in succeeding lines by 1
                st -= 2; // decreasing stars in succeeding lines by 2
            }
            System.out.println(); // changing to newline after one complete iteration of loop
        }
    }
}
