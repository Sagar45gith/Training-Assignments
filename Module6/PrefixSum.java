//Construct a Prefix Sum array and answer multiple range sum queries.
import java.util.*;
public class PrefixSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Array Elements:");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[] prefix = new int[n];

        prefix[0]=arr[0];
        for(int i =1;i<arr.length;i++){
            prefix[i]= prefix[i-1]+arr[i];
        }
        System.out.println("Prefix Sum Array: "+Arrays.toString(prefix));

        System.out.println("How many quries: ");
        int q = sc.nextInt();
        for(int i =0;i<q;i++){
            System.out.println("Enter start range:");
            int l = sc.nextInt();

            System.out.println("Enter end range: ");
            int r = sc.nextInt();
            if(l < 0 || r >= n || l > r){
                System.out.println("Invalid Input");
            }

            if(l==0){
            System.out.println("Range sum: " + prefix[r]);
            }
            else{
                System.out.println("Range sum: "+(prefix[r]-prefix[l-1]));
            }
        }
    }
}