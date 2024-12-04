package part01;

import java.io.*;

public class Ex08 {
	public static void main(String[] args) {
		try (FileOutputStream fileOutputStream = new FileOutputStream("output1.txt")) {
			fileOutputStream.write(65);
			fileOutputStream.write(66);
			fileOutputStream.write(67);
		}
		catch (IOException e) {
			System.out.printf("%s\n", e);
			e.printStackTrace();
		}
		
		try {
			FileInputStream fileInputStream = new FileInputStream("output1.txt");
			System.out.printf("%d\n", fileInputStream.read());
			System.out.printf("%d\n", fileInputStream.read());
			System.out.printf("%d\n", fileInputStream.read());
			System.out.printf("%d\n", fileInputStream.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.printf("정상종료\n");
	}
}
