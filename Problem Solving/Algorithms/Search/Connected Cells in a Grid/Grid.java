import java.util.Scanner;

public class Grid {

	int rows;
	int columns;
	int[][] grid;

	Grid(int n, int m) {

		this.rows = n;
		this.columns = m;
		grid = new int[rows][columns];
	}

	public void setCell(int x, int y, int data) {

		grid[x][y] = data;
	}

	public void printGrid() {

		for (int i = 0; i < grid.length; i++) {

			for (int j = 0; j < grid[i].length; j++) {

				System.out.print(grid[i][j] + " ");
			}

			System.out.println();
		}
	}

	public int maxRegion() {

		int maxRegion = 0;
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {

				if (grid[i][j] == 1) {

					maxRegion = Math.max(maxRegion, maxRegionUtil(i, j));
				}
			}
		}

		return maxRegion;
	}

	public int maxRegionUtil(int x, int y) {

		if (x < 0 || x >= rows || y < 0 || y >= columns || grid[x][y] == 0) {

			return 0;
		}

		grid[x][y] = 0;

		return 1 + maxRegionUtil(x - 1, y) + maxRegionUtil(x - 1, y - 1) + maxRegionUtil(x, y - 1)
				+ maxRegionUtil(x + 1, y) + maxRegionUtil(x + 1, y + 1) + maxRegionUtil(x, y + 1)
				+ maxRegionUtil(x - 1, y + 1) + maxRegionUtil(x + 1, y - 1);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int rows = input.nextInt();
		int columns = input.nextInt();

		Grid grid = new Grid(rows, columns);

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {

				grid.setCell(i, j, input.nextInt());
			}
		}

		System.out.println(grid.maxRegion());

		// grid.printGrid();

		input.close();
	}
}
