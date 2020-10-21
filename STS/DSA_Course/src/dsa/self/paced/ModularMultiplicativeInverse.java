package dsa.self.paced;

import java.math.BigInteger;

public class ModularMultiplicativeInverse {

	public static void main(String[] args) {
		
		
		int res = modInverse(44,78);
		
		BigInteger bigInteger = modInverseUsingBigInteger(10,17);
		System.out.println(bigInteger.intValue());
		
		System.out.println(res);

	}

	private static BigInteger modInverseUsingBigInteger(int i, int j) {
		
		
		BigInteger b1 = new BigInteger(String.valueOf(i));
		
		BigInteger b2 = new BigInteger(String.valueOf(j));
		
		
	
		return b1.modInverse(b2);
	}

	private static int modInverse(int a, int m) {
		
		
	int sqrt=(int)Math.sqrt(m);
	
	System.out.println(sqrt);
		
		if(a >= m)
			return -1;
		
		int b = -1;
		
		for(int i=a+1;i<m;i++)
		{
			if((a*i)%m == 1)
			{
				b = i;
				break;
			}
		}
		
		
		return b;
			
		
	}

}
