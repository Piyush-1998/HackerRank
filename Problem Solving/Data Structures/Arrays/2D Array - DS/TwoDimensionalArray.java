import java.io.*;
import java.util.*;

public class TwoDimensionalArray {

    static int hourglassSum(int[][] arr) {
        
        int startCol = 0;
        int startRow = 0;
        int maxSum = Integer.MIN_VALUE;
        
        while(startRow < 4) {
        
            while(startCol < 4) {

                int currentSum = 0;
                for(int i = startRow; i < startRow + 3; i++) {

                    for(int j = startCol; j < startCol + 3; j++) {
                        
                        currentSum = currentSum + arr[i][j];
                        
                        if((j != startCol + 1) && (i == startRow + 1)) {
                            
                            currentSum = currentSum - arr[i][j];
                        }
                    }
                }

                if(currentSum > maxSum) {

                    maxSum = currentSum;
                }

                startCol++;
            }
            startCol = 0;
            startRow++;
        }
     
        return maxSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            
        	String[] arrRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        System.out.println(result);

        scanner.close();
    }
}
