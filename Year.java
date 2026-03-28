package eaxm;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("연도를 입력하세요: ");
		int year = in.nextInt();
		System.out.println("윤년 여부: " + (year % 4 == 0 && year % 100 != 0 || year % 400 == 0));
	}

}
