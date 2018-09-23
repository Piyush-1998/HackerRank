import java.io.*;
import java.util.*;

public class CamelCase {

    static int camelcase(String s) {

        int words = 0;
        for(int i = 0; i < s.length(); i++) {
            
            if(Character.isUpperCase(s.charAt(i))) {
                
                words++;
            }            
        }

        return words + 1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        int result = camelcase(s);

        System.out.println(result);

        scanner.close();
    }
}
