package string;

public class CaseSort {

	public static void main(String[] args) {
		
		
		String str = "srbDKi";
		
		System.out.println(caseSort(str));

	}

	public static String caseSort(String str) {
        
		
        char chArray[] = str.toCharArray();
        
		for(int i = 0; i < chArray.length; i++)
		{
			char ch = chArray[i];
			
			if(Character.isLowerCase(ch))
			{
				int j = i+1;
				int index = i;
				
				while(j < chArray.length)
				{
					if(chArray[j] >= 97 && chArray[j] < chArray[index])
					index = j;
					
					j++;
				}
				
				char temp = chArray[i];
				chArray[i] = chArray[index];
				chArray[index] = temp;
				
			}
			else if(Character.isUpperCase(ch))
			{

				int j = i+1;
				int index = i;
				
				while(j < chArray.length)
				{
					if(chArray[j] >= 65 && chArray[j] <= 90 && chArray[j] < chArray[index])
					index = j;
					
					j++;
				}
				
				char temp = chArray[i];
				chArray[i] = chArray[index];
				chArray[index] = temp;
				
			
			}
		}
		
		
        return new String(chArray);
    }
}
