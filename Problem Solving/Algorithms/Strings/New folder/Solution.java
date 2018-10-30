import java.util.*;

public class Solution {

    static String hackerrankInString(String s) {

        String str = "hackerrank";
        
        s.toLowerCase();
        
        int j = 0;
        for(int i = 0; i < s.length(); i++) {
            
            if(s.charAt(i) == str.charAt(j)) {
                
                j++;
            }
            
            if(j == str.length()) {
                
                return "YES";
            }
        }
        
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int q = scanner.nextInt();

        while(q-- > 0) {
            
            String str = scanner.next();
            
            System.out.println(hackerrankInString(str));
        }

        scanner.close();
    }
}
