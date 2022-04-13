import java.util.Scanner;
public class Apple {
	public static void main ( String args[] ){
		Scanner scan = new  Scanner(System.in);
		
		System.out.print("사과의 갯수: " );
		int apple = scan.nextInt();
		
		int ct = apple/2;
		
		System.out.println("철수에게 줄 사과 갯수는: " + ct );

		int dg = ct/2;
		System.out.println("영희에게 줄 사과 갯수는: " + dg );

		int at = (apple-ct)-dg;
		System.out.println("민수에게 줄 사과 갯수는: " + at );
	}
}