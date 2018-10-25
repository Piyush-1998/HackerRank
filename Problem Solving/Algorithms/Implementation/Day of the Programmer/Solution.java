import java.io.*;
import java.util.*;

public class Solution {

	static String dayOfProgrammer(int year) throws Exception {

		if (year == 1918) {

			return "26.09." + year;
		}

		else if (year >= 1700 && year < 1918) {

			if (year % 4 == 0) {

				return 12 + ".09." + year;
			}

			return 13 + ".09." + year;
		}

		else if (year > 1918 && year <= 2700) {

			if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {

				return 12 + ".09." + year;
			}

			return 13 + ".09." + year;
		}

		throw new Exception("Invalid input");
	}

	public static void main(String[] args) throws IOException, Exception {

		Scanner input = new Scanner(System.in);

		int year = input.nextInt();

		System.out.print(dayOfProgrammer(year));

		input.close();
	}
}
