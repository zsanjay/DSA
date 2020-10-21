package recursion;

public class TowerOfHanoi {

    public static long moves;

    public void toh(int N, int from, int to, int aux) {
        
    	moves++;
    	if(N == 1)
    	{
    		System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
    		return;
    	}
    	else
    	{
    	toh(N-1,from,aux,to);
    	System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
    	toh(N-1,aux,to,from);
    	
    	}
    	
    }
    
	public static void main(String[] args) {
		

		new TowerOfHanoi().toh(3, 1, 3, 2);
		System.out.println(moves);
	}

}
