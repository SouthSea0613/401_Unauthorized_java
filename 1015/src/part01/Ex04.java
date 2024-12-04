package part01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		
		
		//jdk 7이상 autocloseble의 close() 구현을 자동호출
		try (FileInputStream files = new FileInputStream("a.txt");) {
			try {
				int ch = files.read();
				System.out.printf("ch : %c\n", (char)ch);
			} 
			catch (IOException e) {
				// TODO: handle exception
				System.out.printf("read 예외");
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.printf("%s\n", e);
			System.out.printf("---\n");
			System.out.printf("%s\n", e.getMessage());
			System.out.printf("---\n");
			e.printStackTrace();
			System.out.printf("---\n");
		}
		finally {
//			try {
//				if (files != null) {
//					files.close();
//				}
//				System.out.printf("close 성공\n");
//			} 
//			catch (IOException e) {
//				// TODO Auto-generated catch block
//				System.out.printf("%s\n", e);
//				System.out.printf("---\n");
//				System.out.printf("%s\n", e.getMessage());
//				System.out.printf("---\n");
//				e.printStackTrace();
//				System.out.printf("---\n");
//			}
			System.out.printf("예외가 발생 하던 안하던 무조건 실행하는 영역\n");
		}
		
		System.out.printf("nextline\n");
	}
}
