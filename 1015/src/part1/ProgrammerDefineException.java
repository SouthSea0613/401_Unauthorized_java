package part1;

import java.util.Scanner;

//필수 예외가 발생할 경우 try-catch 쓰던지 throw 로 던지던지 둘중 하나하기
//간단한 코딩 테스트 할땐 throw 로 던지고 , 좀 더 정교한 코드를 짜고 예외처리할땐 try-catch 쓰기
//throw 로 예외를 던지면 JVM이 예외처리 해줌, 하지만 프로그램이 멈춤
public class ProgrammerDefineException{
	public static void main(String[] args) {
		System.out.print("나이를 입력하세요: ");
		try{
		int age=readAge(); //3.throws에 의해 이동된 예외처리 포인트
		System.out.println("당신은 "+age+"세입니다.");
		}
		catch(AgeInputException e) {//4.예외 처리 코드
		System.out.println(e.getMessage()); //e.printStackTrace(); 변경해 볼것.
		}
		System.out.println("next...");
		}
		//AgeInputException는 던져버린다
		public static int readAge() throws AgeInputException { // 복수, 여러개 던질수도 있음 , // try-catch 가 없어서 때려서 호출한쪽으로 던짐
			//던질때 호출한쪽으로 던질거임 , main 메소드 쪽으로
		Scanner keyboard=new Scanner(System.in);
		int age=keyboard.nextInt();
		if(age<0){
		//AgeInputException excpt=new AgeInputException();
		throw new  AgeInputException(); //1.예외가 발생한 지점 명시. // 단수, 하나만 던질거임
		}
		return age;
	}

}
