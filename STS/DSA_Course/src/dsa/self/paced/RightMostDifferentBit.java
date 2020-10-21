package dsa.self.paced;

public class RightMostDifferentBit {

	public static void main(String[] args) {
		
		
		int pos= posOfRightMostDiffBit(52,4);
		
		System.out.println(pos);
		

	}
	
	public static int posOfRightMostDiffBit(int m, int n) {
        
		if(m == n)
			return -1;
		
		
		int xor = m ^ n;
		
		
		int k =1;
		
		while((xor & 1) != 1)
		{
			xor = xor >> 1;
			k++;
		}
		
		
	    return k;        
	        
	}

}
