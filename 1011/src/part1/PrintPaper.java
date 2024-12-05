package part1;
//클래스를 사용할땐 extends, 인터페이스를 사용할땐 implement

public class PrintPaper implements Print{

	@Override
	public void print(String str) {
		System.out.println("Paper에 " +str+ " 출력함");
	}

	@Override
	public void show(String str) {
		System.out.println("Paper에 " +str+ " show...");
		
	}

}
