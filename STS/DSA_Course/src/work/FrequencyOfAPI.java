package work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfAPI {

//	public static void main(String[] args) throws IOException {
//		
//		String filePath = "/Users/sanjaysmacbook/Downloads/2020-04-06.catalina_1.out";
//		
//		BufferedReader reader = new BufferedReader(new FileReader(filePath));
//		
//		String line = reader.readLine();
//		
//		Map<String ,Integer> map = new HashMap<>();
//		
//		while(line != null)
//		{
//			if(line.contains("INFO com.unifyv4.ws.config.APIAuthAware"))
//			{
//				String content[] = line.split("-");
//				
//				String str[] = content[3].split(" ");
//				
//				String apiName = str[1];
//				
//				if(map.containsKey(apiName))
//				{
//					int count = map.get(apiName);
//					count++;
//					map.put(apiName, count);
//				}
//				else
//					map.put(apiName, 1);
//				
//			}
//			
//			line = reader.readLine();
//		}
//		
//		reader.close();
//		
//		
//		System.out.println(map.size());
//		
//		filePath = "/Users/sanjaysmacbook/Downloads/2020-04-06.catalina_2.out";
//		
//		reader = new BufferedReader(new FileReader(filePath));
//		
//		line = reader.readLine();
//		
//		while(line != null)
//		{
//			if(line.contains("INFO com.unifyv4.ws.config.APIAuthAware"))
//			{
//				String content[] = line.split("-");
//				
//				String str[] = content[3].split(" ");
//				
//				String apiName = str[1];
//				
//				if(map.containsKey(apiName))
//				{
//					int count = map.get(apiName);
//					count++;
//					map.put(apiName, count);
//				}
//				else
//					map.put(apiName, 1);
//				
//			}
//			
//			line = reader.readLine();
//		}
//		
//		reader.close();
//		
//		System.out.println(map.size());
//		
//		BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/sanjaysmacbook/Desktop/APIFrequency"));
//		map.forEach((key, value) -> {
//			
//			try {
//				writer.write(key +"= "+ value);
//				writer.newLine();
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		});
//		
//		writer.close();
//
//		
//	}
	
	
	
	
	public static void main(String[] args) throws IOException {
	
	String filePath = "/Users/sanjaysmacbook/Desktop/APIFrequency";
	
	BufferedReader reader = new BufferedReader(new FileReader(filePath));
	
	String line = reader.readLine();
	
	Map<Integer ,String> map = new TreeMap<>();
	
	while(line != null)
	{
		String str[] = line.split("=");
		
		int key = Integer.valueOf(str[1].trim());
		
		map.put(key, str[0]);
		
		line  = reader.readLine();
	}
	
	reader.close();
	
	
	BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/sanjaysmacbook/Desktop/APIFrequencySorted"));
	map.forEach((key, value) -> {
		
		try {
			writer.write(value +"= "+ key);
			writer.newLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	});
	
	writer.close();
	
	
	}

}
