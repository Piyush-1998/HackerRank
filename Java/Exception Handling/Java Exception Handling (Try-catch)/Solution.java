import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        try {
            
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            System.out.println(x / y);
            
            sc.close();
            
        } catch (ArithmeticException e) {
            
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        
        catch (InputMismatchException e) {
            
            System.out.println("java.util.InputMismatchException");
        }
    }
}
