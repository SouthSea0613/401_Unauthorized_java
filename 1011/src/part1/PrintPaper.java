package part1;

public class PrintPaper implements Print {

	@Override
	public void print(String str) {
		System.out.println("Paper에 "+str+"출력함");
	}

	@Override
	public void show(String str) {
		System.out.println("Paper에 "+str+"show 출력함");
	} 
}
