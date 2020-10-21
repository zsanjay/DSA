package stack;

import java.util.ArrayList;

public class SortStackUsingAnother {

	public static void main(String[] args) throws Exception{
	
		Stack stack = new Stack();
		
		stack.push(5);
		stack.push(9);
		stack.push(4);
		stack.push(7);
		stack.push(8);
		stack.push(1);
		stack.push(12);
		
		
		stack = sort(stack, new Stack());
		
		stack.printStack();
		
	}

	private static Stack sort(Stack stack, Stack stack2) throws Exception {
		
		while(!stack.isEmpty())
		{
			int element = stack.pop();
			
			if(stack2.isEmpty())
				stack2.push(element);
			else
			{
				while(!stack2.isEmpty() && stack2.peek() > element)
				{
					stack.push(stack2.pop());
				}
				
				stack2.push(element);
			}
		}
		
		return stack2;
		
	}

}


class Stack
{
	int arr[];
	
	int top = -1;
	
	public Stack()
	{
		this.arr = new int[10];
	}
	
	public void push(int element) throws Exception
	{
		if(top < arr.length-1)
		arr[++top] = element;
		else
			throw new Exception("Stack Overflow Error");
	}
	
	
	public int pop() throws Exception
	{
		if(top == -1)
			throw new Exception("Stack Underflow");
		
		return arr[top--];
	}
	
	public int peek() throws Exception
	{
		if(top == -1)
			throw new Exception("Stack Underflow");
		
		return arr[top];
	}
	
	public int size()
	{
		return arr.length;
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public void printStack()
	{
		for(int a=0;a<=top;a++)
			System.out.print(arr[a]+" ");
		
		System.out.println();
	}
}