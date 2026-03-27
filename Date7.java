import java.util.Scanner;

public class Date7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 공원 개수 입력
        System.out.println("공원 개수:");
        int parks = in.nextInt();

        // 병원 수 입력
        System.out.println("병원 수:");
        int hospitals = in.nextInt();

        // 범죄율 입력
        System.out.println("범죄율(숫자 작을수록 안전):");
        int crime = in.nextInt();

        // 조건 판단
        boolean isGoodCity = (parks >= 5) && (hospitals >= 3) && (crime <= 2);

        System.out.println("살기 좋은 도시인가요? " + isGoodCity);
    }
}