import java.io.*;
import java.util.*;

public class TwoCharacters {

    class Pair {
        
        char first;
        char second;
        
        Pair(char first, char second) {
            
            this.first = first;
            this.second = second;
        }
    }
    
    static int alternate(String s) {
        
        HashSet<Character> uniqueLetters = new HashSet<Character>();
        
        for(int i = 0; i < s.length(); i++) {
            
            uniqueLetters.add(s.charAt(i));
        }
        
        char[] charArray = new char[uniqueLetters.size()];
        
        int k = 0;
        for(char character : uniqueLetters) {
            
            charArray[k] = character;
            k++;
        }
        
        TwoCharacters sol = new TwoCharacters();
        int maxSize = 0;
        for(int i = 0; i < charArray.length - 1; i++) {
            
            for(int j = i + 1; j < charArray.length; j++) {
                
                Pair currentPair = sol.new Pair(charArray[i], charArray[j]);
                
                int currentSize = findLengthOfPair(currentPair, s);
                
                if(currentSize > maxSize) {
                    
                    maxSize = currentSize;
                }
            }
        }
        return maxSize;
    }
    
    static int findLengthOfPair(Pair currentPair, String s) {
        
        char first = currentPair.first;
        char second = currentPair.second;
        StringBuilder temp = new StringBuilder(s);
        
        for(int i = 0; i < temp.length(); i++) {
            
            if(temp.charAt(i) != first && temp.charAt(i) != second) {
                
                temp.deleteCharAt(i);
                i--;
            } 
        }
        
        if(validSequence(temp)) {
            
            return temp.length();
        }
        
        return 0;
    }
    
    static boolean validSequence(StringBuilder s) {
        
        int i = 0;
        int j = i + 1;
        
        while(i < s.length() && j < s.length()) {
            
            if(s.charAt(i) == s.charAt(j)) {
                
                return false;
            }
            
            i++;
            j++;
        }
        
        return true;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
        String s = scanner.next();

        int result = alternate(s);

        System.out.println(String.valueOf(result));
    }
}

