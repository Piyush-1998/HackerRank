import java.util.*;

public class Solution {
    
	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        HashSet<Integer> uniqueSet = new HashSet<Integer>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int num = in.nextInt();

            deque.add(num);
            uniqueSet.add(num);

            if(deque.size() == m) {

                int element = deque.remove();

                if(uniqueSet.size() > max) {

                    max = uniqueSet.size();
                }

                if(!deque.contains(element)) {

                    uniqueSet.remove(element);
                }
            }       
        }
        
        in.close();
        System.out.println(max);
    }
}
