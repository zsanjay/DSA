package stack;

import java.util.HashMap;
import java.util.Map;

public class ParenthesisChecker {

	public static void main(String[] args) {
		
		System.out.println(isBalanced("{([])}"));
		System.out.println(isBalanced("([]"));
		
	}
	
	
	public static boolean isBalanced(String brackets)
	{
        
        Map<Character, Character> map = new HashMap<>();
        
        map.put('{','}');
        map.put('(',')');
        map.put('[',']');
        
        java.util.Stack<Character> stack = new java.util.Stack<>();
        
        for(int i=0; i< brackets.length(); i++)
        {
            Character bracket = brackets.charAt(i);
            
            if(stack.isEmpty())
            stack.push(bracket);
            else
            {
               Character closed =  map.get(stack.peek());
               
               if(closed != null && closed == bracket)
               stack.pop();
               else
               stack.push(bracket);
            }
            
        }
        
        return stack.isEmpty();
    
	}

}
