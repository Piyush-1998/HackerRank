import java.util.*;

public class Solution {

	static int[] cutTheSticks(int[] arr) {

		int discards = 0;
		int n = arr.length;
		int index = 0;
		int[] stickCuts = new int[n + 1];
		stickCuts[index++] = n;
		while (discards != n) {

			discards = 0;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {

				if (arr[i] != 0 && arr[i] < min) {

					min = arr[i];
				}
			}

			for (int i = 0; i < n; i++) {

				if (arr[i] != 0) {

					arr[i] -= min;
				}

				if (arr[i] == 0) {

					discards++;
				}
			}

			stickCuts[index++] = n - discards;
		}

		return stickCuts;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scanner.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = scanner.nextInt();
		}

		int[] result = cutTheSticks(arr);

		for (int i = 0; i < result.length; i++) {

			if (result[i] != 0) {

				System.out.println(result[i]);
			}
		}

		scanner.close();
	}
}
