// Quick Sort
import java.util.*;
public class QuickSort{

    public static int partition(int[] arr, int st, int end){
        int pivot = arr[end];
        int i = st-1;
        for(int j = st; j < end; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        return i+1;
    }

    public static void quickSort(int[] arr, int st, int end){
        if(st >= end) return;
        int pivotIdx = partition(arr, st, end);
        quickSort(arr, st, pivotIdx-1);
        quickSort(arr, pivotIdx+1, end);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Array Elements:");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        quickSort(arr, 0, n-1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}