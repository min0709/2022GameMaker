import java.util.Scanner;
public class Apple {
	public static void main ( String args[] ){
		Scanner scan = new  Scanner(System.in);
		
		System.out.print("����� ����: " );
		int apple = scan.nextInt();
		
		int ct = apple/2;
		
		System.out.println("ö������ �� ��� ������: " + ct );

		int dg = ct/2;
		System.out.println("���񿡰� �� ��� ������: " + dg );

		int at = (apple-ct)-dg;
		System.out.println("�μ����� �� ��� ������: " + at );
	}
}