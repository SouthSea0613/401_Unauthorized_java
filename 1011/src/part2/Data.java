package part2;

public class Data {
	private int num1;
	private int num2;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public Data(int i, int j) {
		//생성자 : 인스턴스 변수 초기화용
		this.num1 = i;
		this.num2 = j;
	
	}

	public void showData() {
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		
	}

	
}
