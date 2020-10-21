package dsa.self.paced;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
		
		int n =5;
		
		n = sumOfNNaturalNumbers(n);
		
		System.out.println(n);

	}

	private static int sumOfNNaturalNumbers(int n) {
		
		
		return n*(n + 1)/2;
	}

}
