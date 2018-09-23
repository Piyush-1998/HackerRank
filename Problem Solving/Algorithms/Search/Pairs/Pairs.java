import java.io.*;
import java.util.*;

public class Pairs {

    static int pairs(int k, int[] arr) {

        Arrays.sort(arr);
        
        int i = 0;
        int j = 1;
        int count = 0;
        
        while(j < arr.length) {
            
            int diff = arr[j] - arr[i];

            if (diff == k) {
                count++;
                j++;
            } 
            
            else if (diff > k) {
                i++;
            } 
            
            else if (diff < k) {
                j++;
            }
        }
        
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = pairs(k, arr);

        System.out.println(result);

        scanner.close();
    }
}

