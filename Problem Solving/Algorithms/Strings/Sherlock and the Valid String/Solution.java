import java.util.Scanner;

public class Solution {
     
    public static String isValid(String str) {
        
        int[] letters = new int[26];
        
        for(int i = 0; i < str.length(); i++) {
            
            letters[str.charAt(i) - 'a']++;
        }
        
        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0; i < letters.length; i++) {
            
            if(letters[i] != 0 && letters[i] < min) {
                
                min = letters[i];
                index = i;
            }
        }
        
        if(min == 1) {
            
            int value = 0;
            for(int i = 0; i < letters.length; i++) {
                
                if(i != index && letters[i] != 0) {
                    
                    value = letters[i];
                }
            }
            
            for(int i = 0; i < letters.length; i++) {
            
                if(i != index && letters[i] != 0 && letters[i] != value) {
                    
                    return "NO";
                }
            }
            
            return "YES";
        }
        
        int count = 0;
        for(int i = 0; i < letters.length; i++) {
            
            if(letters[i] != 0 && letters[i] > min + 1) {
                
                return "NO";
            }
            
            else if(letters[i] != 0 && letters[i] == min + 1) {
                
                if(count == 1) {
                    
                    return "NO";
                }
                
                count++;
            }
        }
        
        return "YES";
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String str = input.nextLine();
        
        System.out.println(isValid(str));
        
        input.close();
    }
}
