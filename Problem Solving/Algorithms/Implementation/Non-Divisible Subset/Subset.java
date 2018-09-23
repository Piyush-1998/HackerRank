import java.io.*;
import java.util.*;

public class Subset {

    static int nonDivisibleSubset(int k, int[] set) {
        
        int[] remainders = new int[k];
        int count = 0;

        for (int i = 0; i < set.length; i++) {

            remainders[set[i] % k]++;
        }

        for (int j = 1; j <= (k / 2); j++) {            

            if (j == k - j) {
                count++;
                continue;
            }

            count += Math.max(remainders[j], remainders[k - j]);    
        }

        if (remainders[0] > 0) {

            count++;
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] S = new int[n];

        String[] SItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int SItem = Integer.parseInt(SItems[i]);
            S[i] = SItem;
        }

        int result = nonDivisibleSubset(k, S);

        System.out.println(result);
        scanner.close();
    }
}