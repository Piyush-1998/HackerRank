import java.util.Scanner;

public class Solution {
    
    public static long sumXor(long n) {
        
        long zeros = 0;
        
        while(n > 0) {

            zeros += (n % 2 == 0) ? 1 : 0;
            n = n / 2; 
        }
        
        long result = (long)Math.pow(2, zeros);
        
        return result;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        long n = input.nextLong();
        
        System.out.print(sumXor(n));
        
        input.close();
    }
}
