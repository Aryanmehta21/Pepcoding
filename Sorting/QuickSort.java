import java.util.*;
public class QuickSort {
    public static void quickSort(int[] arr, int si, int ei){
        if(si >= ei)return;

        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i  = si-1;
        for(int j = si; j < ei;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, arr.length-1);
        for(int i : arr){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
