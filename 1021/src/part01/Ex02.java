package part01;

import java.io.*;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("org.mp4"); // 자바소스와 같은 폴더에 만들것.
		OutputStream out = new FileOutputStream("cpy.mp4"); // 자동으로 생성된다.
		
		int copyByte = 0;
		int bData;
		long start = System.currentTimeMillis();
		while (true) {
			bData = in.read();	// 한번에 1byte씩
			if (bData == -1)	// 읽기 에러
				break;
			out.write(bData);
			copyByte++;
		}
		long end = System.currentTimeMillis();
		in.close();
		out.close();
		
		System.out.printf("복사된 바이트 크기 : %d\n", copyByte);
		System.out.printf("경과 시간 : %.3f\n", (end - start) * 0.001);
	}
}
