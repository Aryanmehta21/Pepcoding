import java.util.*;
class SwapArrayList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            int x = sc.nextInt();
            list.add(x);
        }
        
        int i=0;
        int j = list.size()-1;
        
        while(i<j){
            Collections.swap(list, i, j);
            System.out.println(list);
            i++;
            j--;
        }
        sc.close();
    }
}