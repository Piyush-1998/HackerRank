import java.io.*;
import java.util.*;

public class Anagram {

    static int anagram(String s) {

        HashMap<Character, Integer> countLetters = new HashMap<Character, Integer>();
        
        if(s.length() % 2 != 0) {
            
            return -1;
        }
        
        for(int i = 0; i < s.length() / 2; i++) {
            
            if(countLetters.containsKey(s.charAt(i))) {
                
                countLetters.put(s.charAt(i), countLetters.get(s.charAt(i)) + 1);
            }
            
            else {

                countLetters.put(s.charAt(i), 1);
            }
        }
        
        for(int i = s.length() / 2; i < s.length(); i++) {

            if(countLetters.containsKey(s.charAt(i))) {
                
                countLetters.put(s.charAt(i), countLetters.get(s.charAt(i)) - 1);
            }
            
            else {
                
                countLetters.put(s.charAt(i), -1);
            }
        }
        
        int deletions = 0;
        for(int val : countLetters.values()) {
            
            deletions+=Math.abs(val);
        }
        
        return deletions / 2;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();

        scanner.nextLine();

        for (int qItr = 0; qItr < q; qItr++) {
            
        	String s = scanner.nextLine();

            int result = anagram(s);

            System.out.println(result);
        }

        scanner.close();
    }
}