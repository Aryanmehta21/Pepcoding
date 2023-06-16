// You are using Java
import java.util.*;
class NextGreaterElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int[] nextGreater = new int[n];
        
        for(int i=0;i<n;i++){
            nextGreater[i] = -1;
            for(int j=i+1;j<n;j++){
                if(arr[j] > arr[i]){
                    nextGreater[i] = arr[j];
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
            if(nextGreater[i] != -1){
                System.out.println(nextGreater[i]);
            }else{
                System.out.println("-1");
            }
        }
        
    }
}
