import java.io.*;
import java.util.*;

public class StrongPassword {

    static int minimumNumber(int n, String password) {

        String numbers = "0123456789";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacters = "!@#$%^&*()-+";
        
        int missingNumbers = 1;
        int missingLowerCase = 1;
        int missingUpperCase = 1;
        int missingSpecialCharacters = 1;
        
        for(int i = 0; i < password.length(); i++) {
            
            if(numbers.indexOf(password.charAt(i)) != -1) {
                
                missingNumbers = 0;
            }
            
            if(lowerCase.indexOf(password.charAt(i)) != -1) {
                
                missingLowerCase = 0;
            }
            if(upperCase.indexOf(password.charAt(i)) != -1) {
                
                missingUpperCase = 0;
            }
            
            if(specialCharacters.indexOf(password.charAt(i)) != -1) {
                
                missingSpecialCharacters = 0;
            }
        }
        
        int missingCharacters = missingNumbers + missingLowerCase 
            + missingUpperCase + missingSpecialCharacters;
        
        if(missingCharacters + password.length() > 6) {
            
            return missingCharacters;
        } 
        else {
            
            return missingCharacters + (6 - (password.length() + missingCharacters)); 
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        System.out.println(String.valueOf(answer));

        scanner.close();
    }
}