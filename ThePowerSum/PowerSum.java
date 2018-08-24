import java.io.*;
import java.util.*;

public class PowerSum {

    static int res = 0;
    
    static int powerSumRecursive(int num, int x, int k, int n)
    {
        if (x == 0) {
            res++;
        }
         
        int r = (int)Math.floor(Math.pow(num, 1.0 / n));
 
        for (int i = k + 1; i <= r; i++) {
            
            int a = x - (int)Math.pow(i, n);
            if (a >= 0) {
                powerSumRecursive(num, x - (int)Math.pow(i, n), i, n); 
            }
        }
        return res;
    }
     
    static int powerSum(int x, int n)
    {
        return powerSumRecursive(x, x, 0, n);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int X = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = powerSum(X, N);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}

