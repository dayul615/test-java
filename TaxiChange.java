//사용자가 입력한 요금과 받은 돈의 차이를 계산해 잔돈을 출력하는 프로그램
package eaxm;

import java.util.Scanner;

public class TaxiChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fare = sc.nextInt();   // 요금
        int paid = sc.nextInt();   // 받은 돈

        System.out.println(paid - fare); // 잔돈 출력

        sc.close();
    }
}