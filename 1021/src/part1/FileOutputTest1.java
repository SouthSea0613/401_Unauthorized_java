package part1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
		//jdk7 부터 auto close 지원
		//write 시 기존데이터 삭제 후 새로 쓴다
public class FileOutputTest1 {
	public static void main(String[] args) throws FileNotFoundException  {
		try ( FileOutputStream fos = new FileOutputStream("Output.txt")){
			fos.write(65); //하위 1Byte씩 
			fos.write(66); //하위 1Byte씩 
			fos.write(67); //하위 1Byte씩 
			fos.close(); // 마무리 작업
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
//			try {
//				fos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			} //스트림 종료, 소켓종료
		}
		FileInputStream fis = new FileInputStream ("output.txt");
		try (fis){
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
