package Part2;

class Book {
	private String title;
	private String author;

	public Book(String title, String author) {
		super(); // Object();
		this.title = title;
		this.author = author;
	}

	@Override // 소스 투 스트링
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}

	// @Override //2
//	public String toString() {
//		return "title="+title+" \nauthor="+author;  // \n 줄바꿈
//	}
	public void showInfo() {
		System.out.println("title=" + title + ", author=" + author);

	}

}

//모든 클래스는 Object를 직접,간접으로 상속한다. Object 메소드를 재활용, 재정의 가능
public class Ex01 {
	public static void main(String[] args) {
		Book book = new Book("채식주의자", "한강"); // 객체를 만들었어, =Object book 도 가능.
		System.out.println(book); // 객체 참조값을 넣어줌 1
		book.showInfo(); // 사기꾼 눈엔 사기꾼만~ ((Book)book).showInfo 로 해야 해 Object book 이면~

		System.out.println(new String("Hello"));
		String str = "Hello";
		System.out.println(str);
	}
}