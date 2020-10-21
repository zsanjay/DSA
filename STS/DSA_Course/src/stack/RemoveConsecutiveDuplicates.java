package stack;

public class RemoveConsecutiveDuplicates {

	public static void main(String[] args) {
		
		System.out.println(removePair("aaabbaaccd"));
		
	}
	
	public static String removePair(String str){
        
		java.util.Stack<Character> stack = new java.util.Stack<>();
        String res = "";
        String output = "";
        
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            
            if(stack.isEmpty())
                stack.push(ch);
            else if(stack.peek() == ch)
                stack.pop();
            else
                stack.push(ch);
            
        }
        
        if(stack.isEmpty())
        return res;
        
        while(!stack.isEmpty())
        res += stack.pop();
        
        for(int i=res.length()-1; i > -1; i--)
        output += res.charAt(i);
        
        return output;
        
    }

}
