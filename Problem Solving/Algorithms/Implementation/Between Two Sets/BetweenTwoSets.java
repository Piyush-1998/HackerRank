import java.io.*;
import java.util.*;

public class BetweenTwoSets {

    static int getTotalX(int[] a, int[] b) {
        
        int maxFirst = Integer.MIN_VALUE;
        
        for(int i = 0; i < a.length; i++) {
            
            if(a[i] > maxFirst) {
                
                maxFirst = a[i];
            }
        }
        
        int minSecond = Integer.MAX_VALUE;
        
        for(int j = 0; j < b.length; j++) {
            
            if(b[j] < minSecond) {
                
                minSecond = b[j];
            }
        }
        
        int element = maxFirst;
        int factors = 0;
        
        while(element <= minSecond) {
            
            boolean add = true;
            for(int i = 0; i < a.length; i++) {
            
                if(element % a[i] != 0) {
                    
                    add = false;
                    break;
                }
            }
            
            if(add == true) {
                
                boolean isFactor = true;
                for(int j = 0; j < b.length; j++) {
                    
                    if(b[j] % element != 0) {
                        
                        isFactor = false;
                        break;
                    }
                }
                
                if(isFactor == true) {
                    
                    factors++;
                }
            }
                
            element++;
        }

        return factors;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        System.out.println(String.valueOf(total));
    }
}
