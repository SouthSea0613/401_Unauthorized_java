package part01;

class Orange {
	int sugarContent;
	
	public Orange(int sugar) {
		sugarContent = sugar;
	}
	
	public void showSugarContent() {
		System.out.printf("%d\n", sugarContent);
	}
}

// 제네릭 클래스 -> T가 orange인 class
class FruitBox<T> {
	T item;
	
	public void store(T item) {
		this.item = item;
	}
	
	public T pullOut() {
		return item;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		FruitBox<String> fBox1 = new FruitBox<>();
		fBox1.store("사과");
		System.out.printf("%s\n", fBox1.pullOut());
		
		FruitBox<Orange> fBox2 = new FruitBox<>();
		fBox2.store(new Orange(10));
		Orange org2 = (Orange)fBox2.pullOut();
		org2.showSugarContent();
	}
}
