	package part01;

// interface는 보통 업무를 위해 사용
public class Ex01 {
	public static void main(String[] args) {
		Print pp = new PrintPaper();	// PrintPaper pp = new PrintPaper();
		pp.print("nothing");
		pp.show("nothing");
		pp.delete("nothing");
	}
}
