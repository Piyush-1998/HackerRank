import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            
            arr[i] = scan.nextInt();
        }
        
        scan.close();
        
        int negativeSums = 0;
        
        for(int i = 0; i < n; i++) {
            
            for(int j = i; j < n; j++) {
            
                int currentSum = 0;
                for(int k = i; k <= j; k++) {
                    
                    currentSum+=arr[k];
                }
                
                if(currentSum < 0) {
                    
                    negativeSums++;
                }
            }   
        }
        
        System.out.println(negativeSums);
    }
}