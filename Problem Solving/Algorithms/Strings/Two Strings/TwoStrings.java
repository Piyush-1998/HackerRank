import java.io.*;
import java.util.*;

public class TwoStrings {

	static String twoStrings(String s1, String s2) {

		String letters = "abcdefghijlkmnopqrstuvwxyz";

		for (Character ch : letters.toCharArray()) {

			if (s1.contains(ch.toString()) && s2.contains(ch.toString())) {

				return "YES";
			}
		}

		return "NO";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int q = scanner.nextInt();
		scanner.nextLine();

		System.out.println();
		for (int qItr = 0; qItr < q; qItr++) {

			String s1 = scanner.nextLine();

			String s2 = scanner.nextLine();

			String result = twoStrings(s1, s2);

			System.out.println(result);
		}

		scanner.close();
	}
}
