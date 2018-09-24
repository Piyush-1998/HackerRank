import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        // matching regular expression
        String[] words = s.trim().split("[ !,?._'@]+");

        if(s == null || s.equals("") || s.trim().equals("")){
            
            System.out.println("0");
        }
    
        else if(s.length() > 400000) {
            
            return;
        }
        
        else {
        
            System.out.println(words.length);
        }
        
        for(int i = 0; i < words.length; i++) {

            System.out.println(words[i]);
        }
         
        scan.close();
    }
}