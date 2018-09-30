import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
     
    static String balancedSums(List<Integer> arr) {
        
        if(arr.size() == 1) {
            
            return "YES";
        }
        
        int rightSum = 0;
        for(int i = 0; i < arr.size(); i++) {
            
            rightSum+=arr.get(i);
        }
        
        int leftSum = 0;
        
        for(int i = 0; i < arr.size(); i++) {
            
            rightSum-=arr.get(i);
            if(leftSum == rightSum) {
                
                return "YES";
            }
            leftSum+=arr.get(i);
        }
        
        return "NO";
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int testCases = input.nextInt();
        
        for(int i = 0; i < testCases; i++) {
            
            int size = input.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            
            for(int j = 0; j < size; j++) {
                
                list.add(input.nextInt());
            }
            
            System.out.println(balancedSums(list));
        }
           
        input.close();
    }
}