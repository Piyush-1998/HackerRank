import java.io.*;
import java.util.*;

public class Solution {

    static int pageCount(int n, int p) {
       
        return (int)Math.min(p / 2, (n % 2 == 0) ? (n + 1 - p) / 2 : (n - p) / 2); 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();

        int p = scanner.nextInt();

        int result = pageCount(n, p);
        
        System.out.print(result);

        scanner.close();
    }
}
