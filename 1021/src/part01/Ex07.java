package part01;

import java.io.*;

public class Ex07 {
	public static void main(String[] args) {
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream("output.txt");
			fileOutputStream.write(65);
			fileOutputStream.write(66);
			fileOutputStream.write(67);
		}
		catch (IOException e) {
			System.out.printf("%s\n", e);
			e.printStackTrace();
		}
		finally {	// 생략가능 : Ex08
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				System.out.printf("%s\n", e);
				e.printStackTrace();
			}
		}
		
		System.out.printf("정상종료\n");
	}
}
