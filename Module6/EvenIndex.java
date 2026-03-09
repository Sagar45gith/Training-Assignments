//Rearrange an array so that even index contains even numbers.
import java.util.*;
public class EvenIndex{
    public static void rearrange(int[] arr){
        int even = 0;
        int odd = 1;

        while(even < arr.length && odd < arr.length){
            if(arr[even] % 2 == 0){
                even += 2;  // even number at even index, move forward
            } else if(arr[odd] % 2 == 1){
                odd += 2;   // odd number at odd index, move forward
            } else {
                // arr[even] is odd and arr[odd] is even → swap
                int temp = arr[even];
                arr[even] = arr[odd];
                arr[odd] = temp;
                even += 2;
                odd += 2;
            }
        }
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

        rearrange(arr);
        System.out.println("Rearranged Array: "+ Arrays.toString(arr));
    }
}