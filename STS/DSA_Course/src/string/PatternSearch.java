package string;

public class PatternSearch {

	public static void main(String[] args) {
		
		
		String txt = "Geeks";
		
		String pat = "ks";
		
		boolean b = search(pat , txt);
		System.out.println(b);

	}
	
	  static boolean search(String pat, String txt)
	    {
	        
	        for(int i = 0;i <= txt.length() - pat.length(); i++)
	        {
	         String str = txt.substring(i , pat.length()+i);
	         
	         System.out.println(str);
	         if(str.equals(pat))
	         return true;
	        }
	        
	        return false;
	    }

}
