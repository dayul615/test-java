package dateClass;

public class Scanner {
    public static void main(String[] args) {
        int sum1 = 0; 
        int sum2 = 0; 

      
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum1 += i; 
            } else {
                sum2 += i; 
            }
        }
        
        System.out.printf("1부터 10까지의 짝수 합은 %d이고, 홀수 합은 %d입니다", sum1, sum2);
    }
