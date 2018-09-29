import java.util.Scanner;

public class Solution {
	
	public static int maximizingXor(int left, int right) {
		
		int max = 0;
		for(int i = left; i <= right; i++) {
			
			for(int j = left; j <= right; j++) {
				
				if((i ^ j) > max) {
					
					max = i ^ j;
				}
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int left = input.nextInt();
		int right = input.nextInt();
		
		System.out.print(maximizingXor(left, right));
		
		input.close();
	}
}
