//Find all pairs in an array whose sum equals a target value.
//Solve the Two Sum problem using optimized approach.
import java.util.*;
public class TwoSum{
    
    //Q5: TWO SUM
    public static int[] find(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int needed = target - arr[i];
            if(map.containsKey(needed)){
                return new int[] {map.get(needed),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }

    //Q4: RETURNS ALL THE POSSIBLE PAIRS
    public static void findAllPairs(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            int needed = target - arr[i];
            if(set.contains(needed)){
                System.out.println("Pair found: ("+needed+", "+arr[i]+")");
            }
            set.add(arr[i]);
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
        System.out.println("Enter target element: ");
        int target = sc.nextInt();

        int[] res = find(arr,target);
        System.out.println("Target elmenet sum found at indexs "+Arrays.toString(res));

        findAllPairs(arr,target);
    }
}