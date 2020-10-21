package bitwise;

public class LeftShiftOperator {

	public static void main(String[] args) {
		
		
		int x =3;// 00....0011
		
		System.out.println(x << 1); // 0000...0110  = 6
		
		System.out.println(x << 2); // 000...1100 = 12
		
		int y =4;
		
		System.out.println(x << y);//00...110000 = 48
		 
		System.out.println(x << 30); //1100000....till 30 zeros
		
		
		x = -1;
		
		System.out.println(x << 1);
		
		// -1  = 2^32 -x all the 32 bits are 111.11111 after shift by 1 we get 11...1110 
		// i.e 2^ 32 -1 -1 = 2^32 - 2 so result is -2

	}

}
