import java.util.*;

public class MyQueue<E> {
        
    Stack<E> stack1;
    Stack<E> stack2;

    MyQueue() {

        stack1 = new Stack<E>();
        stack2 = new Stack<E>();
    }

    void enqueue(E element) {

        stack1.push(element);
    }

    E dequeue() {

        if(stack2.empty()) {

            while(!stack1.empty()) {

                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    E front() {
        
        if(stack2.empty()) {
            
            if(stack1.empty()) {
                
                throw new NoSuchElementException();
            }
            
            else {
                
                while(!stack1.empty()) {

                    stack2.push(stack1.pop());
                }
            }    
        }
        
        return stack2.peek();
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        MyQueue<Integer> queue = new MyQueue<Integer>();
        
        int queries = scanner.nextInt();
        
        for(int i = 0; i < queries; i++) {
            
            int option = scanner.nextInt();
            
            if(option == 1) {
                
                int element = scanner.nextInt();
                queue.enqueue(element);
            }
            
            else if(option == 2) {
                
                queue.dequeue();
            }
            
            else { // option == 3
                
                System.out.println(queue.front());
            }
        }    
        
        scanner.close();
    }
}
