package part01;

public class PrintImpl implements Print{

	@Override
	public void print(int num) {
		// TODO Auto-generated method stub
		System.out.printf("%d를 프린터로 출력\n", num);
	}

	@Override
	public void show(String str) {
		// TODO Auto-generated method stub
		System.out.printf("%s를 모니터로 출력\n", str);
	}
	
}
