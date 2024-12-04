package part1;

import java.util.Calendar;

public class Ex01 {
	public static void main(String[] args) {
//		Calendar cal=Calendar.getInstance(); //new가 되지 않으면 메소드로 인스턴스 생성(팩토리)
	Print pp=new PrintPaper(); //부모타입의 인터페이스로도 구현 가능
		for(int i=0; i<3; i++)
			pp.print("aaaaaaaaa");
			pp.show("bbbbbbbbb");
	}
}