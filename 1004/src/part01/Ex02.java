package part01;

public class Ex02 {
	// quiz01
	private static void operation(int a, int b) {
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		return;	// 종료 지점 표시
	}

	// quiz02
	private static void abs(int a, int b) {
		// System.out.println(a > b ? a - b : b - a);	// if 쓰려다가 3항연산자
		System.out.println(Math.abs(a - b));
		return;	// 종료 지점 표시
	}
	
	// quiz03
	private static double cirRound(double r) {
		return 2 * Math.PI * r;	// 2*pi*r
	}
	
	// quiz03
	private static double cirArea(double r) {
		return Math.PI * r * r;	// pi*r^2
	}
	
	// quiz04
	private static boolean isEven(int a) {
		return a % 2 == 0;
	}

	public static void main(String[] args) {
		/* quiz01
		 * 덧셈 결과
		 * 뺄셈 결과
		 * 나눗셈 결과
		 * 나머지 결과
		 */
		operation(10, 3);
		
		/* quiz02
		 * 두수의 절대값
		 */
		abs(10, 3);
		abs(3, 10);
		
		/* quiz03
		 * return 원 둘레
		 * return 원 넓이
		 */
		System.out.println("원 둘레 : " + cirRound(2.4));
		System.out.println("원 둘레 : " + cirArea(2.4));
		
		/* quiz04
		 */
		for (int i = 2; i < 11; i++) {
			if(isEven(i)) {
				System.out.println(i + "는(은) 짝수");
			}
		}
	}
}
