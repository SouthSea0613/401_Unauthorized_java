package part01;

class Data {
	private int num;
	
	public Data(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public Data adder(int num) {
		this.num += num;
		return this;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Data data = new Data(0);
		data.adder(10).adder(20).adder(30);
		System.out.printf("%d\n", data.getNum());
	}
}
