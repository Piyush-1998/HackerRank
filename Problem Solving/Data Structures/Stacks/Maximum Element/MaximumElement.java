import java.util.*;

public class MaximumElement {
    
    static int pushToStack(Stack<Integer> stack, int element, int currentMax) {
        
        stack.push(element);
        
        if(element > currentMax) {
            
            return element;
        }
        return currentMax;
    }
    
    static int popFromStack(Stack<Integer> stack, int currentMax) {
        
        int element = stack.pop();
        
        int maxElement = Integer.MIN_VALUE;
        
        if(stack.size() > 0) {
            
            if(element == currentMax) {

                Stack<Integer> tempStack = (Stack<Integer>) stack.clone();

                while(tempStack.size() > 0) {

                    int currentElement = tempStack.pop();

                    if(currentElement > maxElement) {

                        maxElement = currentElement;
                    }       
                }
                
                return maxElement;
            }
            else if(element < currentMax) {
                
                return currentMax;
            }
        } 

        return maxElement;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Stack<Integer> stack = new Stack<Integer>();
        
        int queries = scanner.nextInt();
        int maxElement = Integer.MIN_VALUE;

        for(int i = 0; i < queries; i++) {
        
            int choice = scanner.nextInt();
            
            if(choice == 1) {
                
                int element = scanner.nextInt();
                maxElement = pushToStack(stack, element, maxElement);
            }
            
            if(choice == 2) {
                
                maxElement = popFromStack(stack, maxElement);
            }
            
            if(choice == 3) {
                
                if(maxElement != Integer.MIN_VALUE) {
                    
                    System.out.println(maxElement);
                }
            }
        }
        scanner.close();
    }
}