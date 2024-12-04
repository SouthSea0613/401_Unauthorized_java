package part01;

public class Ex01 {
	public static double pow(double a, int b) {
		double result = 1;
		for (int i = 0; i < b; i ++) {
			result *= a;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.printf("%f", pow(2.5, 3));
	}
}
