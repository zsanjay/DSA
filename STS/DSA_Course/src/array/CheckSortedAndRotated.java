package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CheckSortedAndRotated {

	public static void main(String[] args) {
		
		int arr[] = {30 ,20, 10, 50, 35};
		
		checkSortedAndRotated(arr ,arr.length);

	}

	private static void checkSortedAndRotated(int[] arr, int length) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i : arr)
			list.add(i);
		
		
		int m =0,index=0 ,flag = 0;

		int temp[] = new int[length];
		int j = 0;
		
		if(arr[0] > arr[length-1])
		{
			m = Collections.min(list);
			index = list.indexOf(m);
			
			if(index == 0)
			{
				System.out.println("No");
				return;
			}
			
		}
		else
		{
			m = Collections.max(list);
			index = list.indexOf(m);
			
			if(index == length-1)
			{
				System.out.println("No");
				return;
			}
			
			flag = 1;
		}
		
		for(int i = index; i < length; i++)
			temp[j++] = arr[i];
		
		for(int i = 0; i < index; i++)
			temp[j++] = arr[i];
		
		int v = 0;
		if(flag == 1)
		{
			Collections.sort(list);
			Collections.reverse(list);
			
			for(int k : list)
				arr[v++] = k;
		}
		else
			Arrays.sort(arr);

		if(Arrays.equals(arr, temp))
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

}
