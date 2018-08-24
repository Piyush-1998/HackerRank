import java.io.*;
import java.util.*;

public class Pangram {

    static String pangrams(String s) {
        
        Set<Character> uniqueLetters = new HashSet<Character>();
        
        // ignore case
        String temp = s.toLowerCase();
        
        for(int i = 0; i < temp.length(); i++) {
            
            if(temp.charAt(i) != ' ') {
                
                uniqueLetters.add(temp.charAt(i));
            }
        }
        
        if(uniqueLetters.size() >= 26) {
            
            return "pangram";
        }

        return "not pangram";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        String result = pangrams(s);

        System.out.println(result);

        scanner.close();
    }
}