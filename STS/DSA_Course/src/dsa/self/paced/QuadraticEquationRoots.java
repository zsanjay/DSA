package dsa.self.paced;

public class QuadraticEquationRoots {

	public static void main(String[] args) {
		
		findRoots(752,904,164);
		

	}

	private static void findRoots(int i, int j, int k) {
		
		
	int discriminant =	(j*j) - 4 * i * k;
	
	System.out.println(discriminant);
	
	if(discriminant < 0 )
		System.out.println("Imaginary");
	else
	{
		int sq = (int)Math.sqrt(discriminant);
		
		System.out.println(sq);
		
		double alpha = (-j + sq) / (2.0*i);
		
		double beta = (-j - sq) / (2.0*i);
		
		int al = (int)Math.floor(alpha);
		
		int be = (int)Math.floor(beta);
		
		System.out.println(al+" "+be);
	}
	
		
	}

}
