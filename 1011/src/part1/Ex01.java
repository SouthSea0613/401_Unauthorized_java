package part1;

import java.util.Calendar;

public class Ex01 {
	public static void main(String[] args) {
		Print pp=new PrintPaper(); //다형적변수 가능 
		for(int i=0; i<3; i++)
		pp.print("aaaaaaaa");
		pp.show("bbbbbbb");
			
		//pp.showInfo(); //에러남 인터페이스에 있는놈이 아님..
		
	}
}
