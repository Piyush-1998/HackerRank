import java.util.*;

public class Solution {

	// check if str is palindrome
    public static String isPalindrome(String str) {
        
        if(new StringBuilder(str).reverse().toString().equals(str)) {
            
            return "Yes";
        }
    
        return "No";
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();
        
        String result = isPalindrome(A);
        
        System.out.println(result);
        
        sc.close();
    }
}