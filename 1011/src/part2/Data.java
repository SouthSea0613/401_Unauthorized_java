package part2;

public class Data {
	private int num1;
	private int num2;
	
	
	
	public int getNum1() { //num1에 10 저장 (초기화 같은 복사)
		return num1;
	}
	public void setNum1(int num1) { //내가 입력하는값 복사 
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}

	
	
	
	public Data(int num1, int num2) {
		//생성자: 인스턴스 변수 초기화.
		this.num1=num1;
		this.num2=num2;
		
	}

	public void showData() {
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		
	}
}