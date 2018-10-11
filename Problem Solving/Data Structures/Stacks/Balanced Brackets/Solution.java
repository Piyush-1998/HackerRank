import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static String isBalanced(String s) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {

				stack.push(s.charAt(i));
			}

			else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {

				// no starting bracket
				if (stack.isEmpty()) {

					return "NO";
				}

				// check for balanced bracket
				else if (s.charAt(i) == ')' && stack.peek() != '(') {

					return "NO";
				}

				else if (s.charAt(i) == '}' && stack.peek() != '{') {

					return "NO";
				}

				else if (s.charAt(i) == ']' && stack.peek() != '[') {

					return "NO";
				}

				stack.pop();
			}
		}

		if (stack.isEmpty()) {

			return "YES";
		}

		return "NO";
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int cases = input.nextInt();

		input.nextLine();

		for (int i = 0; i < cases; i++) {

			String str = input.nextLine();

			System.out.println(isBalanced(str));
		}

		input.close();
	}
}
