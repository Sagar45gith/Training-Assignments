// Find the maximum subarray sum using Kadane’s Algorithm.
import java.util.*;
public class Kadanes{

    public static int maxsum(int[] arr){
        int maxisum = arr[0];
        int sum =0;

        for(int i =0;i<arr.length;i++){
            sum=sum+arr[i];
            maxisum = Math.max(sum,maxisum);
            if(sum<0){
                sum=0;
            }
        }
        return maxisum;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Array Elements:");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int result = maxsum(arr);

        System.out.println("The maximum subarray is "+result);
    }
}