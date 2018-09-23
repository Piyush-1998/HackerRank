import java.util.*;

public class SeparateTheNumbers {

    static void separateNumbers(String s) {

        boolean isBeautiful = false;
        
        for(int i = 1; i < s.length() / 2 + 1; i++) {

            long currentNumber = Long.parseLong(s.substring(0, i));
            long firstNumber = currentNumber;
            
            String currentString = "";
            
            while(currentString.length() <= s.length()) {
                
                if(currentString.equals(s)) {
                    
                    System.out.println("YES " + firstNumber);
                    isBeautiful = true;
                    break;
                }
                
                currentString = currentString + Long.toString(currentNumber);
                currentNumber++;
            }     
        }
        
        if(isBeautiful == false) {

            System.out.println("NO");
        }     
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.nextLine();

        for (int qItr = 0; qItr < q; qItr++) {
            
        	String s = scanner.nextLine();

            separateNumbers(s);
        }

        scanner.close();
    }
}
