import java.io.*;
import java.util.*;

public class SparseArrays {

	static int[] matchingStrings(String[] strings, String[] queries) {

		int[] foundStrings = new int[queries.length];

		for (int i = 0; i < queries.length; i++) {

			int currentTimes = 0;
			for (int j = 0; j < strings.length; j++) {

				if (queries[i].equals(strings[j])) {

					currentTimes++;
				}
			}
			foundStrings[i] = currentTimes;
		}

		return foundStrings;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int stringsCount = scanner.nextInt();
		scanner.nextLine();

		String[] strings = new String[stringsCount];

		for (int i = 0; i < stringsCount; i++) {
			String stringsItem = scanner.nextLine();
			strings[i] = stringsItem;
		}

		int queriesCount = scanner.nextInt();
		scanner.nextLine();

		String[] queries = new String[queriesCount];

		for (int i = 0; i < queriesCount; i++) {
			String queriesItem = scanner.nextLine();
			queries[i] = queriesItem;
		}

		scanner.close();

		int[] res = matchingStrings(strings, queries);

		for (int i = 0; i < res.length; i++) {

			System.out.println(res[i]);

			if (i != res.length - 1) {

				System.out.println();
			}
		}
	}
}
