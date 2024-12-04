package part01;

import java.io.*;

public class Ex15 {
	public static void main(String[] args) throws IOException {
		File myFile = new File("C:\\Users\\tksz0\\Desktop\\project\\java\\1021\\a.txt");
		if (myFile.exists()) {
			System.out.printf("a.txt 존재");
			FileInputStream fis = new FileInputStream(myFile);
		} else {
			System.out.printf("a.txt 찾을수 없음");
			myFile.createNewFile(); // 생성 > 근데 보통 쓸일 없음
		}

		File reDirectory = new File("C:\\Users\\tksz0\\Desktop\\project\\java\\1021\\src");
		if (reDirectory.exists() && reDirectory.isDirectory()) {
			
		} else {
			System.out.printf("C:\\Users\\tksz0\\Desktop\\project\\java\\1021\\src 폴더를 생성합니다.");
			reDirectory.mkdirs();	// 상위폴더까지 생성
			reDirectory.mkdir();	// 최하위만 생성
		}
	}
}
