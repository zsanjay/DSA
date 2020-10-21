package array;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {

	public static void main(String[] args) {
		
		int arr[] = {7,4,5,7,3};
		
		ArrayList<Integer> list = leaders(arr,arr.length);

		System.out.println(list);
	}

	public static ArrayList<Integer> leaders(int arr[], int n){
		
		
		 ArrayList<Integer> list =new ArrayList<>();
		 
		 
		int max = 0;
		for(int i=n-1;i > -1;i--)
		{
			if(max <= arr[i])
			{
				max = arr[i];
				list.add(max);
			}
		}
		
		Collections.reverse(list);
		
		return list;
	}
}
