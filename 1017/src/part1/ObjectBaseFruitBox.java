package part1;

class Orange {
	int sugarContent; // 당분 함량

	public Orange(int sugar) {
		sugarContent = sugar;
	}

	public void showSugarContent() {
		System.out.println("당도 " + sugarContent);
	}
}

//제네릭 클래스 => 타입이 오렌지인 클래스가 생성 됨
class FruitBox<T> {
	T item; // Object item 으로 설정할 경우 모든 객체를 참조 가능

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
		String org1 = (String) fBox1.pullOut();
		System.out.println(org1);
		FruitBox<Orange> fBox2 = new FruitBox<Orange>();
		fBox2.store(new Orange(10));
//		fBox2.store("new Orange"); 
		Orange org2 = (Orange) fBox2.pullOut();
		org2.showSugarContent();
	}
}
