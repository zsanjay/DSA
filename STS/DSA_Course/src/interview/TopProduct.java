package interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class TopProduct {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		int testCases =Integer.valueOf(br.readLine());
		String salesLine = "";
		String sb = "";
		
		
		for(int i=0 ; i < testCases;i++)
		{
			
			Map<String , Integer> map = new TreeMap<>();
			int combinedNumber = Integer.valueOf(br.readLine());
			int max = 0;
			
			
			while(combinedNumber > 0)
			{
				salesLine = br.readLine();
				
				
				if(salesLine.equals("top"))
				{
					
					for(Map.Entry<String, Integer> entry:map.entrySet())
					{
						Integer unit = entry.getValue();
						
						if(max == unit)
							sb = entry.getKey()+" ";
						
					}
					
					
					System.out.println(sb);
					sb = "";
					
				}
				else
				{
					
				String product[] =	salesLine.split(" ");
				
				String p = product[0];
				
				int u  = Integer.valueOf(product[1]);
				
				if(map.containsKey(p))
				{
					Integer units = map.get(p);
					
					units = units + u;
					
					if(max < units)
						max = units;
					
					map.put(p, units);
				}
				else
				{
					if(max < u)
						max = u;
					
					map.put(p, u);
				}
					
				}
				
				
				combinedNumber--;
			}
			
			
		}
		
		

	}

}
