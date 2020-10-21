package dsa.self.paced;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		isPrime(2);
		isPrime(10);
		isPrime(1);
		isPrime(36);
		isPrime(17);

	}

	private static void isPrime(int n) {
		
		
		if(n <= 1)
			System.out.println("Number is not Prime");
		else
		{
		
		int sqrt = (int)Math.sqrt(n);
		int flag = 0;
		
		for(int i =2;i<=sqrt;i++) // i * i < N
		{
			if(n%i == 0)
			{
				flag = 1;
				break;
			}
		}
		
		if(flag == 1)
			System.out.println("The number is not prime");
		else
			System.out.println("The number is Prime");
		}
		
	}

}
