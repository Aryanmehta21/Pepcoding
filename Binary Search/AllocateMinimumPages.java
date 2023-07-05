import java.util.*;
public class AllocateMinimumPages {
    public static int minPages(int[] books, int k){
        int min = maxOf(books);
        int max = sumOf(books);
        int res = 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] books = new int[n];
        for(int i = 0;i<n;i++){
            books[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.println(minPages(books, k));
        sc.close();
    }
}
