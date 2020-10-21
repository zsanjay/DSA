package dsa.self.paced;


//The Square root of a number and it will be prime.
public class ExactlyThreeDivisors {

	public static void main(String[] args) {
		
		System.out.println(exactly3Divisors(6));
		System.out.println(exactly3Divisors(10));
		System.out.println(exactly3Divisors(30));
		
		
		
		

	}

	private static int  exactly3Divisors(int n) {
		
		int threeDivisors = 0;
		
		
		if(n <= 3)
			return threeDivisors;
		
		int sqrt =(int)Math.floor(Math.sqrt(n));
		
		
		for(int j=2;j<=sqrt;j++)
		{
			if(isPrime(j))
			{
				threeDivisors++;
			}
		}
		
		return threeDivisors;
	}

	private static boolean isPrime(int n) {
		
		int sqrt =(int)Math.sqrt(n);
		
		boolean prime = true;
		
		for(int i =2;i<=sqrt;i++)
		{
			if(n%i ==0)
			{
				prime = false;
				break;
			}
			
		}
		
		return prime;
	}

}
