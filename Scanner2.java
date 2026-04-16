package dateClass;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double a = in.nextDouble();
		double b = in.nextDouble();
		
		while(a <= b) {
			System.out.printf("%.2f",a);
			a += 0.01;
		}
	}
}