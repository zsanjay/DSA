package string;

import java.util.HashMap;
import java.util.Map;

public class KeyTyping {

	public static void main(String[] args) {
		
		String str = "geeksquiz";
		
		Map<Character , String> hm = new HashMap<>();
		
		/*map.put(2, "ABC");
		map.put(3, "DEF");
		map.put(4, "GHI");
		map.put(5, "JKL");
		map.put(6, "MNO");
		map.put(7, "PQRS");
		map.put(8, "TUV");
		map.put(9, "WXYZ");*/
		
		hm.put('a', "2");
		hm.put('b', "2");
		hm.put('c', "2");
		hm.put('d', "3");
		hm.put('e', "3");
		hm.put('f', "3");
		hm.put('g', "4");
		hm.put('h', "4");
		hm.put('i', "4");
		hm.put('j', "5");
		hm.put('k', "5");
		hm.put('l', "5");
		hm.put('m', "6");
		hm.put('n', "6");
		hm.put('o', "6");
		hm.put('p', "7");
		hm.put('q', "7");
		hm.put('r', "7");
		hm.put('s', "7");
		hm.put('t', "8");
		hm.put('u', "8");
		hm.put('v', "8");
		hm.put('w', "9");
		hm.put('x', "9");
		hm.put('y', "9");
		hm.put('z', "9");
		
		
		long res = findKeys(str, hm);
		
		System.out.println(res);

	}

	private static long findKeys(String str, Map<Character,String> map) {
		
		StringBuilder output = new StringBuilder();
		
		for(int i=0; i<str.length(); i++ )
		{
			output.append(map.get(str.charAt(i)));
		}
		
		return Long.valueOf(output.toString());
	}

}
