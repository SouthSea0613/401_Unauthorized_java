package part1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {
	public static void main(String[] args) throws FileNotFoundException {
		//jdk 7부터 auto close 지원
		try (FileOutputStream fos = new FileOutputStream("output.txt")) { //try안에 지역변수를 넣게 되면 자동으로 close 처리 지원 됨
			fos.write(65); //하위 1Byte씩
			fos.write(66); //하위 1Byte씩
			fos.write(67); //하위 1Byte씩
			fos.close();
		} catch (IOException e) {
			System.out.println(e);  // 클래스명, 예외메시지 출력
			e.printStackTrace();
		} //finally {
////			try {
////				fos.close();
////			} catch (IOException e) {
////				e.printStackTrace();
////			}
		//output.txt에서 byte 단위로 읽기
		 FileInputStream fis = new FileInputStream("output.txt");
		 try(fis) {
			 System.out.println((char)fis.read());
			 System.out.println((char)fis.read());
			 System.out.println((char)fis.read());
			 System.out.println(fis.read());
		 } catch (IOException e) {
			 System.out.println(e);
			 e.printStackTrace();
		 }
		System.out.println("정상 종료");
	}
}
