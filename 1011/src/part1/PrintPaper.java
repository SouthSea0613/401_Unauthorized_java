package part1;

public class PrintPaper implements Print {  //implements 구현하다 / 인터페이스 때 오버라이드 가능

	@Override
	public void print(String str) {
		System.out.println("Paper에"+str+"출력함");
		
	}

	@Override
	public void show(String str) {
		System.out.println("Paper에"+str+"show...");
		
	}

}
