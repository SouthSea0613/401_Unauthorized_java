package part1;

class Data {
	private int num;

	public Data(int num) {
		this.num = num;
	}

	public Data adder(int n) {
		num += n;
		return this; // this 현재반환중인 참조값(원본), new 를 쓰면 카피본을 만들어 반환하는것
	}

	public int getNum() {

		return num;
	}

}

public class Ex01 {
	public static void main(String[] args) {
		Data data = new Data(10);
		data.adder(10).adder(20).adder(20);
		System.out.println(data.getNum()); // 20

	}

}
