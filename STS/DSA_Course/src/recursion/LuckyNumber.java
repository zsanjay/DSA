package recursion;

public class LuckyNumber {
	
	static int counter = 2;

	public static void main(String[] args) {
		
		System.out.println(isLucky(5));
		

	}

	private static boolean isLucky(int n) {
		

        if(counter > n) 
            return true; 
        if(n%counter == 0) 
            return false;       
   
        // calculate next position of input no 
        n -= n/counter; 
     
        counter++; 
        return isLucky(n); 
	}

}
