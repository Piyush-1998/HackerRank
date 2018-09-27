import java.util.Scanner;

public class Solution {

    static int superDigit(String n, int k) {
    	
    	int superDigit = 0;
    	int result = Integer.parseInt(superDigitUtil(n));
    	
    	while(k > 0) {
    		
    		superDigit+=result;
    		
    		if(superDigit >= 10) {
    			
    			superDigit-= 9;
    		}
    		
    		k--;
    	}
    	
    	return superDigit;
    }
    
    static String superDigitUtil(String n) {
    
    	if(n.length() == 1) {
    		
    		return n;
    	}
    	
    	int sum = 0;
    	for(int i = 0; i < n.length(); i++) {
    		
    		sum+=Character.getNumericValue(n.charAt(i));
    	}
    	
    	return superDigitUtil(Integer.toString(sum));
    }
    
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	String str = input.next();
    	
    	int k = input.nextInt();
    	
    	System.out.println(superDigit(str, k));
    	
    	input.close();
    }
}