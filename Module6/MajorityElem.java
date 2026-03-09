//Find the majority element using Boyer–Moore Voting Algorithm.
import java.util.*;
public class MajorityElem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Array Elements:");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int cnt =0;
        int can = 0;
        for(int i =0;i<n;i++){
            if(cnt == 0){
                can = arr[i];
                cnt++;
            }
            if(arr[i]==can){
                cnt++;
            }
            else{
                cnt--;
            }
        }

        //to verify..
        int verify = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == can) verify++;
        }

        if(verify > n/2){
            System.out.println("Majority element is: " + can);
        } else {
            System.out.println("No majority element found");
        }       
    }
}