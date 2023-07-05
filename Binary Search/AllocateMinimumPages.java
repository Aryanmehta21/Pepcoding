import java.util.*;
public class AllocateMinimumPages {
    public static int minPages(int[] books, int k){
        int min = maxOf(books);
        int max = sumOf(books);
        int res = 0;
        while(min<=max){
            int mid = min + (max - min)/2;
            if(isFeasible(books, k, mid)){
                res = mid;
                max = mid-1;
            }else{
                min = mid + 1;
            }
        }
        return res;
    }

    public static boolean isFeasible(int[] books, int k, int res){
        int student = 1;
        int sum = 0;
        for(int i = 0;i<books.length;i++){
            if(sum + books[i] > res){
                student++;
                sum = books[i];
            }else{
                sum += books[i];
            }
        }
        return student <= k;
    }
    
    public static int maxOf(int[] books){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<books.length;i++){
            if(books[i] > max){
                max = books[i];
            }
        }
        return max;
    }

    public static int sumOf(int[] books){
        int sum = 0;
        for(int i=0;i<books.length;i++){
            sum+=books[i];
        }
        return sum;
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
