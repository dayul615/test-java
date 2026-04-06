// 피라미드 모양으로 별(*)을 출력하는 프로그램
package eaxm;

public class Star {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            
            // 공백
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 별
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}