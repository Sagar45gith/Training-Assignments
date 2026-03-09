//Find the longest subarray with sum equal to k.
import java.util.*;
public class LongestSubarray{

    public static int find(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1); // edge case: subarray starts from index 0

        int prefixSum = 0;
        int maxLen = 0;

        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];

            if(map.containsKey(prefixSum - k)){
                int len = i - map.get(prefixSum - k);
                maxLen = Math.max(maxLen, len);
            }

            if(!map.containsKey(prefixSum)){
                map.put(prefixSum, i); // only store first occurrence
            }
        }
        return maxLen;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Array Elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k:");
        int k = sc.nextInt();

        int result = find(arr, k);
        System.out.println("Longest subarray length with sum "+k+" is: "+result);
    }
}
