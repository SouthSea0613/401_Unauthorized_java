package part1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) throws IOException {
			//javaPro ------------------ a.txt
			//        ------------------ 데이터 이동 통로 Stream, 
			//Stream 사용 후 잘 닫아주기
			
			FileInputStream  fis=null;
			//jdk 7 이상
			//AutoCloseable의 close() 구현한것을 자동 호출, finally 생략가능
			//try(FileInputStream fis = new FileInputStream ("a.txt")){
			try {
			fis = new FileInputStream("a.txt");
			try {
				int ch = fis.read();
				return;
				//System.out.println("ch : " + (char) ch);

			} catch (IOException e) {
				System.out.println("read 예외");
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 부재 예외발생");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			try {
				if (fis!=null)
					fis.close();
				System.out.println("close 성공");
			}catch (IOException e) {
				System.out.println("close 예외 발생");
					e.printStackTrace();
			}
			 //스트림 종료
			System.out.println("무조건 실행 영역");
		}

		System.out.println("정상 진행....");
		}
	}

