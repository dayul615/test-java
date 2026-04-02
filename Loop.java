package dateClass;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 24 , b = 48;
		int r;
		int gcd = 1;
		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
			
		}
		System.out.println("최대공약수: " + a);
	}

}
