import java.io.*;
import java.util.*;

public class LonelyInteger {

	public static int lonelyinteger(int[] array) {

		int val = 0;
		for (int num : array) {

			val = val ^ num;
		}
		return val;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();

		scanner.nextLine();

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");

		scanner.close();

		for (int i = 0; i < n; i++) {

			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		int result = lonelyinteger(a);

		System.out.println(String.valueOf(result));
	}
}
