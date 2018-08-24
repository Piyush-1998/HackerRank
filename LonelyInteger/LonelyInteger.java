import java.io.*;
import java.util.*;

public class LonelyInteger {

    static int lonelyinteger(int[] a) {

        if(a.length == 1) {
            
            return a[0];
        }
        
        Arrays.sort(a);
        
        int missingNumber = -1;
        int j = 1;
        for(int i = 0; i < a.length; i+=2) {
            
            if(j < a.length) {
                
                if(a[i] != a[j]) {

                    missingNumber = a[i];
                    break;
                }
                
                j+=2;
            }
            else {
                
                missingNumber = a[a.length - 1];
            }
        }
        return missingNumber;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = lonelyinteger(a);
        
        System.out.println(String.valueOf(result));

        scanner.close();
    }
}
