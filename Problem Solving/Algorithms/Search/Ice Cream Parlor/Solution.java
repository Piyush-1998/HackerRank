import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	public static int[] icecreamParlor(int money, int[] arr) throws Exception {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {

				return new int[] { map.get(arr[i]), i };
			}

			else {

				map.put(money - arr[i], i);
			}
		}

		throw new Exception("No sum found");
	}

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);

		int testCases = input.nextInt();

		while (testCases > 0) {

			int money = input.nextInt();

			int size = input.nextInt();

			int[] prices = new int[size];

			for (int i = 0; i < size; i++) {

				prices[i] = input.nextInt();
			}

			int[] result = icecreamParlor(money, prices);

			for (int i = 0; i < result.length; i++) {

				System.out.print(result[i] + 1 + " ");
			}

			System.out.println();

			testCases--;
		}

		input.close();
	}
}
