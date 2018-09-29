import java.util.Scanner;

public class Solution {
     
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int numbers = input.nextInt();
        
        for(int i = 0; i < numbers; i++) {
        	
        	long num = input.nextLong();

        	long maxValue = (long)Math.pow(2, 32) - 1;

        	System.out.println(num ^ maxValue);
        }
        
        input.close();
    }
}
