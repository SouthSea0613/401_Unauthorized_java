package part1;

public class Ex03 {
	public static void main(String[] args) {
		//윤년의 조건
		//1. 4년 배수연도 마다 윤년
		//2. 100의 배수연도는 윤년
		//3. 400의 배수연도는 윤년
		int year=2000;
		//if (true || false || false) {
		//}
		//if(true && true && false) {
		//}
		//if (year%4==0 && year%100!=0 || year%400==0) {
		if (year%4==0) {
			if (year%100!=0 || year %400==0) {
				System.out.println(year+"년은 윤년입니다.");
			}else {
				System.out.println("윤년 아님");
			}
			}else {
			System.out.println(year+"년은 윤년이 아닙니다.");
		}
	}

}
