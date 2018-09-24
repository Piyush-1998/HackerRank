import java.util.*;

class Solution {
	
    static boolean isValidString(String str) {
        
        Stack<Character> stack = new Stack<>();
        
        if(str.charAt(0) == ')' || str.charAt(0) == '}' || str.charAt(0) == ']') {
            
            return false;
        }
        
        stack.push('1');
        
        for(int i = 0; i < str.length(); i++) {
            
            if(str.charAt(i) == '(') {
                
                stack.push(')');   
            }
            
            if(str.charAt(i) == '{') {
                
                stack.push('}');   
            }
            
            if(str.charAt(i) == '[') {
                
                stack.push(']');   
            }
            
            if(stack.size() == 0) {
            
                return false;
            }   
            
            if(str.charAt(i) == ')') {
                
                stack.pop();
            }
            
            if(str.charAt(i) == '}') { 
                
                stack.pop();
            }
            
            if(str.charAt(i) == ']') {
                
                stack.pop();
            }
        }
        
        if(stack.size() != 1) {
            
            return false;
        }
        
        return true;
    }
    
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input = sc.next();
            
            System.out.println(isValidString(input));
		}	
		
		sc.close();
	}
}