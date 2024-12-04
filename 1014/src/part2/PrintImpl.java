package part2;

public class PrintImpl implements Print{

	@Override
	public void print(int a) {
		new PrintImpl();
		
		System.out.println(a+"를 프린터로 출력.");
	}

	@Override
	public void show(String str) {
		System.out.println(str+"를 모니터로 출력.");
	}
	
	public void fct1() {
		System.out.println("fct1 call");
	}
	public void fct2() {
		System.out.println("fct2 call");
	}

}
