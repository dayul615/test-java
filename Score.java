package eaxm;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = in.nextInt();
		
		if (score >= 90) {
			System.out.print("a");
		}
		else if (score >= 80) {
			System.out.print("b");
		}
		else if (score >= 70) {
			System.out.print("c");
		}
		else {
			System.out.print("f");
		}
	}

}
