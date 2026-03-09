// Merge Sort
import java.util.*;
public class MergeSort{

    public static void merge(int[] arr, int st, int mid, int end){
        int[] left = Arrays.copyOfRange(arr, st, mid+1);
        int[] right = Arrays.copyOfRange(arr, mid+1, end+1);

        int i = 0, j = 0, k = st;
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }
        while(i < left.length) arr[k++] = left[i++];
        while(j < right.length) arr[k++] = right[j++];
    }

    public static void mergeSort(int[] arr, int st, int end){
        if(st >= end) return;
        int mid = st + (end-st)/2;
        mergeSort(arr, st, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, st, mid, end);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Array Elements:");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        mergeSort(arr, 0, n-1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}