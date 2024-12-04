package part01;

public class PrintPaper implements Print{	// Print 구현
	// 다만 부모가 interface
	@Override
	public void print(String str) {
		// TODO Auto-generated method stub
		System.out.printf("%s print\n", str);
	}

	@Override
	public void show(String str) {
		// TODO Auto-generated method stub
		System.out.printf("%s show\n", str);
	}

	@Override
	public void delete(String str) {
		// TODO Auto-generated method stub
		System.out.printf("%s delete\n", str);
	}

}
