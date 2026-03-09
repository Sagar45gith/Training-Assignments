//Implement the Difference Array technique for range updates.
import java.util.*;
public class DiffArr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Array Elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] diff = new int[n+1]; // n+1 to avoid index out of bounds

        System.out.println("How many queries: ");
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            System.out.println("Enter start, end and value:");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();

            if(l < 0 || r >= n || l > r){
                System.out.println("Invalid Input");
                continue;
            }

            diff[l] += v;
            diff[r+1] -= v;
        }

        // Reconstruct final array
        int[] finalArr = new int[n];
        finalArr[0] = arr[0] + diff[0];
        for(int i = 1; i < n; i++){
            diff[i] += diff[i-1]; // prefix sum of diff
            finalArr[i] = arr[i] + diff[i];
        }

        System.out.println("Final Array: " + Arrays.toString(finalArr));
    }
}