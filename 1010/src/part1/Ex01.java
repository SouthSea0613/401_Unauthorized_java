package part1;

class Data{
	private int num;
	public Data(int num) {
		this.num=num;
	}
	
	public Data adder(int n) {
		num+=n;
		return this; //this가 현재 진행중인 거 알지? 근데 리턴 뒤에 디스를 쓸 생각을 어찌 하지? 아니 정확히는 디스 는 못 오는줄 앎
	}
	
	public int getNum() {
		return num;
	}	
}

public class Ex01 {
	public static void main(String[] args) {
		Data data=new Data(10);
		data.adder(10).adder(20).adder(20); //체이닝 (연속해서)
		System.out.println(data.getNum()); //20
	}
}
