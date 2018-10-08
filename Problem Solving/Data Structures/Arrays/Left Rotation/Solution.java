import java.util.Scanner;

public class Solution {

	public static int[] leftRotation(int[] arr, int rotations) {

		int[] result = new int[arr.length];

		int n = arr.length;
		for (int i = 0; i < n; i++) {

			result[(i + (n - rotations)) % n] = arr[i];
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int size = input.nextInt();
		int rotations = input.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {

			arr[i] = input.nextInt();
		}

		int[] result = leftRotation(arr, rotations);

		for (int i = 0; i < result.length; i++) {

			System.out.print(result[i] + " ");
		}

		input.close();
	}
}