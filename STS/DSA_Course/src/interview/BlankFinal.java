package interview;

public class BlankFinal {

	private final String s;
	
	
	public BlankFinal(String s)
	{
		this.s = s;
	}
	
	
	public BlankFinal()
	{
		s = "Sanjay";
	}
	
	
	public String getS()
	{
		return s;
	}
	
	
	public static void main(String[] args) {
		
		
		BlankFinal blank = new BlankFinal();
		
		System.out.println(blank.getS());

	}

}


