package part01;

public class Ex02 {
	// 1. 인스턴스 변수
	private String name;
	private final int NUMBER;	// final 상수변수화
	// 2. 클래스 변수(적게 사용) : 클래스당 1개만 할당되는 변수 > 이 함수를 사용하는 모든 객체 전체해당
	public static final String SCHOOL = "인천대학교";	// 권장방법
	
	// 생성자는 인스턴스 변수 초기화용
	public Ex02(String name, int NUMBER) {
		this.name = name;
		this.NUMBER = NUMBER;
		// this.school = school;
	}
	
	// 1. 인스턴스 메소드(함수) : 인스턴스와 관련된 동작
	public void showInfo() {
		System.out.printf("%s\n", name);
		System.out.printf("%d\n", NUMBER);
		System.out.printf("%s\n", SCHOOL);
	}
	
	// 2. 클래스 메소드(함수) : 인스턴스와 관련되지 않은 동작
	public static void showTitle() {
		// System.out.printf(name);	// static변수가 아니라 오류남
		System.out.printf("아침밥을 먹었는데 10시반에 배가고프다.\n");
		System.out.printf("%s\n", SCHOOL);
		// showInfo();	// 인스턴스 메소드이므로 오류발생
	}
}
