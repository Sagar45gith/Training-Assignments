// Binary Search - Iterative and Recursive
import java.util.*;
public class BinarySearch{

    public static int iterative(int[] arr, int target){
        int st = 0, end = arr.length-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) st = mid+1;
            else end = mid-1;
        }
        return -1;
    }

    public static int recursive(int[] arr, int target, int st, int end){
        if(st > end) return -1;
        int mid = st + (end-st)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] < target) return recursive(arr, target, mid+1, end);
        else return recursive(arr, target, st, mid-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Array Elements (sorted):");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Enter target:");
        int target = sc.nextInt();

        System.out.println("Iterative: index " + iterative(arr, target));
        System.out.println("Recursive: index " + recursive(arr, target, 0, n-1));
    }
}