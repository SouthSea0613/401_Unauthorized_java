package part02;

class Person extends Object{	// 예시용
	
}

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	/*
	@Override
	public String toString() {
		// return getClass().getName() + "@" + Integer.toHexString(hashCode());
		return author + " : " + title;
	}
	*/
	
	@Override	// 자동완성
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
}

// 모든 클래스는 항상 Object를 직간접적으로 상속 > Object의 메소드를 재활용 및 재정의 가능
public class Ex01 {
	private static void fct(Object obj) {
		obj.toString();
	}
	
	public static void main(String[] args) {
		Object ex01 = new Ex01();
		Object ex02 = new int[5];	// 뭐가올지 예측 불가능할때 사용 > 만능이지만 에러가
		
		fct(new Ex01());
		fct(new int[5]);
		fct(new Person());
		
		Book book = new Book("파우스트", "요한 볼프강 폰 괴테");
		System.out.printf("%s\n", book.toString());	// .string이랑 아무것도 안붙는거랑 똑같음
		System.out.printf("%s\n", book);
		
		System.out.println((new String("Hello")).toString());
	}
}
