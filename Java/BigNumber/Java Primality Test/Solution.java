import java.math.*;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        
        BigInteger isPrime = new BigInteger(n);
        
        System.out.println(isPrime.isProbablePrime(10) ? "prime" : "not prime");

        scanner.close();
    }
}