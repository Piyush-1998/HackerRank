import java.io.*;
import java.util.*;

public class Partition {

	static LinkedList<Integer> partition(int[] arr) {

		int pivot = arr[0];

		LinkedList<Integer> left = new LinkedList<>();
		LinkedList<Integer> right = new LinkedList<>();

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > pivot) {

				right.add(arr[i]);
			}

			else {

				left.add(arr[i]);
			}
		}

		left.add(pivot);

		for (int i = 0; i < right.size(); i++) {

			left.add(right.get(i));
		}

		return left;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.nextLine();

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            
        	int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        LinkedList<Integer> result = partition(arr);

        for (int i = 0; i < result.size(); i++) {

        	System.out.print(result.get(i));

            if (i != result.size() - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
