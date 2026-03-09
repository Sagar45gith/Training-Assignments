//Partition an array so that negative numbers appear before positives.
import java.util.*;
public class negative{

    public static void sort(int[] arr){
        int st =0;
        int end = arr.length-1;

        while(st<=end){
            if(arr[st]<0){
                st++;
            }
            else if(arr[end]>=0){
                end--;
            }
            else{
                int temp = arr[st];
                arr[st]=arr[end];
                arr[end]=temp;
                st++;
                end--;
            }
        }
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

        sort(arr);
        System.out.println("Moved -ve to front "+ Arrays.toString(arr));
    }
}