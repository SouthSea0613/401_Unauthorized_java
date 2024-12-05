package part2;

public class PrintImpl  implements Print{

	@Override
	public void print(int a) {
		System.out.println(a+"를 프린터로 출략");
		
	}

	@Override
	public void show(String str) {
		System.out.println(str+"를 모니터로 출력");
		
	}
	public void fct() { 
		System.out.println("fct1 fct2");
		
	}

	public void fct2() { 
		System.out.println("fct1 fct2");
	}
}
