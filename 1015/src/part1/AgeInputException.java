package part1;

//예외 클래스(필수) 정의 방법
public class AgeInputException extends Exception {
	//필드, 메소드 정의
	public AgeInputException() {
		super("유효하지 않은 나이가 입력되었습니다.");
	}

}
