import java.io.*;
import java.math.*;
import java.util.*;

public class FibonacciModified {
    
    // Complete the fibonacciModified function below.
    static BigInteger fibonacciModified(BigInteger t1, BigInteger t2, int n) {
        
        BigInteger[] arr = new BigInteger[n + 1];
        arr[0] = t1;
        arr[1] = t2;
        for(int i = 2; i < n; i++) {
          
            arr[i] = arr[i - 1].pow(2).add(arr[i - 2]);  
        }
        
        return arr[n - 1];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] t1T2n = scanner.nextLine().split(" ");
        
        Integer t1 = Integer.parseInt(t1T2n[0]);
        
        BigInteger bi1 = BigInteger.valueOf(t1.intValue());
        
        Integer t2 = Integer.parseInt(t1T2n[1]);
        
        BigInteger bi2 = BigInteger.valueOf(t2.intValue());

        int n = Integer.parseInt(t1T2n[2]);
        
        BigInteger result = fibonacciModified(bi1, bi2, n);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}
