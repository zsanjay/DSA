package dsa.self.paced;


//Find the maximum product of two distinct numbers in a sequence of non-negative integers.
import java.io.*;
import java.util.*;
 
public class MaxPairwiseProduct {

	//int arr[] = {5,6,2,7,7,4};
	
    public static void main(String[] args) {
    	
		FastScanner scanner = new FastScanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println(getMaxPairwiseProduct1(numbers));
		 
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

	private static int getMaxPairwiseProduct(int[] arr) {
		
		int max = 0 ,secondMax=0;
		
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j] >= max )
			{
				secondMax = max;
				max = arr[j];
			}
			
		}
		
		return max * secondMax;
	}
	
    static long getMaxPairwiseProduct1(int[] numbers) {
    	
    	Arrays.sort(numbers);
    	
    	int length = numbers.length;
    	
    	long a = numbers[length-1];
    	
    	long b = numbers[length-2];

    	long c = a * b;
    	
        return c;
    }

}
