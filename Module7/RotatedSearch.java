// Search an element in a rotated sorted array
import java.util.*;
public class RotatedSearch{

    public static int search(int[] arr, int target){
        int st = 0, end = arr.length-1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid] == target) return mid;

            if(arr[st] <= arr[mid]){
                if(arr[st] <= target && target < arr[mid]) end = mid-1;
                else st = mid+1;
            } else {
                if(arr[mid] < target && target <= arr[end]) st = mid+1;
                else end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Array Elements (rotated sorted):");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Enter target:");
        int target = sc.nextInt();

        System.out.println("Element found at index: " + search(arr, target));
    }
}