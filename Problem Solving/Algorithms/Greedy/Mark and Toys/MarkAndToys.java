import java.io.*;
import java.util.*;

public class MarkAndToys {

    static int maximumToys(int[] prices, int k) {

        Arrays.sort(prices);

        int count = 0;
        int sum = 0;
        while(sum + prices[count] < k) {
            
            sum+=prices[count];
            count++;
        }
        
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        
        scanner.close();

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}