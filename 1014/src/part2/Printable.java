package part2;

public class Printable implements Print {

	@Override
	public void print(int a) {
		System.out.println(a+"를 예쁘게 프린트");
		
	}

	@Override
	public void show(String str) {
		System.out.println(str+"를 예쁘게 모니터로~");
		
	}

}
