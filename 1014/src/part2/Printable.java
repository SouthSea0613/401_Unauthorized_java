package part2;

public class Printable implements Print {

	@Override
	public void print(int a) {
		new Printable();
		System.out.println(a+"를 예쁘게 프린터로 출력합니다아....ㅇ_<");
	}

	@Override
	public void show(String str) {
		System.out.println(str+"를 예쁘게 디스플레이로~~~ ㅇ_<");
		
	}
	

}
