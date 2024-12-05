package part2;

public class RectEqualsTest {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle(1, 2, 8, 9);
		Rectangle rec3 = new Rectangle(1, 20, 8, 9);
		rec1.showPosition();
		rec3.showPosition();
		if (rec1.equals(rec3))
			System.out.println("rec1과 rec3의 내용 정보는 같다.");
		else
			System.out.println("rec1과 rec3의 내용 정보는 다르다.");
	}
}
