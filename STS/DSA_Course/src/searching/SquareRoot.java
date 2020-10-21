package searching;

public class SquareRoot {

	public static void main(String[] args) {
		
		System.out.println(floorSqrt(12));

	}

	public static long floorSqrt(long x)
	 {
		
		if(x == 0 || x == 1)
			return x;
		
		long start = 1;
		long end = x;
		long ans = 0;
		
		while(start <= end)
		{
			
			long mid = (start + end) /2;
			
			if(mid * mid == x)
			return mid;
			
			if(mid * mid < x)
			{
				start = mid+1;
				ans = mid;
			}
			else
			{
				end = mid - 1;
			}
		}
		
		
		return ans;
	 }
}
