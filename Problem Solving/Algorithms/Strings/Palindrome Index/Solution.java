import java.util.Scanner;

public class Solution {

	public static int palindromeIndex(String s) {

		if (isPalindrome(s)) {

			return -1;
		}

		int n = s.length();
		for (int i = 0; i < n / 2; i++) {

			if (s.charAt(i) != s.charAt(n - i - 1)) {

				if (isPalindrome(new StringBuilder(s).deleteCharAt(i).toString())) {

					return i;
				}

				else if (isPalindrome(new StringBuilder(s).deleteCharAt(n - i - 1).toString())) {

					return n - i - 1;
				}
			}
		}

		return -1;
	}

	public static boolean isPalindrome(String s) {

		return new StringBuilder(s).reverse().toString().equals(s);
	}

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);

		int testCases = input.nextInt();

		input.nextLine();

		while (testCases > 0) {

			String str = input.nextLine();

			System.out.println(palindromeIndex(str));

			testCases--;
		}

		input.close();
	}
}