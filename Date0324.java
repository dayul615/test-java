package eaxm;

public class Date0324 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단");
            // 1부터 9까지 곱하기
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // 단이 바뀔 때 줄바꿈
        }
    }
	}

