package stack;

import java.util.HashMap;
import java.util.Map;

public class InfixToPostfix {

	public static void main(String[] args) {
		
		
		String postfix = infixToPostfix("a+b*(c^d-e)^(f+g*h)-i");
		
		System.out.println(postfix);
		
		postfix = infixToPostfix("A*(B+C)/D");
		
		System.out.println(postfix);

	}

	private static String infixToPostfix(String s) {
		
		
		java.util.Stack<Character> stack = new java.util.Stack<>();
		String result = "";
		
		Map<Character,Integer> map = new HashMap<>();
		
		map.put('^', 3);
		map.put('*', 2);
		map.put('/', 2);
		map.put('+', 1);
		map.put('-', 1);
		
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(Character.toLowerCase(ch) >= 97 && Character.toLowerCase(ch) <= 122)
				result += ch;
			else if(map.containsKey(ch) && stack.isEmpty())
				stack.push(ch);
			else if(map.containsKey(ch))
			{
				if(map.containsKey(stack.peek()) && map.get(ch) > map.get(stack.peek()))
				stack.push(ch);
				else
				{
					while(!stack.isEmpty() && stack.peek()!= '(' && stack.peek()!= ')' && map.get(ch) <= map.get(stack.peek()))
						result += stack.pop();
					
					stack.push(ch);
				}
			}
			else if(ch == '(')
				stack.push(ch);
			else if(ch == ')')
			{
				while(stack.peek() != '(')
					result += stack.pop();
				
				stack.pop();
			}
				
		}
		
		while(!stack.isEmpty())
			result += stack.pop();

		return result;
	}

}
