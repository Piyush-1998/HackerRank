import java.util.*;

public class Solution {

	static void kaprekarNumbers(int p, int q) {

		boolean invalidRange = true;
		for (int i = p; i <= q; i++) {

			if (isKaprekarNumber(i)) {

				System.out.print(i + " ");
				invalidRange = false;
			}
		}

		if (invalidRange) {

			System.out.print("INVALID RANGE");
		}
	}

	static boolean isKaprekarNumber(int num) {

		long squareOfNum = (long) num * num;

		String str = String.valueOf(squareOfNum);

		String firstPart = str.substring(0, str.length() / 2);

		String secondPart = str.substring(str.length() / 2, str.length());

		int firstNum = (firstPart.isEmpty()) ? 0 : Integer.parseInt(firstPart);
		int secondNum = (secondPart.isEmpty()) ? 0 : Integer.parseInt(secondPart);

		if (firstNum + secondNum == num) {

			return true;
		}

		return false;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int p = scanner.nextInt();

		int q = scanner.nextInt();

		kaprekarNumbers(p, q);

		scanner.close();
	}
}
