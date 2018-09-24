import java.io.*;
import java.util.*;

public class OneDimensionalArrays{

    static int[] reverseArray(int[] a) {
        
        int j = a.length - 1;
        for(int i = 0; i < a.length / 2; i++) {
            
            if(j >= a.length / 2) {
            
                swap(i, j, a);
                j--;
            }
        }
        
        return a;
    }
    
    static void swap(int i, int j, int[] arr) {
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
    	int arrCount = scanner.nextInt();
        
    	scanner.nextLine();

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
        	
        	System.out.print(res[i]);

            if (i != res.length - 1) {

            	System.out.print(" ");
            }
        }

        scanner.close();
    }
}


