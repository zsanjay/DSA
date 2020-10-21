package recursion;

public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {
		
		String a = "geeksforgeek";
		
		String str = removeAdjacentDuplicates(a,0,1,a.length());
		
		System.out.println(str);

	}

	private static String removeAdjacentDuplicates(String str,int i,int j, int len) {
		
		if(i == len || j == len)
			return str;
		
		if(str.charAt(i) == str.charAt(j))
			str = str.substring(0,i) + str.substring(j+1,str.length());
			
		
		len = str.length();
		i++;
		j++;
		
		return removeAdjacentDuplicates(str,i ,j ,len);
	}

}
