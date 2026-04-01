package dateClass;

import java.util.Scanner;

public class Year {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연도를 입력하세요: ");
        int year = sc.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = sc.nextInt();

        int lastDay;

        switch (month) {
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    lastDay = 29;
                } else {
                    lastDay = 28;
                }
                break;
            case 4: case 6: case 9: case 11:
                lastDay = 30;
                break;
            default:
                lastDay = 31;
                break;
        }

        System.out.println(year + "년 " + month + "월의 마지막 날은 " + lastDay + "일입니다.");
        
        sc.close();
	}

}
