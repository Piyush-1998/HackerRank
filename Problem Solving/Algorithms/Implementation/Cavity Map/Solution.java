import java.util.*;

public class Solution {

	static char[][] cavityMap(String[] str) {

		char[][] grid = new char[str.length][str.length];

		for (int i = 0; i < str.length; i++) {

			for (int j = 0; j < str[i].length(); j++) {

				grid[i][j] = str[i].charAt(j);
			}
		}

		for (int i = 0; i < grid.length; i++) {

			for (int j = 0; j < grid[i].length; j++) {

				if (i >= 1 && i < grid.length - 1 && j >= 1 && j < grid[i].length - 1) {

					int curr = grid[i][j] - '0';
					int top = grid[i - 1][j] - '0';
					int bot = grid[i + 1][j] - '0';
					int left = grid[i][j - 1] - '0';
					int right = grid[i][j + 1] - '0';

					if (curr > top && curr > bot && curr > left && curr > right) {

						grid[i][j] = 'X';
					}
				}
			}
		}

		return grid;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scanner.nextInt();
		scanner.nextLine();

		String[] grid = new String[n];

		for (int i = 0; i < n; i++) {
			String gridItem = scanner.nextLine();
			grid[i] = gridItem;
		}

		char[][] result = cavityMap(grid);

		for (int i = 0; i < result.length; i++) {

			for (int j = 0; j < result[i].length; j++) {

				System.out.print(result[i][j]);
			}

			System.out.println();
		}

		scanner.close();
	}
}
