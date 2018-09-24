import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String firstNumber = scan.nextLine();
        String secondNumber = scan.nextLine();
        
        BigInteger first = new BigInteger(firstNumber);
        BigInteger second = new BigInteger(secondNumber);
        
        System.out.println(first.add(second));
        System.out.println(first.multiply(second));
        
        scan.close();
    }
}