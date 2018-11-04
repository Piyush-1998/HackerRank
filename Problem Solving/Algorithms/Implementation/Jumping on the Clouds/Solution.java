import java.io.*;
import java.util.*;

public class Solution {

	static int jumpingOnClouds(int[] c) {

		int jumps = 0;
		for (int i = 0; i < c.length - 1;) {

			if (i < c.length - 2 && c[i + 2] == 0) {

				jumps++;
				i += 2;
			}

			else {

				jumps++;
				i += 1;
			}
		}

		return jumps;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] c = new int[n];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {

			c[i] = Integer.parseInt(cItems[i]);
		}

		int result = jumpingOnClouds(c);

		System.out.print(result);

		scanner.close();
	}
}
