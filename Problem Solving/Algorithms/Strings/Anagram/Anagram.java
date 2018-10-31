import java.io.*;
import java.util.*;

public class Anagram {

	static int anagram(String s) {

		// check base case
		if (s.length() % 2 != 0) {

			return -1;
		}

		int[] letters = new int[26];

		String first = s.substring(0, s.length() / 2);
		String second = s.substring(s.length() / 2, s.length());

		for (char ch : first.toCharArray()) {

			if (ch >= 'a' && ch <= 'z') {

				letters[ch - 'a']++;
			}
		}

		for (char ch : second.toCharArray()) {

			if (ch >= 'a' && ch <= 'z') {

				letters[ch - 'a']--;
			}
		}

		int count = 0;
		for (int i : letters) {

			if (i != 0) {

				count += Math.abs(i);
			}
		}

		return count / 2;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int q = scanner.nextInt();

		scanner.nextLine();

		for (int qItr = 0; qItr < q; qItr++) {

			String s = scanner.nextLine();

			int result = anagram(s);

			System.out.println(result);
		}

		scanner.close();
	}
}
