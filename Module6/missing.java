//Find the missing number from an array containing numbers from 1 to n
import java.util.*;
public class missing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range (1 to n):");
        int n = sc.nextInt();

        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Array Elements:");
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int sum1 = n*(n+1)/2;

        int sum2 =0;
        for(int i =0;i<size;i++){
            sum2+=arr[i];
        }

        System.out.println("The missing number is: "+ (sum1-sum2));
    }
}