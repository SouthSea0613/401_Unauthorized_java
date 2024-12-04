package part1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {
	public static void main(String[] args) throws FileNotFoundException {
		//jdk7부터 auto close지원
		//write시 기존 데이터 삭제후 새로 쓴다.
		FileOutputStream fos=new FileOutputStream("output.txt");
		try(fos){
		//try(FileOutputStream fos=new FileOutputStream("output.txt")) {
			fos.write(65); //하위1Byte씩
			fos.write(66); //하위1Byte씩
			fos.write(67); //하위1Byte씩
		}  catch (IOException e) {
			System.out.println(e); //클래스명, 예외메세지출력
			e.printStackTrace();
		}
//		finally {
//			try {
//				fos.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}//스트림종료, 소켓종료...
//		}
		//output.txt에서 byte 단위로 읽기
		FileInputStream fis=new FileInputStream("output.txt");
		
		try(fis){
				System.out.println((char)fis.read());  //A
				System.out.println((char)fis.read());  //B
				System.out.println((char)fis.read());  //C
				System.out.println(fis.read());  //에러-1
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("정상 종료");
	}
}
