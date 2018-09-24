import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] arr) {
        
        int start = 0;

        boolean[] visited = new boolean[arr.length];
        for(int i = 0; i < visited.length; i++) {
            
            visited[i] = false;
        }
    
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(start);
        
        while(stack.size() > 0) {
        
            int current = stack.pop();
            
            if (!visited[current]) {
                
                visited[current] = true;
            }
            
            if(current + leap >= arr.length || current >= arr.length - 1) {

                return true;
            }
            
            if(arr[current + leap] == 0 && !visited[current + leap]) {
                
                stack.push(current + leap);
            }

            if(current + 1 < arr.length && arr[current + 1] == 0 && !visited[current + 1]) {

                stack.push(current + 1);
            }
            
            if(current - 1 >= 0 && arr[current - 1] == 0 && !visited[current - 1]){

                stack.push(current - 1);
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}