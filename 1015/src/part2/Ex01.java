package part2;

class Book {
	private String title;
	private String author;

	public Book(String title, String author) {
		super(); // Object();
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {  //source > generate toString
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
//	@Override
//	public String toString() {
////		String str = "";
////		str += ("title= "+title);
////		str += "\nauthor= "+author;		
////		return str;
//		return "title = " + title + "\nauthor = " + author;
//	}
}

//모든 클래스 Object를 직접, 간접으로 상속, Object 메소드를 재활용, 재정의 가능
public class Ex01 {
	public static void main(String[] ars) {
		Book book = new Book("채식주의자", "한강");
		System.out.println(book);
//		System.out.println(book.toString()); 위와 같음
		System.out.println(new String("Hello"));
	}
}
