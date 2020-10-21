package stack;

import java.util.Stack;

public class CelebrityProblem {

	public static void main(String[] args) {
		
		
		int arr[] = {0 ,1 ,0 ,0 ,0 ,0 ,0 ,1 ,0};
		
		int n = 3;
		
		int matrix[][] = new int[n][n];
		
		int j = 0;
		
		for(int i=0;i < arr.length; i++)
		{
			matrix[j][i%3] = arr[i];
			
			if(i%3 == 2)
				j++;
		}
		
		
	int id = getId(matrix , n);
	
	System.out.println(id);

	}

	private static int getId(int[][] matrix, int n) {
		
		java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
		
		for(int person=0 ; person < n;person++)
		stack.push(person);
		
		while(stack.size() > 1)
		{
			int i = stack.pop();
			int j = stack.pop();
			
			if(matrix[i][j] == 1)
			stack.push(j);
			else if(matrix[i][j] == 0)
			stack.push(i);
			
		}
		
		int x = 0;
		if(stack.isEmpty())
			return -1;
		else
			x = stack.pop();
			
		boolean checkCelebrity = true;
		
		for(int i=0; i < n;i++)
		{
			if(i != x)
			{
				if(matrix[x][i] != 0)
				checkCelebrity = false;
				
				if(matrix[i][x] != 1)
				checkCelebrity = false;
					
			}
		}
		
		if(!checkCelebrity)
		return -1;
		
		
		return x;
	}

}
