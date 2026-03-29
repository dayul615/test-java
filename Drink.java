package eaxm;

import java.util.Scanner;

public class Drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 (1~4): ");
		int drink = in.nextInt();
		
		if (drink == 1) {
			System.out.println("아메리카노  - 3000원");
		} else if (drink == 2) {
			System.out.println("초코라떼  - 4500원");
		} else if (drink == 3) {
			System.out.println("아메리카노  - 4000원");
		} else if (drink == 4) {
			System.out.println("녹차  - 3500원");
		} else {
			System.out.println("없는 메뉴입니다.");
		}
	}

}
