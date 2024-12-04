package Part1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			//javaPro ------- a.txt 데이터 이동 통로 Stream(우에서 좌) 스트림을 쓰면 닫아줘야해.
			fis=new FileInputStream("a.txt");
			try {
				int ch=fis.read();
				return;
				//System.out.println("ch: "+(char)ch); //인트 로 가져왔는데, char 로 형 변환. / 이 예시 포인트는 흐름=try안에 또 있는것.
			} catch (IOException e) {
				System.out.println("read 예외");
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally { //옵션임 써도 되고 ~ / 예외가 발생하든 안 하든 무조건 실행.
			try {
				if(fis!=null)
					fis.close();
				System.out.println("close 성공");
			} catch (IOException e) {
				System.out.println("close 예외 발생");
				e.printStackTrace();
			} //스트림 종료,닫기
			System.out.println("무조건 실행 영역");
		}
		
		System.out.println("정상 진행...");
	}

}
