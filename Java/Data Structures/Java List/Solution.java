import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        List<Integer> list = new LinkedList<Integer>();
        
        for(int i = 0; i < n; i++) {
            
            int element = scan.nextInt();
            list.add(element);
        }
        
        int queries = scan.nextInt();
        
        for(int i = 0; i < queries; i++) {

            String operation = scan.next();
            int x = scan.nextInt();
            
            if(operation.equals("Insert")) {
                
                int y = scan.nextInt();
                list.add(x, y);
            }
            
            else if(operation.equals("Delete")) {
                
                list.remove(x);
            }
        }
        
        for(int i = 0; i < list.size(); i++) {
            
            System.out.print(list.get(i) + " ");
        }
        
        scan.close();
    }
}