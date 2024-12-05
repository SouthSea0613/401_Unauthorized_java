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
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}

	// @Override
//	public String toString() {
//		String str="";
//		str+=("title="+title);
//		str+="\tauthor="+author;
//		return str;
//	}
	public void showInfo() {
		System.out.println("title=" + title + ", author=" + author);
	}

}

//모든 클래스 Object를 직접,간접으로 상속,Object 메소드를 재활용,재정의 가능
public class Ex01 {
	public static void main(String[] args) {
		Object book = new Book("채식주의자", "한강");
		System.out.println(book);
		//book.showInfo();
		//System.out.println(new String("Hello"));
	}
}
