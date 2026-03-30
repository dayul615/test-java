package eaxm;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("운동 번호를 입력하세요 (1~4): ");
        int exercise = in.nextInt();

        if (exercise == 1) {
            System.out.println("푸쉬업 - 가슴/팔 운동");
        } else if (exercise == 2) {
            System.out.println("스쿼트 - 하체 운동");
        } else if (exercise == 3) {
            System.out.println("플랭크 - 코어 운동");
        } else if (exercise == 4) {
            System.out.println("런닝 - 유산소 운동");
        } else {
            System.out.println("없는 운동입니다.");
        }
    }
}