import java.io.*;
import java.util.*;

public class CircularRotation {

    static int[] circularArrayRotation(int[] arr, int k, int[] queries) {

        int[] elementsAtIndex = new int[queries.length];
        
        arr = rotationOperation(arr, k);
  
        for(int i = 0; i < elementsAtIndex.length; i++) {
            
            elementsAtIndex[i] = arr[queries[i]];
        }
        
        return elementsAtIndex;
    }
    
    static int[] rotationOperation(int[] arr, int k) {
        
        int[] copy = new int[arr.length + 10];
        
        int j = 0;
        
        if(k > arr.length) {
            
            k = k % arr.length;
        }
        
        for(int i = arr.length - k; i < arr.length; i++) {
            
            copy[j] = arr[i];
            j++;
        }
        
        for(int i = 0; i < arr.length - k; i++) {
            
            copy[j] = arr[i];
            j++;
        }
        
        return copy;
    }
    
    static void swap(int[] arr, int i, int j) {
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        int[] result = circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.length; i++) {
            
        	System.out.println(String.valueOf(result[i]));
        }

        scanner.close();
    }
}
