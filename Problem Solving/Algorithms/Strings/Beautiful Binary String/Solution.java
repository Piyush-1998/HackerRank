import java.util.Scanner;

public class Solution {

	public static int beautifulBinaryString(String b, int n) {

		StringBuilder s = new StringBuilder(b);

		int count = 0;
		String str = "010";
		for (int i = 0; i < n - 2; i++) {

			if (s.charAt(i) == '0') {

				if (s.substring(i, i + 3).toString().equals(str)) {

					s.setCharAt(i + 2, '1');
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		input.nextLine();

		String str = input.nextLine();

		System.out.print(beautifulBinaryString(str, n));

		input.close();
	}
}
