package part1;

class Orange {
	int sugarContent; // 당분 함량

	public Orange(int sugar) {
		sugarContent = sugar;
	}

	public void showSugarContent() {
		System.out.println("당도: " + sugarContent);
	}
}
//제네릭 클래스 < >  => T 가 오렌지 인 클래스가 하나 만들어짐. , 타입만 정하면 얼마든지 클래스 만들 수 있다.
class FruitBox<T> { 
	T item; //모든 객체를 참조가능
	
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}

public class ObjectBaseFruitBox {
	public static void main(String[] args) {
		FruitBox<String> fBox1 = new FruitBox<String>();
		fBox1.store("사과");
		String org1 = fBox1.pullOut();
		System.out.println(org1);
		
		FruitBox<Orange> fBox2 = new FruitBox<Orange>();
		fBox2.store(new Orange(10));
		Orange org2 = (Orange) fBox2.pullOut();
		org2.showSugarContent();
	}
}