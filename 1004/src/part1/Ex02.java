
package part1;

public class Ex02 {
	public static void main(String[] args) {
		//1번 실행예 
		operation(10,3);
		//덧셈결과, 뺄셈결과, 나눗셈 결과, 나머지 결과
		
		//2번 실행예
		abs(10,3);
		abs(3,10);
		//두 수의 차의 절대값 : 7
		//두 수의 차의 절대값 : 7
		
		//3번 실행예
		System.out.println("원 둘레 : "+ cirRound(2.4));
		System.out.println("원 넓이 : "+ cirArea(2.4));
		System.out.println("---------------------");
		//원 둘레: 2.4*2*3.14
		//원 넓이: 2.4*2.4*3.14 계산 결과
		
		//4번 실행예
		for(int i=2; i<11; i++) {
			if(isEven(i)) {
				System.out.println(i+"는 짝수");
			}
	}
//			divide(4,2);
//			divide(4,0);
		System.out.println(add(3,4)+5);
		
	}//main end
	private static int add(int i, int j) {
		//System.out.println("덧셈 결과 : "+(i+j));
		return i+j;
	}
	private static void divide(int i, int j) {
		if(j==0) {
			System.out.println("0으로 나눌수 없음");
			return;
		}
		System.out.println("나눗셈 결과 : "+(i/j));
		
	}
	private static boolean isEven(int i) {// 4번문제
		if(i%2==0) {
			return true;
		}
			return false;
		}
	private static double cirArea(double d) {// 3번 문제
		
		return d*d*Math.PI;
	}

	private static double cirRound(double d) {
		
		return d*2*Math.PI;
	}

	private static void abs(int a, int b) {//2번문제
//		int result;
//		if (a>b) {
		   //result=a-b;
//		}else {
		//result = b-a;
		//}
		int result = (a>b) ? a-b : b-a;
		System.out.println("두 수 차의 절대값은 : " +result);
	}
	private static void operation(int i, int j) { //1번문제
		System.out.println("덧셈결과 : "+ (i+j));
		System.out.println("뺄셈결과 : "+ (i-j));
		System.out.println("곱셈결과 : "+ (i*j));
		System.out.println("나눗셈결과 : "+ (i/j));
		System.out.println("나머지결과 : "+ (i%j));
		System.out.println("-------------------");
		
	}
}
