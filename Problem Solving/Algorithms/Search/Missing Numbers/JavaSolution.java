import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	// using sorting
	public static Set<Integer> missingNumbers(int[] arr1, int arr2[]) {

		Set<Integer> result = new HashSet<Integer>();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int j = 0;
		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] != arr2[j]) {

				result.add(arr2[j]);
				i--;
			}
			j++;
		}

		for (int i = j; i < arr2.length; i++) {

			result.add(arr2[i]);
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int[] firstArr = new int[n];

		for (int i = 0; i < n; i++) {

			firstArr[i] = input.nextInt();
		}

		int m = input.nextInt();

		int[] secondArr = new int[m];

		for (int i = 0; i < m; i++) {

			secondArr[i] = input.nextInt();
		}

		List<Integer> result = new ArrayList<Integer>(missingNumbers(firstArr, secondArr));

		Collections.sort(result);

		for (int num : result) {

			System.out.print(num + " ");
		}

		input.close();
	}
}
