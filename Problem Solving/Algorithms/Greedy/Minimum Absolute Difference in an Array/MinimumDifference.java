import java.io.*;
import java.util.*;

public class MinimumDifference {

    static int minimumAbsoluteDifference(int[] arr) {
        
        Arrays.sort(arr);
        
        int minDifference = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length - 1; i++) {

            int difference = Math.abs(arr[i] - arr[i+1]);
            
            if(difference < minDifference) {
                
                minDifference = difference;
            }
        }
        
        return minDifference;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        
        scanner.nextLine();

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        
        scanner.close();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = minimumAbsoluteDifference(arr);

        System.out.println(String.valueOf(result));        
    }
}

