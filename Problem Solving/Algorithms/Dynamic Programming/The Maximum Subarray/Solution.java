import java.util.Scanner;

public class Solution {

	// using Kadane's algorithm
	public static int[] maxSubArray(int[] arr) {
	
		int n = arr.length;
		
		int sum1 = arr[0];
		int maxFromSum = arr[0];
		
		for(int i = 1; i < n; i++) {
			
			sum1 = Math.max(arr[i], arr[i] + sum1);
			maxFromSum = Math.max(maxFromSum, sum1);
		}
		
		int index = 0;
		int[] result = new int[2];
		result[index] = maxFromSum;
		index++;
			
		int max = Integer.MIN_VALUE;
		int sum2 = 0;
		for(int i = 0; i < n; i++) {
			
			if(arr[i] > max) {
				
				max = arr[i];
			}
			
			if(arr[i] > 0) {
				
				sum2+=arr[i];
			}
		}
		
		if(max < 0) {
			
			result[index] = max;
		}
		
		else {
			
			result[index] = sum2;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt(); 
		input.nextLine();
		
		for(int i = 0; i < testCases; i++) {
			
			int size = input.nextInt();
			
			int[] arr = new int[size];
			
			for(int j = 0; j < size; j++) {
				
				arr[j] = input.nextInt();
			}
			
			int[] result = maxSubArray(arr);
						
			for(int k = 0; k < result.length; k++) {
				
				System.out.print(result[k] + " ");
			}
			
			System.out.println();
		}
		
		input.close();
	}	
}
