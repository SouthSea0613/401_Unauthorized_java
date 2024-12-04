package exception;

//필수 예외클래스 
public class MenuNumException extends Exception {
	private int wrongNum;

	public MenuNumException(int num) {
		super("잘못된 메뉴 번호 입니다."); // getMessage()
		this.wrongNum = num;

	}

	public void showWrongNum() {
		System.out.println(wrongNum + "에 해당하는 선택은 존재하지 않습니다.");
	}

}
