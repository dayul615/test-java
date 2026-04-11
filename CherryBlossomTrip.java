//벚꽃 보러 갈지 말지(날씨에 따라) 판단하는 간단한 프로그램
package eaxm;

public class CherryBlossomTrip {
    public static void main(String[] args) {
        String plan = "벚꽃보러간다";
        boolean isRaining = false;

        if (plan.equals("벚꽃보러간다")) {
            if (isRaining) {
                System.out.println("비 와서 다음에 가자");
            } else {
                System.out.println("봄 나들이 출발");
            }
        } else {
            System.out.println("집에 있기");
        }
    }
}