package dsa.self.paced;

public class CountBitsFlipped {

	public static void main(String[] args) {
		
		int flippedBits = countBitsFlip(20,25);
		
		System.out.println(flippedBits);
		
	}
	
    public static int countBitsFlip(int a, int b){
        
        int count = 0;
        
        int xor = a ^ b;
        
        while(xor > 0)
        {
        	xor = xor & (xor -1);
        	count++;
        }
        	
        
        return count;
        
    }

}
