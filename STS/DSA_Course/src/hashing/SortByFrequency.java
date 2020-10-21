package hashing;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortByFrequency {

	public static void main(String[] args) {
		
		int arr[] = {9,9,9,2,5};


    HashMap<Integer,Integer> map = new HashMap<>();
    HashMap<Integer,Integer> temp = new HashMap<>();
    for(int a : arr)
    {
        if(map.containsKey(a))
        map.put(a , map.get(a)+1);
        else
        map.put(a , 1);
    }
    
   temp = sortByValue(map);
   
   for(Map.Entry<Integer,Integer> entry : temp.entrySet())
   {
         int count = entry.getValue();
          
          while(count > 0)
          {
              System.out.print(entry.getKey()+" ");
              count--;
          }
   }
   
}
public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) 
{ 
    
    List<Map.Entry<Integer, Integer> > list = 
           new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet()); 

    
    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
        public int compare(Map.Entry<Integer, Integer> o1,  
                           Map.Entry<Integer, Integer> o2) 
        { 
        	return  o1.getValue() >= o2.getValue() ? -1 : 1;
        } 
    }); 
      
    
    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
        public int compare(Map.Entry<Integer, Integer> o1,  
                           Map.Entry<Integer, Integer> o2) 
        { 
        	return  o1.getKey() < o2.getKey() && o1.getValue() == o2.getValue() ? -1 : 1;
        } 
    }); 
    
    
    HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
    for (Map.Entry<Integer, Integer> aa : list) { 
        temp.put(aa.getKey(), aa.getValue()); 
    } 
    return temp; 
} 

}
