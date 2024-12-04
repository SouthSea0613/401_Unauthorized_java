package part1;

public class Ex03 {
	public static void main(String[] args) {
		//윤년조건
		//1. 4의 배수년도 마다 윤년
		//2. 100의 배수년도 아님
		//3. 400의 배수년도는 윤년
		int year=2100;
		//if((year%4==0 && year%100!=0) || year%400==0) {
		if(year%4==0) {
			if(year%100!=0 || year%400==0) {
				System.out.println(year+"년도 윤년입니다.");
			} else {
				System.out.println(year+"년은 윤년 아닙니다.");
			}
		}else {
			System.out.println(year+"년은 윤년 아닙니다.");
		}
	}
}
