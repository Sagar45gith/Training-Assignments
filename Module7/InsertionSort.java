// Insertion Sort
import java.util.*;
public class InsertionSort{

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Array Elements:");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

/*
Advantage for nearly sorted arrays:

Best case is O(n) — inner while loop barely runs
Each element is almost in place, so very few shifts needed
Much faster than Bubble and Selection Sort for nearly sorted data

*/
