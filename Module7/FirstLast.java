// Find first and last occurrence using Binary Search
import java.util.*;
public class FirstLast{

    public static int first(int[] arr, int target){
        int st = 0, end = arr.length-1, result = -1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid] == target){ result = mid; end = mid-1; }
            else if(arr[mid] < target) st = mid+1;
            else end = mid-1;
        }
        return result;
    }

    public static int last(int[] arr, int target){
        int st = 0, end = arr.length-1, result = -1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid] == target){ result = mid; st = mid+1; }
            else if(arr[mid] < target) st = mid+1;
            else end = mid-1;
        }
        return result;
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

        System.out.println("First occurrence: " + first(arr, target));
        System.out.println("Last occurrence: " + last(arr, target));
    }
}