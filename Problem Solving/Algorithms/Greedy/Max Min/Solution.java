import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static int maxMin(int k, int[] arr) {

        if (k == 2 && arr.length == 2) {

            return Math.abs(arr[0] - arr[1]);
        }

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {

            if (arr[i + k - 1] - arr[i] < minDiff) {

                minDiff = arr[i + k - 1] - arr[i];
            }
        }

        return minDiff;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int n = scanner.nextInt();

        int k = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            
            arr[i] = scanner.nextInt();
        }

        int result = maxMin(k, arr);

        System.out.print(result);

        scanner.close();
    }
}
