import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
    	int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            
        	String[] arrRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        int largestSum = Integer.MIN_VALUE;
        
        int currentSum = 0;
        
        for(int i = 0; i < 4; i++) {

            for(int j = 0; j < 4; j++) {

                currentSum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                    arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                
                if(currentSum > largestSum) {

                    largestSum = currentSum;
                }
            }
        }
        
        System.out.println(largestSum);

        scanner.close();
    }
}