import java.util.*;

public class Solution {

	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

		int lastAnswer = 0;

		List<List<Integer>> seqList = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {

			seqList.add(new ArrayList<Integer>());
		}

		List<Integer> result = new LinkedList<Integer>();

		for (int i = 0; i < queries.size(); i++) {

			int type = queries.get(i).get(0);
			if (type == 1) {

				int x = queries.get(i).get(1);
				int y = queries.get(i).get(2);
				int index = (x ^ lastAnswer) % n;

				seqList.get(index).add(y);
			}

			else if (type == 2) {

				int x = queries.get(i).get(1);
				int y = queries.get(i).get(2);
				int index = (x ^ lastAnswer) % n;
				int size = seqList.get(index).size();

				lastAnswer = (int) seqList.get(index).get(y % size);

				result.add(lastAnswer);
			}
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int seq = input.nextInt();

		int queries = input.nextInt();

		List<List<Integer>> list = new ArrayList<List<Integer>>();

		for (int i = 0; i < queries; i++) {

			int type = input.nextInt();

			int x = input.nextInt();

			int y = input.nextInt();

			list.add(new ArrayList<Integer>());
			list.get(i).add(type);
			list.get(i).add(x);
			list.get(i).add(y);
		}

		List<Integer> result = dynamicArray(seq, list);

		for (int i = 0; i < result.size(); i++) {

			System.out.println(result.get(i));
		}

		input.close();
	}
}
