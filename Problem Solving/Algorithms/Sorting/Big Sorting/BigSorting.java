import java.io.*;
import java.util.*;

public class BigSorting {

	// sort without converting to integer
	static class Checker implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {

			if (o1.length() == o2.length()) {

				return o1.compareTo(o2);
			}

			return o1.length() - o2.length();
		}
	}

	static String[] bigSorting(String[] unsorted) {

		Arrays.sort(unsorted, new Checker());

		return unsorted;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.nextLine();

		String[] unsorted = new String[n];

		for (int i = 0; i < n; i++) {

			unsorted[i] = scanner.next();
		}

		String[] result = bigSorting(unsorted);

		for (int i = 0; i < result.length; i++) {

			System.out.println(result[i]);
		}

		scanner.close();
	}
}
