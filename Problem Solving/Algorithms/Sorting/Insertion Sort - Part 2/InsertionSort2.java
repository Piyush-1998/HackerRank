import java.util.*;

public class InsertionSort2 {

    static void insertionSort2(int n, int[] arr) {
        
        for(int i = 1; i < n; i++) {
            
            int key = arr[i]; 
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            
            for(int k = 0; k < n; k++) {
                
                System.out.print(arr[k] + " ");
            }
           
            System.out.println("");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.nextLine();
        
        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            
        	int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort2(n, arr);

        scanner.close();
    }
}
