import java.util.Scanner;
public class Watermelon {
	public static void main ( String args[] ){
		Scanner scan = new  Scanner(System.in);
		
		System.out.print("반지름을 입력하세요: " );
		int tq = scan.nextInt();
		
		int qwf = tq * tq;
		double vd = 3.14;
		

		System.out.println("수박의 넓이는: "+qwf*vd );
	}
}