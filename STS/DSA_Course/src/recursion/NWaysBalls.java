package recursion;

import java.util.Scanner;

public class NWaysBalls {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of balls:");
		
		int noOfBalls = sc.nextInt();
		
		System.out.println("Number of balls in the bag is "+noOfBalls);
		
		noOfBalls = ways(noOfBalls);
		
		System.out.println("Number of ways you can removing the balls from the bag are "+noOfBalls);

	}

	private static int ways(int noOfBalls) {
		
		if(noOfBalls == 1 || noOfBalls == 2)
			return noOfBalls;
		else
			return ways(noOfBalls - 1) + ways(noOfBalls - 2);
		
	}

}
