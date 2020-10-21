package dsa.self.paced;

public class CheckKthBitSet {

	public static void main(String[] args) {
		
		int n = 4;
		
		int k = 2;
		
		System.out.println(1 << k);
		
		boolean b =  (n & (1 << k)) != 0;
		
		System.out.println(b);

	}

}
