import java.io.*;
import java.util.*;

public class MinimumLoss {

    static class Checker implements Comparator<Pair> {
        
        public int compare(Pair first, Pair second) {
            
            return Long.compare(first.data, second.data);
        }
    }
    
    static class Pair {
        
        int originalIndex;
        long data;
        
        Pair(int index, long data) {
            
            this.originalIndex = index;
            this.data = data;
        }
    }
    
    static long minimumLoss(long[] original) {
        
        ArrayList<Pair> copy = new ArrayList<Pair>();
        
        for(int i = 0; i < original.length; i++) {

            copy.add(new Pair(i, original[i]));
        }
        
        Collections.sort(copy, new Checker());

        long minDifference = Long.MAX_VALUE;
        for(int i = 1; i < copy.size(); i++) {

            long currentDifference = copy.get(i).data - copy.get(i - 1).data;
            int firstIndex = copy.get(i).originalIndex;
            int secondIndex = copy.get(i - 1).originalIndex;
            if((currentDifference < minDifference) && (secondIndex > firstIndex)) {
                
                minDifference = currentDifference;
            }
        }
        
        return minDifference;        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.nextLine();

        long[] price = new long[n];

        String[] priceItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            
        	long priceItem = Long.parseLong(priceItems[i]);
            price[i] = priceItem;
        }

        long result = minimumLoss(price);

        System.out.println(result);

        scanner.close();
    }
}