package part1;

public class Ex02 {

	public static void main(String[] args) {
		//1번 실행예
//		operation(10, 3); //call(호출)
		//덧셈 결과: 13
		//뺄셈 결과: 7
		//나눗셈 결과: 3
		//나머지 결과: 1
		
		//2번 실행예
//		abs(10,3);
//		abs(3,10);
		// 두 수의 차의 절대값: 7
		// 두 수의 차의 절대값: 7
		
		//3번 실행예
//		double cirRound = 2.4;
//		double cirArea = 2.4;
//		showMyInfo(cirRound, cirArea);
//		System.out.println("원 둘레:"+cirRound(2.4));
//		System.out.println("원 넓이:"+cirArea(2.4));
		//원 둘레: 2.4*2*3.14 (xx.xx)
		//원 넓이: 2.4*2.4*3.14 (xx.xx)
		
		//4번 실행예
//		for(int i=2; i<11; i++) {
//			if(isEven(i)) {
//				System.out.println(i+"는 짝수");
//			}
//		}
		//2는 짝수, 4는 짝수, 6는 짝수, 8는 짝수, 10는 짝수
//	}
		
		
		
		
		
		
	//예제
//		divide(4,2);  //A번
//		divide(4,0);
		System.out.println(add(3,4)+5); //B번
		
		
		
		
		
		
	//4번
//	private static boolean isEven(int i) {
//		if(i%2==0) {
//			return true;
//		}
//		return false;  //else 굳이 없어도 이렇게 가능. 짝수면 어차피 위 리턴에서 종료 아니면 아래서 종료
		
		//return i%2==0; 이것도 가능.. 간단하게 차피 불린이라 TorF
//	 }


//3
//	private static double cirArea(double r) {
//		
//		return r*r~;
//	}
//
//	private static String cirRound(double r) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	//2
//	private static void abs(int i, int j) {
//		if(i<j) {
//			System.out.println(j-i);
//		} else{
//			System.out.println(i-j);
//		}
		//int result = (i>j)? i-j : j-i;
		//System.out.println("두 수 차의 절대값은"+result);
		
		//int result;
		//if(i>j) {
			//result=i-j;
		//}else {
			//result=j-i;
	}
//B번
	private static int add(int i, int j) {
//		System.out.println("덧셈 결과: "+(i+j));
		return i+j;
		
	}
//A번
	private static void divide(int i, int j) {
		if(j==0) {
			System.out.println("0으로 나눌수 없어요");
			return;
		}
		System.out.println("나눗셈 결과: "+(i/j));
		
	}

	//3
//	private static void showMyInfo(double cirRound, double cirArea) {
//	System.out.println("원 둘레:"+(cirRound*2*3.14));
//	System.out.println("원 넓이:"+(cirArea*2.4*3.14));
	
	

	//1
//	private static void operation(int i, int j) {
//		System.out.println("덧셈 결과: "+(i + j));
//		System.out.println("뺄셈 결과"+(i - j));
//		System.out.println("나눗셈 결과"+(i / j));
//		System.out.println("나머지 결과"+(i % j));
		
	}
//	}


