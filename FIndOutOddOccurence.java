import java.util.Scanner;
public class FIndOutOddOccurence {
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     for(int i = 0;i<n;i++){
    //         arr[i] = sc.nextInt();
    //     }

    //     int res = 0;
    //     for(int i = 0;i<arr.length;i++){
    //         res=res^arr[i];
    //     }

    //     System.out.println(res);
    //     sc.close();
    // }

        // log n only if the numbers are given in pairs else use xor method...
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = arr.length-1;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            int pre = mid-1;
            int post = mid+1;

            if(arr[pre] != arr[mid] && arr[post] != arr[mid]){
                System.out.println(arr[mid]);
                return;
            }else if(mid % 2 == 0){
                if(arr[pre] == arr[mid]){
                    high = mid - 1;
                }else{
                    low = mid + 1; 
                }
            }else{
                if(arr[post] == arr[mid]){
                    low = mid + 1;  
                }else{
                    high = mid - 1;
                }
            }
        }
    }
}
