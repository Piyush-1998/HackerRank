import java.util.*;

public class Solution {

	static String funnyString(String s) {

		StringBuilder copy = new StringBuilder(s);

		copy.reverse();

		int j = 1;
		for (int i = 1; i < s.length(); i++) {

			int diff1 = Math.abs(s.charAt(i) - s.charAt(i - 1));
			int diff2 = Math.abs(copy.charAt(j) - copy.charAt(j - 1));

			if (diff1 != diff2) {

				return "Not Funny";
			}

			j++;
		}

		return "Funny";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int q = scanner.nextInt();

		scanner.nextLine();

		while (q-- > 0) {

			String str = scanner.nextLine();

			System.out.println(funnyString(str));
		}

		scanner.close();
	}
}
