package part1;
	
class Data{
	private int num;
	public Data(int num) {
		this.num=num;
	}
	public Data adder(int n) {
		this.num+=n;
		return this;  // 기존데이터에서 새로 만들지 않고 차곡차곡 쌓을 때 현재 진행중인 작업 this를 리턴할 것
	}
	public int getNum() {
		return num;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Data data=new Data(10);
//		data.adder(10);
//		data.adder(20);
//		data.adder(20);
//		data.adder(10).adder(20).adder(20) // <<이런 형식은 체이닝
		data.adder(10).adder(20).adder(20);// 체이닝
		System.out.println(data.getNum()); //20
	}
}
