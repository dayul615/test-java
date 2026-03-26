package eaxm;

import java.util.Scanner;

public class Reason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		한 나라 == 수도 && 인구 >= 100만
//		연소득 >= 1억
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("수도입니까?(수도: 1 수도아님:0)");
		int isMetro = in.nextInt();
		System.out.println("인구(단위:)만");
		int people = in.nextInt();
		System.out.println("연소득(단위:)만");
		int money = in.nextInt();
		
		System.out.println(isMetro == 1 && people >= 100 && money >= 100);
	}

} 