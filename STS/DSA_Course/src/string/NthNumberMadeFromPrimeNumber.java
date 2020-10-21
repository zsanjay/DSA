package string;

import java.util.Stack;

public class NthNumberMadeFromPrimeNumber {

	public static void main(String[] args) {
		
		
		int number = findNthNumber(24);

	}

	private static int findNthNumber(int n) {
		
		
		String prime = "2357";
		int len = 0;
		int pLength = prime.length();
		double t = 0;
		double count = 0;
		Stack<Double> stack = new Stack<>();
		
		while(t < n)
		{
			stack.add(Math.pow(pLength, len));
			t = pLength * ((Math.pow(pLength, len) -1) /3);
			len++;
			System.out.println("t >>"+t);
		
			if(t < n)
				count = t;
		}
		len--;
		stack.pop();
		System.out.println(len);
		System.out.println(stack);
		System.out.println(count);
		
		
		while( count < n)
		{
			
		}
		
		
		
			
		
		
		return 0;
	}

}
